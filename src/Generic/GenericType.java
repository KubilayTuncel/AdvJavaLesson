package Generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericType<T> {


    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        // generic yapi kullanilarak ayni class'tan iki farkli data türünde obje olusturalim.
        GenericType<String> obj1 = new GenericType<>();
        // Trick : diamond <> icine sadece non-primitive type kullanabiliriz.

        obj1.setType("Generic Type");
       //GenericType<String> obj2 = new GenericType<>();
        //obj2.setType(65); burada string girmemiz gerekirken int data türü girdigimiz icin hata verir.

        // Not: Cast probleminden nasil kurtulurum.

        GenericType<Integer> obj3 = new GenericType<>();
        obj3.setType(65);
        int a = obj3.getType(); //Cast probleminden kurtulduk.

        // Not: ClassCastException probleminden nasil kurtuluruz

        List<String> list =new ArrayList<>();

        list.add("Alper");
        list.add("Halide");
        //list.add(22); //ClassCastException dan kurtulduk.
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Generic");
    }
}
