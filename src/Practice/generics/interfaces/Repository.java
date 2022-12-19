package Practice.generics.interfaces;

public interface Repository <T>{

    /*
    -oluşturan
   -görüntüleyen
   -güncelleyen
   -silen
     */

    void create(T t);
    void get(T t);
    void update(T t);
    void delete(T t);


}
