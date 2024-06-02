package APP2.test;

import APP2.beans.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student1=(Student) context.getBean("studentBean1");
        Student student2=(Student) context.getBean("studentBean1");
        Student student3=(Student) context.getBean("studentBean1");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student1.getCourse());
        System.out.println(student2.getCourse());
        System.out.println(student3.getCourse());
    }
}
