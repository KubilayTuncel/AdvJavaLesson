package Serialization;

import java.io.*;

public class serialization_Deserialization {


    public static void main(String[] args) {
        //writeObjects();
        readObjects();
    }

    private static void writeObjects(){
        System.out.println("User Objeleri olusturuluyor");
        User user1 = new User(1L,"Yunus","4122357907");
        User user2 = new User(2L,"Yusuf","3122357907");
        User user3 = new User(3L,"Betül","9872357907");

        try (FileOutputStream fos = new FileOutputStream("user.dat")) { //bu satir dosyanin yazilmasi icin
                try(ObjectOutputStream oos = new ObjectOutputStream(fos)) { //Objeleri yazmak icin
                    oos.writeObject(user1);
                    oos.writeObject(user2);
                    oos.writeObject(user3);
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void readObjects() {
        //Java da File islemlerinde okuma islemi yaparken FileInputStream classi kullanilir

        try(FileInputStream fis = new FileInputStream("user.dat")) { //okunacak dosyayi belirledik.
            try(ObjectInputStream ois = new ObjectInputStream((fis))){ //Obje olarak okunacak
                User user1 = (User) ois.readObject();
                User user2 = (User) ois.readObject();
                User user3 = (User) ois.readObject();
                System.out.println(user1);
                System.out.println(user2);
                System.out.println(user3);

            }catch (ClassNotFoundException e){
                throw new RuntimeException(e);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
