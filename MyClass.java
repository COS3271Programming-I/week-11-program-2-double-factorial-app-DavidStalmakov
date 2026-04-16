package projectdavid;
import java.util.Scanner;

///// Double Factorial
public class MyClass {
    
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getValidNumber();
        long result = doubleFactorial(number);

        System.out.println(number + "!! = " + result);
    }

    public static int getValidNumber() {
        int num;

        while (true) {
            System.out.print("Enter a positive integer less than 20: ");

            while (!input.hasNextInt()) {
                System.out.print("Invalid input. Enter a number: ");
                input.next();
            }

            num = input.nextInt();

            if (num >= 0 && num < 20) {
                return num;
            } else {
                System.out.println("Number must be between 0 and 19.");
            }
        }
    }

    public static long doubleFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * doubleFactorial(n - 2);
    }
}
    
    