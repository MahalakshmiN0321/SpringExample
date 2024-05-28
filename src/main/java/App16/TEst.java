package App16;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class TEst {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeeDao employeeDao = (EmployeeDao) context.getBean("employeeDao");
        /*
        Employee employee=new Employee();
        employee.setEno(211);
        employee.setEname("maha");
        employee.setEsalary(12345);
        employee.setEaddr("chennai");
        String status=employeeDao.add(employee);
        System.out.println(status);
*/
        Employee emp = employeeDao.search(111);
        if (emp == null) {
            System.out.println("Employee not Existed");
        } else {
            System.out.println("Employee Details");
            System.out.println("*****************");
            System.out.println("Employee Nmber:" + emp.getEno());
            System.out.println("Employee Name:" + emp.getEname());
            System.out.println("Employee Salary:" + emp.getEsalary());
            System.out.println("Employee Address:" + emp.getEaddr());
        }

        /*
        Employee employee1=new Employee();
        employee1.setEno(111);
        employee1.setEname("kavi");
        employee1.setEsalary(17777);
        employee1.setEaddr("pondy");
        String status=employeeDao.update(employee1);
        System.out.println();
    }
         */

        String status = employeeDao.delete(111);
        System.out.println(status);
    }
}



