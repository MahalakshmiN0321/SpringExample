package App17;

public interface StudentDao {
    public String add(Student std);
    public Student search(int sno);
    public String update(Student std);
    public String delete(int sno);
}
