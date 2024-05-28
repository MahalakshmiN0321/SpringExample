package App8.beans;

import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;

public class EmployeeAddressEditors extends PropertyEditorSupport {     //property editor
    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        String[] str=text.split("-");
        EmployeeAddress employeeAddress=new EmployeeAddress();
        employeeAddress.setHno(str[0]);
        employeeAddress.setCity(str[1]);
        employeeAddress.setStreetname(str[2]);
        super.setValue(employeeAddress);
    }
}
