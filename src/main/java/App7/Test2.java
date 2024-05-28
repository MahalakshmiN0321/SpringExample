package App7;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        BeanWrapper beanWrapper=new BeanWrapperImpl(Employee.class);
        beanWrapper.setPropertyValue("eno","111");
        beanWrapper.setPropertyValue("ename","maha");
        beanWrapper.setPropertyValue("esalary","10000");
        beanWrapper.setPropertyValue("eaddress","chennai");
        System.out.println("Employee Details");
        System.out.println("-----------------");
        System.out.println("Employee No     :"+beanWrapper.getPropertyValue("eno"));
        System.out.println("Employee Name   :"+beanWrapper.getPropertyValue("ename"));
        System.out.println("Employee salary :"+beanWrapper.getPropertyValue("esalary"));
        System.out.println("Employee Address:"+beanWrapper.getPropertyValue("eaddress"));

        System.out.println();
        Map<String,Object> map=new HashMap<>();
        map.put("eno",222);
        map.put("ename","koshi");
        map.put("esalary",12000);
        map.put("eaddress","hyd");
        beanWrapper.setPropertyValues(map);
        Employee emp=(Employee)beanWrapper.getWrappedInstance();
        emp.getEmpDetails();
        System.out.println();

        System.out.println(beanWrapper.isReadableProperty("eno"));
        System.out.println(beanWrapper.isReadableProperty("ename"));
        System.out.println(beanWrapper.isReadableProperty("esalary"));
        System.out.println(beanWrapper.isReadableProperty("eaddress"));

        System.out.println();

        System.out.println(beanWrapper.isWritableProperty("eno"));
        System.out.println(beanWrapper.isWritableProperty("ename"));
        System.out.println(beanWrapper.isWritableProperty("esalary"));
        System.out.println(beanWrapper.isWritableProperty("eaddress"));

        System.out.println();

        Employee emp1=new Employee();
        BeanUtils.copyProperties(emp,emp1);
        emp1.getEmpDetails();
    }
}
