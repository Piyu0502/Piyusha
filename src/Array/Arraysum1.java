package Array;

public class Arraysum1 {
    public static void main(String[] args) {
        int[] a1;
        a1 = new int[5];
        a1[0] = 1;
        a1[1] = 2;
        a1[2] = 3;
        a1[3] = 4;
        a1[4] = 5;
        int sum = 0;
        for (int i = 0; i < 5; i++){
            sum = sum + a1[i];
        }
        System.out.println("Sum = "+sum);

    }

}
