package StringDemo;

public class Person {
    private int pid;
    private String Name;
    private int MobileNo;
    private String EmailID;

    @Override
    public String toString() {       //Object Class
        return "Person{" +
                "pid=" + pid +
                ", Name='" + Name + '\'' +
                ", MobileNo=" + MobileNo +
                ", EmailID='" + EmailID + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.pid = 1234;
        p.Name = "Piyusha";
        p.MobileNo = 123445665;
        p.EmailID = "p@gmail.com";
        System.out.println(p.toString());



    }
}

