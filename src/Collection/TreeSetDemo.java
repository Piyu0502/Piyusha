package Collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(80);
        numbers.add(55);
        numbers.add(56);
        numbers.add(89);
        numbers.add(30);
        numbers.add(60);
        System.out.println(numbers);
        System.out.println(numbers.ceiling(97));
        System.out.println(numbers.floor(97));
    }
}
