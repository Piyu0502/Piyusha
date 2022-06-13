public class Operators {
    public static void main(String []args){

       //Unary operator program
        int a = 10;
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        int x = 10;
        int b = 10;
        System.out.println(x++ + ++x); //10+12 = 22
        System.out.println(b++ + b++); //10+11 = 21

        //Tild Operator
        System.out.println("~a="+(~a));

        // Arithmatic Operator

        int c = 10;
        int y = 20;
        int z = 30;
        System.out.println(c + y); // 10 + 20 = 30
        System.out.println(y - c); // 20 - 10 = 10
        System.out.println(c * y); // 10 * 20 = 200
        System.out.println(z / c); // 30 / 10 = 3
        System.out.println(z % c); // 30 % 10 = 0

        // Shift Operator

        System.out.println(10<<2); //10*2^2 = 10 * 4 = 40
        System.out.println(20<<2); //20*2^2 = 20 * 4 = 80
        System.out.println(10>>2); //10/2^2 = 10/4 = 2
        System.out.println(20>>3); //20/2^3 =20/8 = 2

        //Logical operator

        System.out.println(c<y&&y<c);// True && false = false
        System.out.println(c<y&z<y); // true & false
        System.out.println(c<y||y<z); // true || true = true
        System.out.println(c<y|y<z); //true | true = true

        //Ternary Operator

        

    }

}