package Array;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the array");
        int size = scanner.nextInt();
        int Array[] = new int[size];
        int sum = 0;
        System.out.println("Enter the Elements of the array");
        for (int i = 0; i < size; i++) {
            Array[i] = scanner.nextInt();
        }
        for (int i = 0; i < Array.length; i++) {
            sum = sum + Array[i];
        }
        System.out.println("Sum = " + sum);
    }
}
