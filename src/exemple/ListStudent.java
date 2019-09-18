package exemple;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
    public List<Etudiant> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Etudiant> studentList) {
        this.studentList = studentList;
    }

    List<Etudiant> studentList = new ArrayList<Etudiant>();



}
