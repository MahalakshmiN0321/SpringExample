package App8.beans;

public class Employee {
    private String eno;
    private String ename;
    private float esalary;
    private EmployeeAddress employeeAddress;

    public String getEno() {
        return eno;
    }

    public void setEno(String eno) {
        this.eno = eno;
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

    public EmployeeAddress getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(EmployeeAddress employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee Details");
        System.out.println("****************");
        System.out.println("Employee Number:"+eno);
        System.out.println("Employee Name:"+ename);
        System.out.println("Employee salary:"+esalary);
        System.out.println();
        System.out.println("Employee Address");
        System.out.println("________________");
        System.out.println("House No:"+employeeAddress.getHno());
        System.out.println("Street name:"+employeeAddress.getStreetname());
        System.out.println("City Name:"+employeeAddress.getCity());
    }
}
