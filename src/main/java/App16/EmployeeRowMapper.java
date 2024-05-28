package App16;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRowMapper implements RowMapper<Employee>{
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        Employee employee=new Employee();
        employee.setEno(rs.getInt("ENO"));
        employee.setEname(rs.getString("ENAME"));
        employee.setEsalary(rs.getInt("ESALARY"));
        employee.setEaddr(rs.getString("EADDRESS"));
        return employee;
    }
}
