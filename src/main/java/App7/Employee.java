package App7;

public class Employee {
    private int eno;
    private String ename;
    private int esalary;
    private String eaddress;

    public int getEno() {
        return eno;
    }
    public void setEno(int eno) {
        this.eno = eno;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public int getEsalary() {
        return esalary;
    }
    public void setEsalary(int esalary) {
        this.esalary = esalary;
    }
    public String getEaddress() {
        return eaddress;
    }
    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }
    public void getEmpDetails(){
        System.out.println("Employee details");
        System.out.println("****************");
        System.out.println("Employee Number :"+eno);
        System.out.println("Employee Name   :"+ename);
        System.out.println("Employee Salary :"+esalary);
        System.out.println("Employee Address:"+eaddress);
    }
}
