public class Part_1 {
    public static void main(String[] args) {
        // Call methods with different types of arguments
        int sum = add(25, 9);
        double product = multiply(9, 55);
        String greeting = createGreeting("Dmitriy");

        // Call methods without return values
        printMessage("How are you feeling today? :)");
        printSumAndProduct(sum, product);

        // Call a method with different types for return values
        int[] numbers = {89, 55, 92, 41, 6};
        int maxNumber = findMax(numbers);

        // Handle the returned value
        System.out.println("The maximum number in the array is: " + maxNumber);
    }

    // Method with int arguments and an int return value
    public static int add(int a, int b) {
        return a + b;
    }

    // Method with double arguments and a double return value
    public static double multiply(double x, double y) {
        return x * y;
    }

    // Method with String argument and a String return value
    public static String createGreeting(String name) {
        return "Hello, " + name + "!";
    }

    // Method without return value (void)
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Method without return value, but with multiple arguments
    public static void printSumAndProduct(int sum, double product) {
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }

    // Method with int array argument and an int return value
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
