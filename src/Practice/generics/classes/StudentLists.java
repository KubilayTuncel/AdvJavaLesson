package Practice.generics.classes;

public class StudentLists {
    /*
    Task: 1) Java dersi için, öğrencileri isim, vize notu ve final notunu  ile birlikte listeleyen bir program yazınız.
      2) Kütüphane için, öğrencileri isim, okul no ve mail adresi ile birlikte listeleyen bir program yazınız.
     */

    public static void main(String[] args) {

        listGerade();
        listMemberLibrary();


    }
    public static void listGerade(){
        Student<String, Double, Double > std1 = new Student("Wilma",76.8,80);
        Student<String, Double, Double > std2 = new Student("Fred",89.9,90.9);
        Student<String, Double, Double > std3 = new Student("Barnie",56.8,70);

        System.out.println("** Java dersi vize ve final notlari");
        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std3.getS(),std3.getU(),std3.getV());

    }

    public static void listMemberLibrary(){

        Student<String, Integer, String> std1 = new Student<>("Cakil",1321213,"cakil@gmail.com");
        Student<String, Integer, String> std2 = new Student<>("Ahmet",1321233,"ahmet@gmail.com");
        Student<String, Integer, String> std3 = new Student<>("Zeki",1323213,"zeki@gmail.com");
        System.out.println("Library kayit sistemindeki ögrenciler");
        System.out.printf("%-10s  ||  %4d  ||  %20s  %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s  ||  %4d  ||  %20s  %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s  ||  %4d  ||  %20s  %n",std3.getS(),std3.getU(),std3.getV());

    }
}
