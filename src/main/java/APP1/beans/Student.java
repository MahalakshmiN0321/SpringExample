package APP1.beans;

public class Student {

    private int studentId;
    private String studentName;
    private int studentAge;
    private Course course;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void getStudentDetails() {
        System.out.println("Student Deatils");
        System.out.println("*****************");
        System.out.println("Student Id:" + studentId);
        System.out.println("Student Name:" + studentName);
        System.out.println("Student Age:" + studentAge);
        System.out.println();
        System.out.println("Course.java Details");
        System.out.println("***************");
        System.out.println("Course.java Id:" + course.getCourseId());
        System.out.println("Course.java Name:"+course.getCourseName());
        System.out.println("Course.java Cost:"+course.getCourseCost());
    }
}
