package App21;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {

        ApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        EmployeeDao3 employeeDao3=(EmployeeDao3) context.getBean("empdao");
        Employee3 emp=new Employee3();
        emp.setEno(111);
        emp.setEname("soba");
        emp.setEaddress("chennai");
        String status= employeeDao3.add(emp);
        System.out.println(status);

    }
}
