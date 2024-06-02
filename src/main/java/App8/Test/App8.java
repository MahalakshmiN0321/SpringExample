package App8.Test;

import App8.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App8 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee=(Employee) context.getBean("employeeBean");
        employee.getEmployeeDetails();
    }
}
