package OOPS;

import java.util.Scanner;

public class PersonInfo {
      String name;
      String address;
      Float height;
      int age;

      void insertData(String nm,String addr, Float h, int a){
          name = nm;
          address = addr;
          height = h;
          age = a;
      }
      void display() {
          System.out.println("!!!!!!!!! PERSON DETAILS !!!!!!!!!!");
          System.out.println("Name:" + name);
          System.out.println("Address:" + address);
          System.out.println("Height:" + height);
          System.out.println("Age:" + age);
      }
}
class PersonInfo1{
    public static void main(String[] args){
        PersonInfo p1 = new PersonInfo();
        p1.name = "Amit";
        p1.address = "Kothrud";
        p1.height = 5.6f;
        p1.age = 56;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String nm = sc.next();
        System.out.println("Enter Address:");
        String addr = sc.next();
        System.out.println("Enter Height");
        float height = sc.nextFloat();
        System.out.println("Enter Age");
        int age = sc.nextInt();
        PersonInfo p2 = new PersonInfo();
        p2.insertData(nm, addr, height, age);
        p2.display();

    }
}
