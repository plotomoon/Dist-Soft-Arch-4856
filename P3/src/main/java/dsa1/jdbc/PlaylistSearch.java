/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa1.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author cop4856
 */
public class PlaylistSearch {
     public static void main(String[] args) throws IOException, SQLException {
        Statement stmt = null;
        ResultSet rs = null;
        Connection conn = null;
        final String driverName = "com.mysql.cj.jdbc.Driver";
        final String dbURL = "jdbc:mysql://localhost:3306/mysql?serverTimezone=UTC&zeroDateTimeBehavior=convertToNull&user=root&password=mysql4me";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sql = "";
        while(!sql.contains("end")){
        System.out.print("Enter a Keyword for movie: ");    
        String keyword = reader.readLine();
        sql = "SELECT * from PlaylistAJC69 WHERE Keyword1 = \"" + keyword+ "\"" + " OR "+"Keyword2 = \"" + keyword+ "\""+ " OR "+"Keyword3 = \"" + keyword+ "\"";
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(dbURL);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.print(rs.getString(1));
                System.out.print(" " + rs.getString(2));
                System.out.print(" " + rs.getString(3));
                System.out.print(" " + rs.getString(4));
                System.out.println(" " + rs.getString(5));
            }
        // And now comes the fun part: Exception handling
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState:     " + e.getSQLState());
            System.out.println("VendorError:  " + e.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot load JDBC driver");
        } catch (Exception e) { // This is really the worst case...
            e.printStackTrace();
        } finally {
            try { // Did I mention I hate "try" in a "finally" clause...
                rs.close();
                stmt.close();
                conn.close();
            } catch (Exception e) {
                // Out of ideas! I give up...
            }
        }
    }
} 
}
