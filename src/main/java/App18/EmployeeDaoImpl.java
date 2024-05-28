package App18;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import javax.sql.DataSource;
import java.util.List;

public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {
    private DataSource ds;
    public void setDs(DataSource ds) {
        this.ds = ds;
    }
    @Override
    public String add(Employee emp) {
        String status="";
        try{
            Employee employee=search(emp.getEno());
            if(employee==null){
                int rowcount=getJdbcTemplate().update("Insert into emp1 values (?,?,?,?)",emp.getEno(),emp.getEname(),emp.getEsalary(),emp.getEaddress());
                if(rowcount==1){
                    status="Employee insertion successfully";
                }
            }else{
                status="Employee insertion failure";
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public Employee search(int eno) {
        Employee emp=null;
        try{
            String query="Select * from student where eno=?";
            List<Employee> employeeList=getJdbcTemplate().query(query,new Object[]{eno},(rs,index)->{
                Employee employee=new Employee();
                employee.setEno(rs.getInt("ENO"));
                employee.setEname(rs.getString("ENAME"));
                employee.setEsalary(rs.getFloat("ESALARY"));
                employee.setEaddress(rs.getString("EADDRESS"));
                return employee;
            });
            if(employeeList.isEmpty()==true){
                emp=null;
            }else{
                emp=employeeList.get(0);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Employee> getallemployee() {
        List<Employee> employeeList=null;
        try{
            employeeList=getJdbcTemplate().query("select * from emp",(rs,index)->{
                Employee employee=new Employee();
                employee.setEno(rs.getInt("ENO"));
                employee.setEname(rs.getString("ENAME"));
                employee.setEsalary(rs.getFloat("ESALARY"));
                employee.setEaddress(rs.getString("EADDRESS"));
                return employee;
            });
        }catch (Exception e){
            e.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public String update(Employee emp) {
        String status="";
        try{
            Employee employee=search(emp.getEno());
            if(employee==null){
                System.out.println("Employee not existed");
            }else{
                String query="Update employee set Ename=? Esalary=? Eaddress=? where Eno=?";
                int rowcount=getJdbcTemplate().update(query,employee.getEname(),employee.getEsalary(),employee.getEaddress(),employee.getEno());
                if(rowcount==1){
                    System.out.println("Employee insertion successfully");
                }else{
                    System.out.println("Employee insertion Failure");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public String delete(int eno) {
        String status="";
        try{
            Employee employee=search(eno);
            if(employee==null){
                System.out.println("Employee not existed");
            }
            else{
                int rowcount=getJdbcTemplate().update("delete * from employee where eno=?",eno);
                if(rowcount==1){
                    System.out.println("Employee deletion success");
                }else{
                    System.out.println("Employee deletion failure");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return status;
    }
}
