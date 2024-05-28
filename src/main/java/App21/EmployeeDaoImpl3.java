package App21;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDaoImpl3 implements EmployeeDao3{
    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public String add(Employee3 emp) {
        String status="";
        try{
            String query="insert into emp1 where values(?,?,?)";
            int rowcounts=jdbcTemplate.update(query,emp.getEno(),emp.getEname(),emp.getEaddress());
            if(rowcounts==1){
                status="Employee insertion successfully";
            }else{
                status="Employee updation failure";
            }
        }catch (Exception e){
            status="Employee updation failure";
            e.printStackTrace();
        }
        return status;
    }
}
