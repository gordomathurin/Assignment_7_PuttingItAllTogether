import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentRegistryTest {

   StudentRegistry studentRegistry = new StudentRegistry();


    @org.junit.jupiter.api.Test
     public void addStudent() {
       studentRegistry.addStudent("Black Panther");
       studentRegistry.addStudent("Static Shock");
       studentRegistry.addStudent("Storm");
       studentRegistry.addStudent("Spiderman");
       assertEquals(studentRegistry.getHowManyStudentsInRegistry(),4);
    }

    @org.junit.jupiter.api.Test
   public void removeStudent() {
        studentRegistry.addStudent("Black Panther");
        studentRegistry.addStudent("Static Shock");
        studentRegistry.removeStudent("Black Panther");
        assertEquals(studentRegistry.getHowManyStudentsInRegistry(),1);

    }

    @org.junit.jupiter.api.Test
    public void removeAllStudents() {
       studentRegistry.removeAllStudents();
    }

    @org.junit.jupiter.api.Test
    public void getHowManyStudentsInRegistry() {
        studentRegistry.addStudent("Black Panther");
        studentRegistry.addStudent("Static Shock");
        assertEquals(studentRegistry.getHowManyStudentsInRegistry(),2);
    }
}