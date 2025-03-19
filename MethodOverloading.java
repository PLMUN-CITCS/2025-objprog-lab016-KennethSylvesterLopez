public class MethodOverloading {
    // Main method
    public static void main(String[] args) {
        // Call the printValue methods
        printValue(10);
        printValue(3.14);
        printValue("Hello!");
    }

    // First printValue method: accepts an integer
    public static void printValue(int number) {
        System.out.println("Integer value: " + number);
    }

    // Second printValue method: accepts a double
    public static void printValue(double number) {
        System.out.println("Double value: " + number);
    }

    // Third printValue method: accepts a string
    public static void printValue(String text) {
        System.out.println("String value: " + text);
    }
}
