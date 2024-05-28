package App6.Test;

import App6.beans.Account;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {   //Event handling
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Account account=(Account) context.getBean("account");
        account.createAccount();
        account.searchAccount();
        account.updateAccount();
        account.deleteAccount();
    }
}
