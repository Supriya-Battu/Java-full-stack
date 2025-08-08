package com.Jdbc;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.sql.*;

public class JdbcInsert {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/amazon",  // your DB name here
                    "root",
                    "root"); // empty password for XAMPP MySQL by default

            String query = "INSERT INTO employee (eid, ename, doj, pic, resume) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, 101);
            ps.setString(2, "Alice");
            ps.setDate(3, Date.valueOf("2023-06-01"));

            FileInputStream picFis = new FileInputStream("C:\\Users\\Rise\\Pictures\\Screenshots\\Screenshot (7).png");
            ps.setBinaryStream(4, picFis);

            FileInputStream resumeFis = new FileInputStream(
            	    "C:\\Users\\Rise\\Downloads\\Results of II B.Tech II Sem (R20,R19&R16) Supplementary Exams, Nov-2024.pdf");
            ps.setBinaryStream(5, resumeFis);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee inserted successfully");
            } else {
                System.out.println("Insertion failed");
            }

            picFis.close();
            resumeFis.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
