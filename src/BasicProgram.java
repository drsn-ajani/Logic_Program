import java.util.*;

public class BasicProgram {
    // 1. Fibonacci Series
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + ", " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // 2. Perfect Number
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // 3. Prime Number
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // 4. Reverse a Number
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        return reverse;
    }

    // 5. Coupon Numbers
    public static void generateCoupons(int n) {
        Set<Integer> coupons = new HashSet<>();
        Random random = new Random();
        int count = 0;

        while (coupons.size() < n) {
            int newCoupon = random.nextInt(n) + 1;
            coupons.add(newCoupon);
            count++;
        }

        System.out.println("Total random numbers generated to get all distinct coupons: " + count);
    }

    // 6. Stopwatch Program
    public static void simulateStopwatch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press ENTER to start the stopwatch.");
        scanner.nextLine();
        long startTime = System.currentTimeMillis();

        System.out.println("Press ENTER to stop the stopwatch.");
        scanner.nextLine();
        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        System.out.println("Elapsed time: " + elapsedTime + " milliseconds.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select a program to run:");
        System.out.println("1. Fibonacci Series\n2. Perfect Number\n3. Prime Number\n4. Reverse a Number\n5. Coupon Numbers\n6. Stopwatch Program");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter the number of terms: ");
                int n = scanner.nextInt();
                fibonacciSeries(n);
                break;
            case 2:
                System.out.print("Enter a number to check if it is a Perfect Number: ");
                int num = scanner.nextInt();
                System.out.println(num + " is a Perfect Number: " + isPerfectNumber(num));
                break;
            case 3:
                System.out.print("Enter a number to check if it is a Prime Number: ");
                num = scanner.nextInt();
                System.out.println(num + " is a Prime Number: " + isPrime(num));
                break;
            case 4:
                System.out.print("Enter a number to reverse: ");
                num = scanner.nextInt();
                System.out.println("Reversed Number: " + reverseNumber(num));
                break;
            case 5:
                System.out.print("Enter the number of distinct coupons: ");
                n = scanner.nextInt();
                generateCoupons(n);
                break;
            case 6:
                simulateStopwatch();
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}
