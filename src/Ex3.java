import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int start;
        int end;
        int amountNumbers;
        boolean positiveDir;
        System.out.println("What's your start value? ");
        start = input.nextInt();
        System.out.println("What's your end value?");
        end = input.nextInt();

        if(start <= end){
            positiveDir = true;
            amountNumbers = end - start;
        }
        else {
            positiveDir = false;
            amountNumbers = start - end;
        }

        int[] list = new int[amountNumbers];
        list = fizzArray(start, end, amountNumbers, positiveDir);

        System.out.print("The fizzed array is: {");
        for(int i = 0; i < amountNumbers; i++){
            System.out.println(list[i]);
            if (i!=amountNumbers-1){
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
    public static int[]fizzArray(int start, int end, int size, boolean dir){
        int[] fizzedNumbers = new int[size];
        for(int i = 0; i<size; i++){
            fizzedNumbers[i] = start++;
        }
        return fizzedNumbers;
    }
}

/*
Write a subroutine takes as argument  start and  end integers, and returns a new array containing the sequence of integers from  start up to but not including end.
For instance,  start=5 and  end=10 yields the array {5, 6, 7, 8, 9}.
You can assume the  end number is greater or equal to the  start number.
Note that an array of length 0 is also a valid array.

fizzArray3(5, 10) -> {5, 6, 7, 8, 9}
fizzArray3(11, 18) -> {11, 12, 13, 14, 15, 16, 17}
fizzArray3(1, 3) -> {1, 2}
fizzArray3(1, 1) -> {}

*/