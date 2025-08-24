package service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import db.DBConnection;


public class StudentService {
	
	    Scanner sc = new Scanner(System.in);

	    // Add Student
	    public void addStudent() throws Exception {
	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter Student Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Course: ");
	        String course = sc.nextLine();

	        Connection c = DBConnection.connect();
	        String query = "INSERT INTO Student VALUES(?,?,?)";
	        PreparedStatement stmt = c.prepareStatement(query);
	        stmt.setInt(1, id);
	        stmt.setString(2, name);
	        stmt.setString(3, course);
	        stmt.executeUpdate();
	        System.out.println(" Student Data added successfully.");
	    }

	    // Update Student
	    public void updateStudent() throws Exception {
	        System.out.print("Enter Student ID to update: ");
	        int id = sc.nextInt();
	        sc.nextLine();
	        System.out.print("Enter new name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter new course: ");
	        String course = sc.nextLine();

	        Connection c = DBConnection.connect();
	        String query = "UPDATE Student SET name = ?, course = ? WHERE id = ?";
	        PreparedStatement stmt = c.prepareStatement(query);
	        stmt.setString(1, name);
	        stmt.setString(2, course);
	        stmt.setInt(3, id);
	        stmt.executeUpdate();
	        System.out.println(" Student Data updated successfully.");
	    }

	    // Delete Student
	    public void deleteStudent() throws Exception {
	        System.out.print("Enter Student ID to delete: ");
	        int id = sc.nextInt();

	        Connection c = DBConnection.connect();
	        String query = "DELETE FROM Student WHERE id = ?";
	        PreparedStatement stmt = c.prepareStatement(query);
	        stmt.setInt(1, id);
	        stmt.executeUpdate();
	        System.out.println(" Student Data deleted successfully.");
	    }

	    // View by ID
	    public void viewById() throws Exception {
	        System.out.print("Enter Student ID: ");
	        int id = sc.nextInt();

	        Connection c = DBConnection.connect();
	        String query = "SELECT * FROM Student WHERE id = ?";
	        PreparedStatement stmt = c.prepareStatement(query);
	        stmt.setInt(1, id);
	        ResultSet rs = stmt.executeQuery();

	        if (rs.next()) {
	            System.out.println("\n---- Student Details ----");
	            System.out.println("ID: " + rs.getInt("id"));
	            System.out.println("Name: " + rs.getString("name"));
	            System.out.println("Course: " + rs.getString("course"));
	            System.out.println("-------------------------");
	        } else {
	            System.out.println(" Student not found.");
	        }
	    }

	    // View All
	    public void viewAllStudents() throws Exception {
	        Connection c = DBConnection.connect();
	        String query = "SELECT * FROM Student";
	        PreparedStatement stmt = c.prepareStatement(query);
	        ResultSet rs = stmt.executeQuery();

	        System.out.println("\n---- Student List ----");
	        while (rs.next()) {
	            System.out.println("ID: " + rs.getInt("id"));
	            System.out.println("Name: " + rs.getString("name"));
	            System.out.println("Course: " + rs.getString("course"));
	            System.out.println("-------------------------");
	        }
	    }
	}



