package App4.test;

import App4.beans.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Course course=(Course) context.getBean("coursebean");
        course.getCourseDetails();
    }
}
