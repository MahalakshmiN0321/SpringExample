package App5.Validator;

import App5.beans.User;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Properties;

public class UserValidator implements Validator {

    private Resource resource;
    public void setResource(Resource resource) {
        this.resource = resource;
    }
    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        try {
            User user = (User) target;
            Properties prop = PropertiesLoaderUtils.loadProperties(resource);
            if (user.getUname() == null || user.getUname().equals("")) {
                errors.rejectValue("uname", "error.uname.required", prop.getProperty("error.uname.required"));
            }
            if (user.getUpwd() == null || user.getUpwd().equals("")) {
                errors.rejectValue("upwd", "error.upwd.required", prop.getProperty("error.upwd.required"));
            }
            if (user.getUage() == 0) {
                errors.rejectValue("uage", "error.uage.required", prop.getProperty("error.uage.required"));
            }
            if (user.getUemail() == null || user.getUemail().equals("")) {
                errors.rejectValue("uemail", "error.uemail.required", prop.getProperty("error.uemail.required"));
            }
            if (user.getUmobile() == null || user.getUmobile().equals("")) {
                errors.rejectValue("umobile", "error.umobile.required", prop.getProperty("error.umobile.required"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
