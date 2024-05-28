package App17;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDaoImpl implements StudentDao{
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;


    public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
    }
    @Override
    public String add(Student std) {
        String status="";
        String query="";
        try{
            query="Select into student where sno =";
            Map<String,Object> param=new HashMap<>();
            param.put("sno",std.getSno());
            List<Student> list=namedParameterJdbcTemplate.query(query,param,(rs,index)->{
                Student student=new Student();
                student.setSno(rs.getInt("SNO"));
                student.setSname(rs.getString("SNAME"));
                student.setSaddress(rs.getString("SADDRESS"));
                return student;
            } );
            if(list.isEmpty()==true){
                query="Insert into student values(:sno,:sname,:saddress)";
                param=new HashMap<String,Object>();
                param.put("sno",std.getSno());
                param.put("sname",std.getSname());
                param.put("saddress",std.getSaddress());
                int rowcount=namedParameterJdbcTemplate.update(query,param);
                if(rowcount==1){
                    System.out.println("Student inserted successfully");
                }
            }else{
                System.out.println("Student insertion failure");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }

    @Override
    public Student search(int sno) {
        Student std=null;
        try{
            String query="select * from student where sno= :Sno";
            Map<String,Object> params=new HashMap<>();
            params.put("sno",sno);
            List<Student> list=namedParameterJdbcTemplate.query(query,params,(rs,index)->{
                Student std1=new Student();
                std1.setSno(rs.getInt("SNO"));
                std1.setSname(rs.getString("SNAME"));
                std1.setSaddress(rs.getString("SADDRESS"));
                return std1;
            });
            if(list.isEmpty()==true){
                std=null;
            }else{
                std=list.get(0);
            }
        }catch(Exception e){
            e.printStackTrace();

        }
        return std;
    }
    @Override
    public String update(Student std) {
        String status="";
        try{
            Student std1=search(std.getSno());
            if(std1==null){
                status="student not existed";
            }else {
                String query="update into student set SNAME= :sname,SADDRESS=:saddress, where SNO=:sno ";
                Map<String, Object> params = new HashMap<>();
                params.put("sno", std.getSno());
                params.put("sname", std.getSname());
                params.put("saddress", std.getSaddress());
                int rowcount = namedParameterJdbcTemplate.update(query,params);
                if(rowcount==1){
                    System.out.println("Student updated successfully");
                }else{
                    System.out.println("Student updation failure");
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return status;
    }
    @Override
    public String delete(int sno) {
        String status="";
        try{
            Student std=search(sno);
            if(std==null){
                status="student not existed";
            }
            else {
                String query = "delete from student where SID: +sid";
                Map<String, Object> params = new HashMap<>();
                params.put("sno",sno);
                int rowcount = namedParameterJdbcTemplate.update(query, params);
                if (rowcount == 1) {
                    status = "student delete successfully";
                } else {
                    status = "student deletion failure";
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return "status";
    }
}
