package Array;

public class ArrayDemo1 {
    public static void main(String[] args) {
        int[] a1; // instantiation.
        //initialization
        a1 = new int[10];
        a1[0] = 10;
        a1[1] = 20;
        a1[2] = 30;
        a1[3] = 40;
        a1[4] = 50;
        for (int i = 0; i < 10; i++) {
            System.out.println(a1[i] + "");
        }//for each loop.
        for(int i : a1){
            System.out.println(i);
        }
        System.out.println(a1[9]);
    }
}
