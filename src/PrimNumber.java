import java.util.Scanner;

public class PrimNumber {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please enter number greater than 2");
        Integer number1 = sc.nextInt();
        System.out.println("please enter number greater than 2");
        Integer number2 = sc.nextInt();
        Integer min = Math.min(number2, number1);
        Integer max = Math.max(number2, number1);
        Integer counter = 0;
        if (min < 2) {
            System.out.println("first or second number are less than 2");
        } else {
            for (Integer i = min; i < max; i++) {
                if (primeNumber(i)) {
                    System.out.println("prime Number : " + i);
                    counter++;
                }
            }
            System.out.println("counter : " + counter);
        }
    }

    public static boolean primeNumber(int n) {
        if (n == 1 || n == 0) {
            System.out.println("zero or one is not a prime number");
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println(n + " is not a prime number");
                return false;
            }
        }
        System.out.println(n + " is a prime number");
        return true;
    }
}

