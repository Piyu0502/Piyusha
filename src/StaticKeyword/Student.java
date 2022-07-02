package StaticKeyword;

public class Student {
    int rno;
    String name;
    static String schoolName;

    void display() {
        System.out.println(rno + " " + name + " " + schoolName);
    }
}

class StudentImpl {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Amit";
        s1.rno = 1;
        s1.schoolName = "JJ";
        Student s2 = new Student();
        s2.name = "Rahul";
        s2.rno = 2;
        s2.schoolName = "JJ";
        Student s3 = new Student();
        s3.name = "Mohan";
        s3.rno = 3;
        s3.schoolName = "JJ";
        s1.display();
        s2.display();
        s3.display();
    }
}