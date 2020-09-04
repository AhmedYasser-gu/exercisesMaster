import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        int count;
        String text;
        Scanner input = new Scanner(System.in);
        System.out.print("Please input your text: ");
        text = input.nextLine();
        count = convert(text);
        System.out.println("The sum of the numbers in your text were " + count + ".");
        input.close();
    }

    public static int convert(String digits) {
        int numbers = 0;
        for (int i = 0; i < digits.length(); i++) {
            if (Character.isDigit(digits.charAt(i))) {
                numbers = numbers + Integer.parseInt(String.valueOf(digits.charAt(i)));
            }
        }
        return numbers;
    }
}
/*
Write a subroutine, which takes  a string as argument  and returns the sum of the digits 0-9 that appear in the string, ignoring all other characters.
The subroutine returns 0 if there are no digits in the string.
Note that Character.isDigit(c) tests if a character c is one of the characters '0', '1', .. '9' and Integer.parseInt(string)  converts a string to an integer.
Remember to check the corner cases!  The subroutine should always return a value and not crash.

sumDigits("aa1bc2d3") ==> 6 ->150
sumDigits("aa11b33") ==> 8 ->200
sumDigits("Chocolate") ==> 0 ->0
*/
