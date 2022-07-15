package Array;

public class Reverse {
    public static void main(String[] args) {
        int[] a1; // instantiation.
        //initialization
        a1 = new int[10];
        a1[0] = 100;
        a1[1] = 90;
        a1[2] = 80;
        a1[3] = 70;
        a1[4] = 60;
        a1[5] = 50;
        a1[6] = 40;
        a1[7] = 30;
        for (int i = 0; i < 10; i++) {
            System.out.println(a1[i] + "");
        }//for each loop.
        for(int i : a1){
            System.out.println(i);
        }
        System.out.println(a1[9]);
    }
}
