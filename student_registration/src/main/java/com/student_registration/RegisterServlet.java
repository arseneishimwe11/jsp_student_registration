package com.student_registration;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
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
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		 System.out.println("The codes here should work");
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

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Connected to the PostgreSQL server successfully.");

            int code = Integer.parseInt(request.getParameter("code"));
            int age = Integer.parseInt(request.getParameter("age"));
            String names = request.getParameter("name");
            String email = request.getParameter("email");
            String user_password = request.getParameter("pass");

            // Insert a record
            String insertQuery = "INSERT INTO students_info (student_code, name, age, email, password) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
                preparedStatement.setInt(1, code);
                preparedStatement.setString(2, names);
                preparedStatement.setInt(3, age);
                preparedStatement.setString(4, email);
                preparedStatement.setString(5, user_password);

                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Record inserted successfully");

                    // Set attributes to pass data to the next page
                    request.setAttribute("code", code);
                    request.setAttribute("names", names);
                    request.setAttribute("age", age);
                    request.setAttribute("email", email);

                    // Forward to the next page
                    RequestDispatcher dispatcher = request.getRequestDispatcher("displayData.jsp");
                    dispatcher.forward(request, response);

                } else {
                    System.out.println("Insert operation failed");
                }
            }

            // Retrieving records
            String selectQuery = "SELECT * FROM students_info";
            try (PreparedStatement preparedStatement = connection.prepareStatement(selectQuery)) {
                ResultSet resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    System.out.println("Code: " + resultSet.getInt("student_code") + ", Name: " + resultSet.getString("name") + ", " +
                            "Age: " + resultSet.getInt("age") + ", Email: " + resultSet.getString("email"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
	

}
