package App16;

import org.springframework.jdbc.core.JdbcTemplate;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public String add(Employee employee) {
        String status = "";
        try {
            List<Employee> emplist = jdbcTemplate.query("Select * from emp1 where Eno= " + employee.getEno(), (rs, rownum) -> {
                Employee employee1 = new Employee();
                employee1.setEno(rs.getInt("ENO"));
                employee1.setEname(rs.getString("ENAME"));
                employee1.setEsalary(rs.getInt("ESALARY"));
                employee1.setEaddr(rs.getString("EADDRESS"));
                return employee1;
            });

            if (emplist.isEmpty() == true) {
                int rowCount = jdbcTemplate.update("insert into emp1 values(" + employee.getEno() + ",'" + employee.getEname() + ",'" + employee.getEsalary() + ",'" + employee.getEaddr());
                if (rowCount == 1) {
                    status = "Employee Inserted successfully";
                } else {
                    status = "Employee Insertion failure";
                }
            } else {
                status = "Employee Existed Already";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public Employee search(int eno) {
        Employee emp = null;
        try {
            List<Employee> emplist = jdbcTemplate.query("Select * from emp1 where eno=" + emp.getEno(), (rs, rownum) -> {
                Employee employee2 = new Employee();
                employee2.setEno(rs.getInt("ENO"));
                employee2.setEname(rs.getString("ENAME"));
                employee2.setEsalary(rs.getInt("ESALARY"));
                employee2.setEaddr(rs.getString("EADDRESS"));
                return employee2;
            });
            boolean b = emplist.isEmpty();
            if (b == true) {
                emp = null;
            } else {
                emp = emplist.get(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return emp;
    }


        @Override
        public String update (Employee employee){
        String status="";
        try{
            Employee employee1=search(employee.getEno());
            if(employee1==null){
                status="Employee not existed";
            }else{
                int rowcount=jdbcTemplate.update("update  emp1 set Ename = '" +employee.getEno() + ",'" + employee.getEname() + ",'" + employee.getEsalary() + ",'" + employee.getEaddr());
                if(rowcount==1){
                    System.out.println("Employee updated successfully");
                }else{
                    System.out.println("Employee updation failure");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
            return status;
        }
        @Override
        public String delete ( int eno){
        String status="";
        try{
            Employee employee=search(eno);
            if(employee==null){
               status="Employee deleted fails";
            }else{
                int rowcount=jdbcTemplate.update("Delete * from employee"+eno);
                if(rowcount==1){
                    System.out.println("Employee deleted successfully");
                }else{
                    System.out.println("Employee not deleted");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
            return status;
        }
    }

