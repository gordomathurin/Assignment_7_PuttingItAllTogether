public class Main {

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();

        studentRegistry.addStudent("gordon");
        studentRegistry.addStudent("mathurin");
        studentRegistry.addStudent("test");
        studentRegistry.addStudent("case");

        System.out.println("Added students to list: " + studentRegistry);

        studentRegistry.removeStudent("gordon");
        System.out.println("Removed student from list: " + studentRegistry.toString());

        studentRegistry.addStudent("gordon");
        System.out.println("Added a student to list: " + studentRegistry.toString());

        studentRegistry.removeAllStudents();;
        System.out.println("Removed all students from list: " + studentRegistry.toString());

        studentRegistry.addStudent("gordon");
        studentRegistry.addStudent("mathurin");
        studentRegistry.addStudent("test");
        studentRegistry.addStudent("case");
        System.out.println(studentRegistry.toString());




    }
}
