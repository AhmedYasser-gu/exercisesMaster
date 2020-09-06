import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the amount of numbers in the palindrome and the max number of digits that can be altered, with a space separating them.");
        String firstLine = input.nextLine();
        System.out.println("Please input the numbers you want to check for a palindrome.");
        String palindrome = input.nextLine();
        //input.next
    }
}

/*

On her 7-th birthday, Sandy's uncle, Richie Rich, offered her an n-digit check which she refused because the number was not a palindrome.
Richie then challenged Sandy to make the number palindromic by changing no more than k digits.
Sandy can only change 1 digit at a time, and cannot add digits to (or remove digits from) the number.

Given k and an n-digit number, help Sandy determine the largest possible number she can make by changing <=k digits.

Note: Treat the integers as numeric strings.
Leading zeros are permitted and can't be ignored (So 0011 is not a palindrome, 0110 is a valid palindrome).
A digit can be modified more than once.

Input Format
The first line contains two space-separated integers, (the number of digits in the number) and (the maximum number of digits that can be altered), respectively.
The second line contains an n-digit string of numbers that Sandy must attempt to make palindromic.

Constraints
1. 0 < n <= 10^5
2. 0 <= k <= 10^5
3. Each character i in the number is an integer where 0 <= i <= 9

Output Format
Print a single line with the largest number that can be made by changing no more than k digits; if this is not possible, print -1.

Sample Input: 0

4 1
3943

Sample Output: 0

3993

Sample Input: 1

6 3
092282

Sample Output: 1

992299

Sample Input: 2

4 1
0011

Sample Output: 2

-1

 */