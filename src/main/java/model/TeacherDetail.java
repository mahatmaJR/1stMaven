package model;

public class TeacherDetail {
    int tID;
    String fname;
    String lname;
    String address;
    int tnumber;

    public TeacherDetail(){}

    public int gettID() {
        return tID;
    }

    public int settID(int tID) {
        this.tID = tID;
        return tID;
    }

    public String getFname() {
        return fname;
    }

    public String setFname(String fname) {
        this.fname = fname;
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String setLname(String lname) {
        this.lname = lname;
        return lname;
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        this.address = address;
        return address;
    }

    public int getTnumber() {
        return tnumber;
    }

    public int setTnumber(int tnumber) {
        this.tnumber = tnumber;
        return tnumber;
    }
}
