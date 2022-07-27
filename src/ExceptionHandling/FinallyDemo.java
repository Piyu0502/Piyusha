package ExceptionHandling;

public class FinallyDemo {
    public static void main(String[] args) {
        String msg = "PUNE";
        try{
            System.out.println(msg.length());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("in Finally Block");
        }
        System.out.println("Rest of the code");
    }
}
