package utility;

import java.sql.*;

public class DatabaseConnection {
    final String JDBCDriver = "com.mysql.cj.jdbc.Driver";
    final String USERNAME = "root";
    final String PASSWORD = "qwertyuiop1.";
    final String URL = "jdbc:mysql://localhost/school";
    PreparedStatement prestat;
    ResultSet result;
    Statement state;
    Connection conn;

    public DatabaseConnection() throws SQLException, ClassNotFoundException{
        this.open();
    }

    private void open() throws SQLException, ClassNotFoundException{
        Class.forName(JDBCDriver);
        conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public ResultSet read(String sql) throws SQLException, ClassNotFoundException{
        state = conn.createStatement();
        result = state.executeQuery(sql);
        return result;
    }

    public PreparedStatement read(PreparedStatement sql) throws SQLException, ClassNotFoundException{
        prestat = conn.prepareStatement(String.valueOf(sql));
        prestat.executeUpdate();
        return prestat;
    }

    public boolean write(String sql) throws SQLException, ClassNotFoundException{
        state = conn.createStatement();
        state.executeUpdate(sql);
        return true;
    }

    public boolean write(PreparedStatement sql) throws SQLException, ClassNotFoundException {
        prestat = conn.prepareStatement(String.valueOf(sql));
        prestat.executeUpdate();
        return true;
    }

    private void close() throws SQLException, ClassNotFoundException {
        if (conn != null){
            conn.close();
        }
        if (state != null){
            state.close();
        }
        if (result != null) {
            result.close();
        }
        if (prestat != null) {
            prestat.close();
        }
    }
}
