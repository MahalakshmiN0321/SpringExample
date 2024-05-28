package App3.beans;

public class CurrentAccount implements Account{
    public void createAccount(){
        System.out.println("CurrentAccount created");
    }
    public void searchAccount(){
        System.out.println("CurrentAccount Identified");
    }
    public void updateAccount(){
        System.out.println("CurrentAccount Updated");
    }
    public void deleteAccount(){
        System.out.println("CurrentAccount Deleted");
    }

}

