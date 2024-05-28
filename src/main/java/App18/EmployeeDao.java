package App18;

import java.util.List;

public interface EmployeeDao {
    public String add(Employee emp);
    public Employee search(int eno);
    public List<Employee> getallemployee();
    public String update(Employee emp);
    public String delete(int eno);
}
