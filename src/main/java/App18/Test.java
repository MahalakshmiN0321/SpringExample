package App18;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("application1.xml");
        EmployeeDao employeeDao=(EmployeeDao) context.getBean("employeeDao");

        /*
        Employee employee=new Employee();
        employee.setEno(111);
        employee.setEname("maha");
        employee.setEsalary(6000);
        employee.setEaddress("chennai");
        String status=employeeDao.add(employee);
        System.out.println(status);
        */


        /*
        Employee employee=employeeDao.search(111);
        if(employee==null){
            System.out.println("Employee not existed");
        }else{
            System.out.println("Employee Details");
            System.out.println("*****************");
            System.out.println("Employee No:"+employee.getEno());
            System.out.println("Employee Name:"+employee.getEname());
            System.out.println("Employee Salary:"+employee.getEsalary());
            System.out.println("Employee Address:"+employee.getEaddress());
        }
        */

        /*

        List<Employee> employeeList=employeeDao.getallemployee();
        System.out.println("ENo/tEName/tESalary/tEAddress");
        System.out.println("------------------------------");
        for(Employee employee:employeeList){
            System.out.println(employee.getEno());
            System.out.println(employee.getEname());
            System.out.println(employee.getEsalary());
            System.out.println(employee.getEaddress());
        }
         */

        /*
        Employee employee=new Employee();
        employee.setEno(111);
        employee.setEname("yogi");
        employee.setEsalary(5000);
        employee.setEaddress("china");
        String status=employeeDao.update(employee);
        System.out.println(status);
         */

        String status=employeeDao.delete(111);
        System.out.println(status);
    }
}
