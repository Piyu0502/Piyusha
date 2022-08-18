package StringDemo;

public class ImmutableDemo {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Pune";
        s1 = "Mumbai";
        System.out.println(s1.concat(" City"));
        System.out.println(s1);
        System.out.println(s2);

        int n1 = 10;
        int n2 = 10;
        n1 = n2 + 10;
        System.out.println(n1);
        System.out.println(n2);
    }
}
