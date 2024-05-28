package App3.test;

import App3.beans.CurrentAccount;
import App3.beans.SavingsAccount;
import App3.factory.AccountFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app3 {
    public static void main(String[] args) {
    ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

    AccountFactory savingsAccountFactory=(AccountFactory) context.getBean("savingsAccountFactory");
    SavingsAccount savingsaccount=(SavingsAccount) savingsAccountFactory.getAccount();
    savingsaccount.createAccount();
    savingsaccount.searchAccount();
    savingsaccount.updateAccount();
    savingsaccount.deleteAccount();
    System.out.println();

    AccountFactory currentAccountFactory=(AccountFactory) context.getBean("currentAccountFactory");
    CurrentAccount currentAccount=(CurrentAccount) currentAccountFactory.getAccount();
    currentAccount.createAccount();
    currentAccount.searchAccount();
    currentAccount.updateAccount();
    currentAccount.deleteAccount();
}
}