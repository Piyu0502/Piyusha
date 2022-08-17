package StringDemo;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Codekul, Codekul";
        System.out.println("Upper Case: " + str.toUpperCase());
        System.out.println("Lower Case: " + str.toLowerCase());
        System.out.println("Char At: " + str.charAt(3));
        System.out.println("Concat: " + str.concat("Pvt . Ltd."));
        System.out.println("Replace: " + str.replace(str, "Mumbai"));
        System.out.println("Replace All: " + str.replaceAll("Codekul", "Mumbai"));
        System.out.println("Contains "+str.contains("brings"));
        System.out.println(str);
    }
}
