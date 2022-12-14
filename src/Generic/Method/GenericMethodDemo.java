package Generic.Method;

public class GenericMethodDemo {

    //Generic methodar bize kolaylik sagliyor.

    public static void main(String[] args) {
        GenericMethodDemo obj1 = new GenericMethodDemo();
        Integer[] intArrays = {1, 23, 54, 56, 45};
        Double[] doubleArray = {1.2, 2.4, 5.6, 9.3};

        obj1.print(intArrays);
        obj1.print(doubleArray);

    }
    /*Kötü örnek
    public void  print(Integer[] arr) {

    }

    public void print (Double[] arr1){

    }

     */

    public <T> void print(T[] array) {
        for (T t:array
             ) {
            System.out.println(t);
        }
    }
}
