import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        int arraySize;
            System.out.print("How many numbers do you want to input? ");
            arraySize = input.nextInt();
        int[] numbers = new int[arraySize];
        int[] outputNumbers = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            System.out.print("Please input number " + (i+1) + ": ");
            numbers[i] = input.nextInt();
        }
    outputNumbers = shiftLeft(arraySize, numbers);
        System.out.print("Your array looks like the following: {");
        for(int j = 0; j < arraySize; j++){
            System.out.print(outputNumbers[j]);
            if (j!=arraySize-1){
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    public static int[] shiftLeft(int loops, int[] numbers){
    int firstNumber = numbers[0];
    for(int i = 0; i < (loops-1); i++){
        numbers[i] = numbers[i+1];
    }
    numbers[loops-1] = firstNumber;
    return numbers;
    }

}
/*Write a subroutine takes as argument an array of integers  and returns an array that is left shifted by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.
Remember to check the corner cases!
The subroutine should always return a value and not crash.

shiftLeft({6, 2, 5, 3}) -> {2, 5, 3, 6}
shiftLeft({1, 2}) -> {2, 1}
shiftLeft({1}) -> {1}
*/


