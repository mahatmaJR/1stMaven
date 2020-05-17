package logic;

import utility.DatabaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginLogic {
    public boolean login(String username, String password) throws SQLException, ClassNotFoundException {
        DatabaseConnection connect = new DatabaseConnection();

        String sql = "SELECT * FROM login where username = '"+username+"' and pass = '"+password+"'";
        ResultSet rs = connect.read(sql);
        if(rs.next())return true;
        else return false;
    }
}
