public class Part_2 {
    public static void main(String[] args) {
        int number = 10;

        int doubled = doubleNumber(number);
        System.out.println("Doubled number: " + doubled);

        int squared = squareNumber(number);
        System.out.println("Squared number: " + squared);

        int result = performComplexCalculation(number);
        System.out.println("Result of complex calculation of doubled and squared number: " + result);
    }

    // Method to double a number
    private static int doubleNumber(int num) {
        return num * 2;
    }

    // Method to square a number
    private static int squareNumber(int num) {
        return num * num;
    }

    // Method to perform a complex calculation using other methods
    private static int performComplexCalculation(int num) {
        int doubled = doubleNumber(num);
        int squared = squareNumber(num);
        int result = doubled + squared;
        return result;
    }
}