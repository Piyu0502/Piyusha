package Collection;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(105,"Maharahstra");
        map.put(103,"AP");
        map.put(104,"Goa");
        System.out.println(map);
        map.put(106,null);
        // map.put(null,"Kerala");//thro' Null pointer ex
        System.out.println(map);
    }
}

