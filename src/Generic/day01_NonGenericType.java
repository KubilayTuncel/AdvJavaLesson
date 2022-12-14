package Generic;

public class day01_NonGenericType {
    private Object object;

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public static void main(String[] args) {

        day01_NonGenericType obj1 = new day01_NonGenericType();
        day01_NonGenericType obj2 = new day01_NonGenericType();

        obj1.setObject("Kubilay");
        obj2.setObject(65);

        String str1 = (String) obj1.getObject(); // cast problemi

        String str2 = (String) obj2.getObject(); // rte problemi yani ClassCastException

        //String.valueOf(obj2.getO());
        //Integer.parseInt(String);

    }
}
