package App4.beans;

public class Course {
    private int cid;
    private String cname;
    private int ccost;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCcost() {
        return ccost;
    }

    public void setCcost(int ccost) {
        this.ccost = ccost;
    }

    public void getCourseDetails(){
        System.out.println("Course.java Details");
        System.out.println("**************");
        System.out.println("Course Id:"+cid);
        System.out.println("Course Name:"+cname);
        System.out.println("Course Cost:"+ccost);
    }

}

