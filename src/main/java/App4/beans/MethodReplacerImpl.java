package App4.beans;

import org.springframework.beans.factory.support.MethodReplacer;
import java.lang.reflect.Method;

public class MethodReplacerImpl implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        Course course=new Course();
        System.out.println("Course.java Details");
        System.out.println("**************");
        System.out.println("Course.java Id  : 102");
        System.out.println("Course.java Name: Python");
        System.out.println("Course.java Cost: 4000");
        return course;
    }
}
