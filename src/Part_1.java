public class Part_1 {

    public static void main(String[] args) {
        // Call myMethod
        int result = myMethod(5);
        System.out.println("Result from myMethod: " + result);

        // Call myMethod2
        myMethod2();
    }

    public static int myMethod(int input) {
        System.out.println("Inside myMethod");
        int result = input * 2;

        // Call myMethodNumberTwo
        myMethodNumberTwo();

        // Call myMethodNumberThree and return the result
        int subResult = myMethodNumberThree();
        return result + subResult;
    }

    public static void myMethodNumberTwo() {
        System.out.println("Inside myMethodNumberTwo");
        // Perform some specific task for myMethodNumberTwo
    }

    public static int myMethodNumberThree() {
        System.out.println("Inside myMethodNumberThree");
        // Perform some specific task for myMethodNumberThree
        return 10;
    }

    public static void myMethod2() {
        System.out.println("\nInside myMethod2");

        // Call myMethodNumber21
        myMethodNumber21();

        // Call myMethodNumber22
        myMethodNumber22();
    }

    public static void myMethodNumber21() {
        System.out.println("Inside myMethodNumber21");
        // Perform some specific task for myMethodNumber21
    }

    public static void myMethodNumber22() {
        System.out.println("Inside myMethodNumber22");
        // Perform some specific task for myMethodNumber22
    }
}
