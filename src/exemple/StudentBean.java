package exemple;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class StudentBean {
    private List<Student> studentList;
    private String name;
    private String firstName;

    @PostConstruct
    private void init() {
        studentList = new ArrayList<Student>();
        studentList.add(new Student("benjamin", "delpech", 22));
    }

    public void edit(Student student) {
        for (Student existing : getStudentList()) {
            existing.setEditable(false);
        }
        student.setEditable(true);
    }

    public void save(Student student) {
        studentList.set(studentList.indexOf(student), student);
        cancelEdit(student);
    }


    public void cancelEdit(Student student) {
        student.setEditable(false);
    }

    public void add(){
        studentList.add(new Student(name, firstName, 22));
    }

    public void delete(Student student) {
        studentList.remove(studentList.indexOf(student));
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private int age;

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
