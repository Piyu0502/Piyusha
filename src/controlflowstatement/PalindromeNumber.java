package controlflowstatement;

public class PalindromeNumber {
    public static void main(String[] args) {
        int no = 13;
        int temp = no;
        int rev = 0, rem;
        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if (no == rev) {
            System.out.println("Number is palindrome");
        } else {
            System.out.println("Number is not a palindrome number");
        }
    }
}
