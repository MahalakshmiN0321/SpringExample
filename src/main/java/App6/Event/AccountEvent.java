package App6.Event;

import org.springframework.context.ApplicationEvent;

import java.io.FileOutputStream;
import java.util.Date;

public class AccountEvent extends ApplicationEvent {
    private String message;
    private static FileOutputStream fos;
    static {
    try{
        fos=new FileOutputStream("C:/logs/log.txt");
    }catch(Exception e){
        e.printStackTrace();
    }
    }

    public AccountEvent(Object obj,String message){
        super(obj);
        this.message=message;
    }

    public void generateLog(){
        try{
            message=new Date().toString()+":"+message;
            //message=message+" ";
            byte[] b=message.getBytes();
            fos.write(b);
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
