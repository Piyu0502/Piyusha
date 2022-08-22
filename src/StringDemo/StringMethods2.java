package StringDemo;

public class StringMethods2 {
    public static void main(String[] args) {
        String s1 = "Pune";
        String s2 = "Pune";
        String s3 = new String("Pune");
        if (s1 == s2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s1 == s3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s1.equals(s2)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        if (s1.equals(s3)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}

