
package Collection;

public class StudentManagementSystem {

    public Student1 Student;

    void registration(String name, int id, int MobileNo, boolean isComplited) {
       Student1 Student = new Student1();
        Student.setInfo(name, id, MobileNo, isComplited);
        System.out.println("Registration Successful for student with ID " + id);
    }

    void searchfor(int id) {
        if (Student != null && Student.id == id) {
            System.out.println("Student found: " + Student.getInfo());
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public static void main(String[] args) {

        StudentManagementSystem sms = new StudentManagementSystem();

        sms.registration("Mezbah", 1611, 1233, true);
        sms.searchfor(1611);

        StudentManagementSystem sms1 = new StudentManagementSystem();
        System.out.println("   ");
        sms1.registration("Emon", 1783, 01233, true);
        sms1.searchfor(1783);

        System.out.println("   ");
        System.out.println("Searching for student");
        sms.searchfor(1844);

    }
}
