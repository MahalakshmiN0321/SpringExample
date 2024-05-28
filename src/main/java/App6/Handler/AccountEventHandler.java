package App6.Handler;

import App6.Event.AccountEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class AccountEventHandler implements ApplicationListener<AccountEvent> {

    @Override
    public void onApplicationEvent(AccountEvent event) {
        event.generateLog();
    }
}
