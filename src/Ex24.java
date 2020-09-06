import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input number that you want to divide: ");
        double n = input.nextInt();
        System.out.print("Input first dividing number: ");
        int x = input.nextInt();
        System.out.print("Input second dividing number: ");
        int y = input.nextInt();

        isDivisible(n, x, y);
        input.close();
    }

    public static void isDivisible(double n, int x, int y) {
        if (((n / x) % 2 == 0) && ((n / y) % 2 == 0)) {
            System.out.println("True because " + n + " is divisible by " + x + " and " + y);
        } else if (((n / y) % 2 != 0) && ((n / x) % 2 != 0)) {
            System.out.println("False because " + n + " is neither divisible by " + x + " nor " + y);
        } else if ((n / y) % 2 != 0) {
            System.out.println("False because " + n + " is not divisible by " + y);
        } else if ((n / x) % 2 != 0) {
            System.out.println("False because " + n + " is not divisible by " + x);
        } else
            System.out.println("Error");
    }
}

/*
isDivisible: Create a function isDivisible(n, x, y) that checks if a number n is divisible by two numbers x AND y. All inputs are positive, non-zero digits.

isDivisible(3,1,3)     → true because 3 is divisible by 1 and 3
isDivisible(12,2,6)    → true because 12 is divisible by 2 and 6
isDivisible(100,5,3)   → false because 100 is not divisible by 3
isDivisible(12,7,5)    → false because 12 is neither divisible by 7 nor 5

 */