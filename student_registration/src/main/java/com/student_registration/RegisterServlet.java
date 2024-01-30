package com.student_registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;


//import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	     request.getRequestDispatcher("WEB-INF/register.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String url = "jdbc:postgresql://localhost:5432/student_registration_db"; 
        String user = "postgres";
        String password = "ugarise1";


		try {
		    Class.forName("org.postgresql.Driver");
		    Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to the PostgreSQL server successfully.");

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(request.getParameter("date"));
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            int code = Integer.parseInt(request.getParameter("code"));
            int grade = Integer.parseInt(request.getParameter("grade"));
            String names = request.getParameter("name");
            String email = request.getParameter("email");
            String user_password = request.getParameter("pass");

            // Insert a record
            String insertQuery = "INSERT INTO students_info (student_code, name, dob, email, grade, password) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setInt(1, code);
                preparedStatement.setString(2, names);
                preparedStatement.setDate(3, sqlDate);
                preparedStatement.setString(4, email);
                preparedStatement.setInt(5, grade);
                preparedStatement.setString(6, user_password);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Record inserted successfully");

                    response.sendRedirect(request.getContextPath() + "/student_info");
                    	
                } else {
                    System.out.println("Insert operation failed");
                }
            }

        } catch (SQLException | ClassNotFoundException | ParseException e) {
            e.printStackTrace();
        }
	}
	

}