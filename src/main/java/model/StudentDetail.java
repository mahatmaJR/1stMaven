package model;

public class StudentDetail {
    int admNo;
    String fname;
    String lname;
    String address;
    String pname;
    int pnumber;

    public int getAdmNo() {
        return admNo;
    }

    public int setAdmNo(int admNo) {
        this.admNo = admNo;
        return admNo;
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

    public String getPname() {
        return pname;
    }

    public String setPname(String pname) {
        this.pname = pname;
        return pname;
    }

    public int getPnumber() {
        return pnumber;
    }

    public int setPnumber(int pnumber) {
        this.pnumber = pnumber;
        return pnumber;
    }
}
