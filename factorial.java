public class factorial {
    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 5; // Example number
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
