package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Mumbai");
        list.add("Pune");
        list.add("Chennai");
        list.add("Kolkata");
        System.out.println(list);
        System.out.println(list.size());
        list.add(3,"Bangalore");
        System.out.println(list);
        if (!list.isEmpty()){

        }
        System.out.println(list.get(2));
        System.out.println(list.contains("Madras"));
        System.out.println(list.indexOf("Bangalore"));
        //System.out.println(list.containsAll());
        System.out.println(list.remove("Kolkata"));
        System.out.println(list);
    }
}
