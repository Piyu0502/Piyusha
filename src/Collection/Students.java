package Collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        List<String> Students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Old ID:");
        String ID = sc.next();
        System.out.println("Enter Student's First Name: ");
        String fName = sc.next();
        System.out.println("Enter Student's Middle Name: ");
        String mName = sc.next();
        System.out.println("Enter Student's Last Name: ");
        String lName = sc.next();
        System.out.println("Enter Student's Contact Number: ");
        String contactNo = sc.next();
        System.out.println("Do you want to change your ID? ");
        System.out.println("1. YES");
        System.out.println("2. NO");
        String A = null;
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter new ID: ");
                A = sc.next();
                break;

            case 2:
                System.out.println("Your ID is: "+ID);
                break;

            default:
                System.out.println("Either Select 1 or 2");
        }
        if (choice==1){
            Students.add(A);
            Students.add(fName);
            Students.add(mName);
            Students.add(lName);
            Students.add(contactNo);
            System.out.println(Students);
        } else {
            Students.add(ID);
            Students.add(fName);
            Students.add(mName);
            Students.add(lName);
            Students.add(contactNo);
            System.out.println(Students);
        }
    }
}
