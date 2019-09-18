package exemple;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class ListStudent {
    private String studentName;


    @SessionScoped
    public void init(){
        studentList = new ArrayList<Etudiant>();
        studentList.add(new Etudiant("Benjamin"));
        studentList.add(new Etudiant("Samuel"));
    }

    public void add(){
        studentList.add(new Etudiant(studentName));
    }

    public List<Etudiant> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Etudiant> studentList) {
        this.studentList = studentList;
    }

    List<Etudiant> studentList;


    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
}
