package App9.TEst;

import App9.beans.DbBean;
import org.springframework.context.support.GenericXmlApplicationContext;

public class test1 {
    public static void main(String[] args) {
        System.setProperty("spring.profile.active","development");
        GenericXmlApplicationContext context=new GenericXmlApplicationContext();
        context.load("applicationContext.xml");
        context.refresh();
        DbBean dbBean=(DbBean) context.getBean("dbBean");
        dbBean.getdbdetails();
    }
}
