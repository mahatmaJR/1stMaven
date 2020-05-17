package logic;

import model.TeacherDetail;
import utility.DatabaseConnection;

import java.sql.SQLException;

/**
 * Created by lenovo on 3/14/2019.
 */
public class TeacherLogic {
    TeacherDetail teacher = new TeacherDetail();

    public void addTeacher(int tID, String fname, String lname, String address, int tnumber) throws
            SQLException, ClassNotFoundException{
        DatabaseConnection connect = new DatabaseConnection();

        teacher.settID(tID);
        teacher.setFname(fname);
        teacher.setLname(lname);
        teacher.setAddress(address);
        teacher.setTnumber(tnumber);

        String sql = "INSERT INTO teachers(id, fname, lname, address, number) values ('"+tID+"', '"+fname+"', '"+lname+"'," +
                " '"+address+"', '"+tnumber+"')";

        connect.write(sql);
    }

    public void editTeacher(){}
}
