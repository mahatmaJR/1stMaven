package logic;

import model.StudentDetail;
import utility.DatabaseConnection;

import java.sql.SQLException;

public class StudentLogic {

    StudentDetail student = new StudentDetail();
    DatabaseConnection connect;

    {
        try {
            connect = new DatabaseConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addStudent(int admNo, String fname, String lname, String address, String pname, int pnumber)
    throws SQLException, ClassNotFoundException{

        System.out.println("inside add student, working with: " +admNo+fname+lname);
        student.setAdmNo(admNo);
        student.setFname(fname);
        student.setLname(lname);
        student.setAddress(address);
        student.setPname(pname);
        student.setPnumber(pnumber);

        String sql = "INSERT INTO students(id, fname, lname, address, pname, pnumber) values ('"+admNo+"', '"+fname+"', " +
                "'"+lname+"', '"+address+"', '"+pname+"', '"+pnumber+"')";

        connect.write(sql);

    }

    public void addStudentFinanceRecord() throws SQLException, ClassNotFoundException {

        String sql = "INSERT INTO feepaid (admNo, fName, lName) SELECT id, fname, lname FROM students";
        connect.write(sql);
    }

    public void editStudent(int admNo) throws SQLException{

    }
}
