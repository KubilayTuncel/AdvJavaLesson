package Practice.Enums;

/*
Task: okul yönetimi icin ögrenci ve teacher silme programi yaziniz.
User: icin role tanimlayi(Admin,teacher,student) ve role göre silme yetkisi veriniz.
ögrenci sime yetkisi admin ve teacher da
ögretmen silme : admin yetkisinde
 */

public class SchoolManagement {
    public static void main(String[] args) {

        Student student = new Student("tolstoy");
        Teacher teacher = new Teacher("Balzac");

        User user1 = new User("Jules Verne",Role.Role_ADMIN);
        User user2 = new User("Cahrl Dickens",Role.Role_Teacher);
        User user3 = new User("John Steinbeck",Role.Role_Student);

        deleteStudent(student,user1);
        deleteStudent(student,user2);
        deleteStudent(student,user3);
        deleteTeacher(teacher,user2);
        deleteTeacher(teacher,user1);

    }

    public static void deleteStudent(Student std,User user) {
        if (user.getRole().equals(Role.Role_ADMIN) || user.getRole().equals(Role.Role_Teacher)) {
            System.out.println("Student is DELETED successfully by "+user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName()+ " is not permitted to delete Student");
        }
    }

    public static void deleteTeacher(Teacher tec, User user) {
        if (user.getRole().equals(Role.Role_ADMIN)){
            System.out.println("Teacher is DELETED successfully by "+user.getRole().getName());
        }else {
            System.out.println(user.getRole().getName()+ " is not permitted to delete Teacher");
        }
    }
}
