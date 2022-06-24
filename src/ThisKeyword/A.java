package ThisKeyword;

public class A {
    int n;

    void m(A a) {
        System.out.println("Call Current class method m");
    }

    void n() {
        System.out.println("n method gets called");
        m(this);
        System.out.println("Exit from n");
    }

    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}
