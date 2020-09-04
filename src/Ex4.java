import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int arraySize;
        System.out.print("How many numbers do you want to check?");
        arraySize = input.nextInt();
        int[] numbers = new int[arraySize];
        for(int i = 0; i<arraySize; i++){
            System.out.print("Please input number " + (i+1));
            numbers[i] = input.nextInt();
        }

        System.out.println(threeConsecutive(numbers));
    }

    public static boolean threeConsecutive(int[] numbers){
        boolean cons = false;

        for(int i = 0; i<(numbers.length-2); i++){
            if(numbers[i]==(numbers[i+1]-1) && numbers[i]==(numbers[i+2]-2)){
                cons = true;
            }
        }
        return cons;
    }
}

/*
Write a subroutine taking an array of integers as argument, returning true if that array contains three consecutive adjacent numbers, such as  4,  5,  6,  or  23, 24, 25.
Remember to check the corner cases!
The subroutine should always return a value, and not crash.

threeConsecutive({1, 4, 5, 6, 2})  ==>  true
threeConsecutive({1, 2, 3})        ==>  true
threeConsecutive({1, 2, 4})        ==>  false
threeConsecutive({1, 2, 4, 5})     ==>  false
*/

