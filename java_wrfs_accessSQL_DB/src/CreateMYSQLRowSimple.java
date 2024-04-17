
//package demo.mysql.java.connectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CreateMYSQLRowSimple {
	
	public static void main(String args[]){
		Connection con = null;
		PreparedStatement pst = null;
		
		int code = 1;
		String name = "Fiona Stalgis";
		String rank = "Fire Fighter";
		String experience = "Senior";
		
		//Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/winRfs_availibility";
		try {
			con = DriverManager.getConnection(url, "root","please");
			System.out.println("con = " + con);
			pst = con.prepareStatement("INSERT INTO status(name) VALUES(?)");
			System.out.println("con.prepareStatement");
			pst.setString(1, name);
			//System.out.println("executeUpdate()");
		} catch (SQLException ex) {
            Logger lgr = Logger.getLogger(CreateMYSQLRowSimple.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);
		} finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
			} catch (SQLException ex) {
				Logger lgr = Logger.getLogger(CreateMYSQLRowSimple.class.getName());
				lgr.log(Level.SEVERE, ex.getMessage(), ex);
			}
		}
	}
}