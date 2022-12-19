package Practice.generics.interfaces;

public class Student implements Repository<Student>{

    String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void create(Student student) {

        System.out.println("ögrenci olusturuldu : "+student.getName());
    }

    @Override
    public void get(Student student) {
        System.out.println("aradiginiz ögrenci : "+student.getName());

    }

    @Override
    public void update(Student student) {
        System.out.println("ögrenci bilgileri yenilendi : "+student.getName());
    }

    @Override
    public void delete(Student student) {
        System.out.println("ögrenci bilgileri silindi : "+student.getName());
    }
}
