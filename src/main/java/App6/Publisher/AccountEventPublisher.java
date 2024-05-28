package App6.Publisher;

import App6.Event.AccountEvent;
import App6.beans.Account;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class AccountEventPublisher implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher publisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher=publisher;
    }
    public void publish(String message){
        AccountEvent ae=new AccountEvent(this,message);
        publisher.publishEvent(ae);
    }
}
