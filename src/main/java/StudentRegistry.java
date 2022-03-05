import java.util.ArrayList;
import java.util.List;

public class StudentRegistry {

    private List studentList = new ArrayList<>();

    public StudentRegistry() {
    }

    public void addStudent (String name) {
        studentList.add(name);
    }

    public void removeStudent (String name) {
        studentList.remove(name);
    }

    public void removeAllStudents () {
        studentList.clear();
    }

    public int getHowManyStudentsInRegistry() {
        return studentList.size();
    }

    public List getStudentList() {
        return studentList;
    }

    public void setStudentList(List studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "{ " + studentList +
                " }";
    }
}
