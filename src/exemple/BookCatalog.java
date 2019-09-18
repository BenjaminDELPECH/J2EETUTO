package exemple;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import java.awt.print.Book;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class BookCatalog implements Serializable {

    public List<Etudiant> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Etudiant> studentList) {
        this.studentList = studentList;
    }

    private List<Etudiant> studentList;

//    @PostConstruct
//    public void init() {
//        studentList = new ArrayList<Etudiant>();
//        studentList.add(new Etudiant("Theory of Money and Credit"));
//        studentList.add(new Etudiant("Man, Economy and State"));
//    }


}
