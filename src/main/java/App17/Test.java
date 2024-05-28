package App17;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
        StudentDao studentDao=(StudentDao) context.getBean("studentDao");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println();
            System.out.println("1.Add student");
            System.out.println("2.Search student");
            System.out.println("3.Update student");
            System.out.println("4.Delete student");
            System.out.println("5.Exit");
            System.out.println("Enter your option [1,2,3,4,5] : ");
            int option = Integer.parseInt(bufferedReader.readLine());
            int sno=0;
            String sname="";
            String saddress="";
            Student student=null;
            String status="";
            switch (option) {
                case 1:
                    System.out.println("Add Student Details");
                    System.out.println("Student No: ");
                    sno=bufferedReader.read();
                    System.out.println("Student name: ");
                    sname=bufferedReader.readLine();
                    System.out.println("Student address");
                    saddress=bufferedReader.readLine();
                    student=new Student();
                    student.setSno(sno);
                    student.setSname(sname);
                    student.setSaddress(saddress);
                    status=studentDao.add(student);
                    System.out.println(status);
                    break;
                case 2:
                    System.out.println("Search student details");
                    System.out.println("Student No:");
                    sno=bufferedReader.read();
                    student=studentDao.search(sno);
                    if(student==null){
                        System.out.println("Student not existed");
                    }else{
                        System.out.println("student No: "+student.getSno());
                        System.out.println("Student Name:"+student.getSname());
                        System.out.println("Student Address:"+student.getSaddress());
                    }
                    break;
                case 3:
                    System.out.println("Update Student Details");
                    System.out.println("Student No: ");
                    sno=bufferedReader.read();
                    student=studentDao.search(sno);
                    if(student==null){
                        System.out.println("Student not existed");
                    }else{
                        System.out.println("Student name:"+student.getSname());
                        sname=bufferedReader.readLine();
                        System.out.println("Student address:"+student.getSaddress());
                        saddress=bufferedReader.readLine();
                        Student student1=new Student();
                        student1.setSno(sno);
                        student1.setSname(sname);
                        student.setSaddress(saddress);
                        status=studentDao.update(student1);
                        System.out.println(status);
                    }
                    break;
                case 4:
                    System.out.println("Delete Student Details");
                    System.out.println("Student No: ");
                    sno=bufferedReader.read();
                    status=studentDao.delete(sno);
                    System.out.println(status);
                    break;
                case 5:
                    System.out.println("Thank you for choosing");
                    break;
                default:
                    System.out.println("Enter the option from 1,2,3,4,5");
                    break;

            }
        }





























        /*
        Student std=new Student();
        std.setSno(111);
        std.setSname("Balaji");
        std.setSaddress("chennai");
        String status=studentDao.add(std);
        System.out.println(status);
*/
        /*
        Student std=studentDao.search(111);
        if(std==null){
            System.out.println("student not existed");
        }else{
            System.out.println("Student Details");
            System.out.println("***************");
            System.out.println("Student number:"+std.getSno());
            System.out.println("Student name:"+std.getSname());
            System.out.println("Student Address:"+std.getSaddress());
        }
*/
        /*
        Student student=new Student();
        student.setSno(111);
        student.setSname("Harini");
        student.setSaddress("hyd");
        String status=studentDao.update(student);
        System.out.println(status);
         */

        /*
        String status=studentDao.delete(111);
        System.out.println(status);
         */
    }
}
