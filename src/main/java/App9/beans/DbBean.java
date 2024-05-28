package App9.beans;

public class DbBean {
    private String driverClass;
    private String driverUrl;
    private String dbUserName;
    private String dbPassword;

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getDriverUrl() {
        return driverUrl;
    }

    public void setDriverUrl(String driverUrl) {
        this.driverUrl = driverUrl;
    }

    public String getDbUserName() {
        return dbUserName;
    }

    public void setDbUserName(String dbUserName) {
        this.dbUserName = dbUserName;
    }

    public String getDbPassword() {
        return dbPassword;
    }

    public void setDbPassword(String dbPassword) {
        this.dbPassword = dbPassword;
    }

    public void getdbdetails(){
        System.out.println("Database details");
        System.out.println("******************");
        System.out.println("Driver class:"+driverClass);
        System.out.println("Driver Url:"+driverUrl);
        System.out.println("Db UserName:"+dbUserName);
        System.out.println("Db Password:"+dbPassword);
    }
}
