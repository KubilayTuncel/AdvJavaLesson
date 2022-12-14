package Generic;

public class GenericTypeTwoParameter<S,U> {

    private S s;
    private U u;

    public GenericTypeTwoParameter(S s, U u) {
        this.s = s;
        this.u = u;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public static void main(String[] args) {

        GenericTypeTwoParameter<String, Integer> obj1= new GenericTypeTwoParameter<>("Java",1);
        GenericTypeTwoParameter<Integer, String> obj2= new GenericTypeTwoParameter<>(1,"SpringBoot");

        System.out.println(obj1.getS());
        System.out.println(obj1.getU());
    }
}
