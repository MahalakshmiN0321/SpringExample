package App8.beans;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class EmployeeAddressEditors extends PropertyEditorSupport {     //property editor
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] str=text.split("-");
        EmployeeAddress eaddress=new EmployeeAddress();
        eaddress.setHno(str[0]);
        eaddress.setStreetname(str[1]);
        eaddress.setCity(str[2]);
        super.setValue(eaddress);
    }
}
