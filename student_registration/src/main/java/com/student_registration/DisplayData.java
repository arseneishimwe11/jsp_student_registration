package com.student_registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.RequestDispatcher;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Servlet implementation class DisplayData
 */
public class DisplayData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayData() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// Retrieving records
		String url = "jdbc:postgresql://localhost:5432/student_registration_db"; 
        String user = "postgres";
        String password = "ugarise1";
        
		try {
		    Class.forName("org.postgresql.Driver");
		    Connection connection = DriverManager.getConnection(url, user, password);
            
            String selectQuery = "SELECT * FROM students_info";
	        try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
	            ResultSet resultSet = preparedStatement.executeQuery();
	            while (resultSet.next()) {
	                System.out.println("Code: " + resultSet.getInt("student_code") + ", Name: " + resultSet.getString("name") + ", " +
	                        "Dob: " + resultSet.getDate("dob") + ", Grade: " + resultSet.getInt("grade") + ", Email: " + resultSet.getString("email"));
	                
	                // Set attributes to pass data to the JSP page
	                request.setAttribute("student_code", resultSet.getInt("student_code"));
	                request.setAttribute("name", resultSet.getString("name"));
	                request.setAttribute("dob", resultSet.getDate("dob"));
	                request.setAttribute("grade", resultSet.getInt("grade"));
	                request.setAttribute("email", resultSet.getString("email"));
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	        
	     // Forward to the JSP page
	        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/displayData.jsp");
            dispatcher.forward(request, response);
		} catch (SQLException | ClassNotFoundException e) {
        e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
