package Practice.generics.interfaces;

public class Teacher implements Repository<Teacher>{

    String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void create(Teacher teacher) {
        System.out.println("Ögretmen olusturuldu : "+teacher.getName());
    }

    @Override
    public void get(Teacher teacher) {
        System.out.println("Aradiginiz Ögretmen : "+teacher.getName());

    }

    @Override
    public void update(Teacher teacher) {
        System.out.println("Ögretmen bilgileri yenilendi : "+teacher.getName());
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println("Ögretmen bilgileri silindi : "+teacher.getName());
    }
}
