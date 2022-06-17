package controlflowstatement;

public class BreakEx {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7)
                break;
            System.out.println("Value of i is:" + i);
        }
    }
}
