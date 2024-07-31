public class test {
    public static void main(String[] args) {
        Student model = new Student("Vinoth", "48", "B");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.updateStudentDetails();
        controller.updateView();
    }
}