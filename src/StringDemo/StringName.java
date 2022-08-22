package StringDemo;

import java.util.Scanner;

public class StringName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        String[] nameArray = name.split(" ");
        System.out.println(nameArray.length);
        for (String s : nameArray) {
            System.out.println(s);
        }
        char firstInitial = nameArray[0].toUpperCase().charAt(0);
        char middleInitial = nameArray[1].toUpperCase().charAt(0);
        String initialName = firstInitial+"."+middleInitial+"."+nameArray[2];
        System.out.println(initialName);
    }
}
