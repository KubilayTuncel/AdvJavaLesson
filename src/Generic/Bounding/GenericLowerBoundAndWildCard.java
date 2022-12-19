package Generic.Bounding;

import java.util.ArrayList;
import java.util.List;

public class GenericLowerBoundAndWildCard {

    public static void main(String[] args) {

        List<Object> ol = new ArrayList<>();
        addElements(ol);

        List<Number> nl = new ArrayList<>();
        addElements(nl);

       // List<Double> dl = new ArrayList<>();
       // addElements(dl); //CompaleTimeException

        printElements(new ArrayList<String>());

        List<String> stringList = new ArrayList<>();
        // printObj(stringList); //CTE

        List<Object> objectList = new ArrayList<>();
        printObj(objectList);

    }

    //Lower Bound a örnek Integer in parent class larini alabiliriz.
    //süper Integer ---> bana Integer'in parent'larini getirir.
    public static void addElements (List<? super Integer> list) {

        // ? : WildCard manasinda (tipi bilinmeyen)

        for (int i=1; i<=10;i++){
            list.add(i);
        }
    }

    public static void printObj(List<Object> listOfObject) {
        listOfObject.add("Java");

        for (Object object:listOfObject
             ) {
            System.out.println(object);
        }
    }

    public static void printElements (List<?> listOfUnknown) {

        for (Object object:listOfUnknown) {
            System.out.println(object);

        }
    }

}
