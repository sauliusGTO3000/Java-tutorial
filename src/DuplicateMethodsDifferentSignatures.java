public class DuplicateMethodsDifferentSignatures {
    public static void main(String[] args) {
        duplicateMethod("test string", 5);
        duplicateMethod("test string 2");
        duplicateMethod();
    }

    public  static void duplicateMethod(String string, int integer) {
        System.out.println("this is first duplicate method string: " +  string + ", integer: " + integer);
    }

    public  static void duplicateMethod(String string) {
        System.out.println("this is second duplicate method, only string: " +  string) ;
    }

    public  static void duplicateMethod() {
        System.out.println("hey I got nothing to take") ;
    }


}
