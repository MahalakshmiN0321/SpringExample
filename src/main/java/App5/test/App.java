package App5.test;

import App5.Validator.UserValidator;
import App5.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.MapBindingResult;
import org.springframework.validation.ObjectError;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        User user=(User) context.getBean("userBean");
        user.getUserDetails();
        System.out.println();
        UserValidator userValidator=(UserValidator) context.getBean("UserValidator");
        Map<String,String>  map=new HashMap<>();
        MapBindingResult mapBindingResult=new MapBindingResult(map,"App5.beans.User");
        userValidator.validate(user,mapBindingResult);
        List<ObjectError> list= mapBindingResult.getAllErrors();
        for(ObjectError error:list){
            System.out.println(error.getDefaultMessage());
        }
    }
}
