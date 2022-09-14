package Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
        map.put(1,"Amit");
        map.put(2,"Soniya");
        map.put(3,"David");
        map.put(4,"Prashant");
        System.out.println(map);
        map.put(null,null);
        map.put(null,"Vaibhav");
        System.out.println(map);
    }
}
