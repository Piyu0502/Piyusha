package JavaPackage.p2;

//import JavaPackage.p1.A;
//import JavaPackage.p1.B;
import JavaPackage.p1.*;
import JavaPackage.p1.p3.c;
import JavaPackage.p1.p3.d;


public class PackageImpl {


    public static void main(String[] args) {
        //B b = new B();
        a a = new a();
        b b = new b();
        c c = new c();
        d d = new d();
        JavaPackage.p1.p3.a a1  = new JavaPackage.p1.p3.a();
    }
}