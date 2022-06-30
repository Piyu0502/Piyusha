package controlflowstatement;

public class Divider_3_5 {
    public static void main(String[] args) {
        System.out.println("Numbers Divisible by 3");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i + "");
            }
        }
        System.out.println("\t");
        System.out.println("Numbers Divisible by 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.println(i + ", ");
            }
        }
        System.out.println("\t");
        System.out.println("Numbers Divisible by both 3 and 5");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ", ");
            }
        }
        System.out.println("\t");
    }
}
