package controlflowstatement;

public class SwapNumber {
    public static void main(String[] args){
        int a=10;
        int b=30;
        System.out.println("!!!!!!Swap two numbers using two variables!!!!!!!");
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a :" +a);
        System.out.println("b :" +b);
    }
}
