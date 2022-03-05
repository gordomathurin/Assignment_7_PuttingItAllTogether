public class Main {

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();

        studentRegistry.addStudent("gordon");
        studentRegistry.addStudent("mathurin");
        studentRegistry.addStudent("test");
        studentRegistry.addStudent("case");

        System.out.println("first session: " + studentRegistry);

        studentRegistry.removeStudent("gordon");
        System.out.println("remove session: " + studentRegistry.toString());

        studentRegistry.addStudent("gordon");
        System.out.println("adding student session: " + studentRegistry.toString());

        studentRegistry.removeAllStudents();;
        System.out.println("remove all session: " + studentRegistry.toString());

        studentRegistry.addStudent("gordon");
        studentRegistry.addStudent("mathurin");
        studentRegistry.addStudent("test");
        studentRegistry.addStudent("case");
        System.out.println(studentRegistry.toString());




    }
}
