package Practice.generics.methods;

import java.util.Arrays;

public class GenericMethod {

    public static void main(String[] args) {


        String[] stdList={"Rafael","Donatello","Leonardo","Michelangelo"};
        Double[] pointList={95.5,70.0,65.6,58.0};
        Character[] gradeList={'A','B','C','B'};

        //1-tüm listeleri yazdır

        //2-öğrencileri isimlerine göre sıralayınız
        GenericMethod obj1 = new GenericMethod();
        System.out.println(Arrays.toString(obj1.ögrSirala(stdList)));

        //3-öğrenci notlarını sıralayınız

        System.out.println(Arrays.toString(obj1.ögrSirala(pointList)));

        //4-öğrenci harf notlarını sıralayınız

        System.out.println(Arrays.toString(obj1.ögrSirala(gradeList)));
        //-diziyi yazdıran bir method yazınız.

        //-diziyi artan sıralayan bir method yazınız.
    }




    public <T> void printArray(T[] array){

        for (T t:array
             ) {
            System.out.println(t);
        }

    }

    public <T extends Comparable<T>> T[] ögrSirala(T[] array){

        for (int i = 0; i< array.length;i++) {

            for (int j=i+1; j< array.length;j++) {
                if (array[i].compareTo(array[j])>0) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                }
            }
        }

        return array;
    }
}
