package App20;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class EmployeeDaoImpl1 implements EmployeeDao1{
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public int[] insert(List<Employee1> employeeList) {
            int[] rowcounts=null;
            try{
                String query="insert into employee values(?,?,?)";
                rowcounts= jdbcTemplate.batchUpdate(query, new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        Employee1 employee=new Employee1();
                        ps.setInt(1,employee.getEno());
                        ps.setString(2,employee.getEname());
                        ps.setString(3,employee.getEddress());
                    }
                    @Override
                    public int getBatchSize() {
                        return employeeList.size();
                    }
                });
            }catch (Exception e){
                e.printStackTrace();
            }
            return rowcounts;
        }
    @Override
    public int[] update() {
        int[] rowcounts=null;
        try{
          String query1="insert into emp1 values(222,'BBB','ooty'";
          String query2="update emp1 set ENO=ENO+500 where esalary<10000";
          rowcounts=jdbcTemplate.batchUpdate(query1,query2);
        }catch(Exception e){
            e.printStackTrace();
        }
        return rowcounts;
    }
}


