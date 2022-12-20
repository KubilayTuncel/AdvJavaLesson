package Practice.Serialization;

//Book tipinde nesneler üretip bu nesneleri books.txt dosyasina kaydedipsonra bu dosyadan nesneleri okuyun.

import java.io.*;

public class SerializationPractice {
    public static void main(String[] args) {
        //writeObjects();
        readObjects();

    }

    public static void writeObjects() {

        Book book1 = new Book("Sefiler","Victor Hugo", 1945);
        Book book2 = new Book("Suc ve Ceza","Dostoyevski", 1955);
        Book book3 = new Book("savas ve Baris","Tolstoy", 1940);

        try {
            FileOutputStream fos = new FileOutputStream("books.dat");
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos);

                oos.writeObject(book1);
                oos.writeObject(book2);
                oos.writeObject(book3);
                oos.close();
                fos.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void readObjects() {

        try {
            FileInputStream fis = new FileInputStream("books.dat");

            ObjectInputStream ois = new ObjectInputStream(fis);

            Book book1 = (Book) ois.readObject();
            Book book2 = (Book) ois.readObject();
            Book book3 = (Book) ois.readObject();

            System.out.println(book1);
            System.out.println(book2);
            System.out.println(book3);
            ois.close();
            fis.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
