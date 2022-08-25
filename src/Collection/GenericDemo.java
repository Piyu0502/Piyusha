package Collection;

import java.util.List;

public class GenericDemo<E> {
    E t;
    E getValue(E t) {
        this.t = t;
        return t;
    }

    public static void main(String[] args) {
        GenericDemo demo = new GenericDemo();
        System.out.println(demo.getValue(5));
        System.out.println(demo.getValue("Hi"));
        System.out.println(demo.getValue(true));
    }
}

