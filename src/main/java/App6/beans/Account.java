package App6.beans;

import App6.Event.AccountEvent;
import App6.Publisher.AccountEventPublisher;

public class Account {
    private AccountEventPublisher publisher;
    public void setPublisher(AccountEventPublisher publisher){
        this.publisher=publisher;
    }
    public void createAccount(){
        System.out.println("Account Created");
        publisher.publish("created");
    }
    public void searchAccount(){
        System.out.println("Account Identified");
        publisher.publish("identified");
    }
    public void updateAccount(){
        System.out.println("Account Updated");
        publisher.publish("updated");
    }
    public void deleteAccount(){
        System.out.println("Account Deleted");
        publisher.publish("deleted");
    }
}
