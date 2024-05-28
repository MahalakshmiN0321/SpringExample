package App20;

import App20.Employee1;
import App20.EmployeeDao1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        EmployeeDao1 employeeDao=(EmployeeDao1) context.getBean("employeeDao");
       /*
        Employee1 emp=new Employee1();
        emp.setEno(111);
        emp.setEname("AAA");
        emp.setEddress("mumbai");

        List<Employee1> employeelist=new ArrayList<>();
        employeelist.add(emp);
        employeeDao.insert(employeelist);
        System.out.println(employeelist);
        */

        employeeDao.update();
        System.out.println();
    }
}
