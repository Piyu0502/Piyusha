package FinalKeyword;

public class Person {
    final String AADHAAR_NO; //blank final variable
    final String MOBILE_NO; //blank final variable
    static final String BIRTH_DATE; //blank static final variable

    static {
        BIRTH_DATE = "15/09/1998";
    }
    Person(String aadhar_no, String mobileNo){
        AADHAAR_NO = aadhar_no;
        MOBILE_NO = mobileNo;
    }
}

class PersonImpl{
    public static void main(String[] args) {
        Person person = new Person("789865324152", "9865324152");
    }
}



