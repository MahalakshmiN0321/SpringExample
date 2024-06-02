package App8.beans;

public class Employee {
    private String eid;
    private String ename;
    private float esalary;
    private EmployeeAddress eaddress;

    public String getEid() {
        return eid;
    }

    public void setEid(String eno) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public float getEsalary() {
        return esalary;
    }

    public void setEsalary(float esalary) {
        this.esalary = esalary;
    }

    public EmployeeAddress getEaddress() {
        return eaddress;
    }

    public void setEaddress(EmployeeAddress eaddress) {
        this.eaddress = eaddress;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Employee Number:"+eid);
        System.out.println("Employee Name:"+ename);
        System.out.println("Employee salary:"+esalary);
        System.out.println();
        System.out.println("Employee Address");
        System.out.println("________________");
        System.out.println("House No:"+eaddress.getHno());
        System.out.println("Street name:"+eaddress.getStreetname());
        System.out.println("City Name:"+eaddress.getCity());
    }
}
