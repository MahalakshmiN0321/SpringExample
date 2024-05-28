package App15;

import java.util.ArrayList;
import java.util.List;

public class city_state_collection {

    ArrayList<city_state> list=new ArrayList<city_state>();
    public ArrayList<city_state> getCityState(){
        city_state cityState=new city_state();
        cityState.setCity("chennai");
        cityState.setState("TamilNadu");
        list.add(cityState);
        return list;


//        city_state cityState1=new city_state();
//        cityState1.setCity("telungana");
//        cityState1.setState("Hyderabad");
        //list.add(cityState1);


    }

}
