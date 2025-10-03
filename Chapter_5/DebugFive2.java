// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;

public class DebugFive2 {
    public static void main(String args[]) {
        int num;
        int num2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number ");
        num = input.nextInt;  // BUG 1: Missing parentheses '()'. nextInt is a method call and requires 'input.nextInt();' to invoke it properly. Without them, this is treated as assigning the method reference, causing a compilation error.
        
        System.out.print("Enter another number ");
        num2 = input.nextInt;  // BUG 2: Missing parentheses '()'. Same issue as above; should be 'input.nextInt();' to read the integer input correctly.
        
        if ((num % num2 == 0) && (num2 / num) == 0) {  // BUG 3: Incorrect logic for checking even divisibility. The condition uses '&&' (AND) and checks if num is divisible by num2 (correct part: num % num2 == 0), but the second part (num2 / num == 0) only checks if num2 < num via integer division, not if num2 is evenly divisible by num. To check if one number is evenly divisible into the other (in either direction), it should be '||' (OR) and use modulo for both: (num % num2 == 0) || (num2 % num == 0). Additionally, this risks division by zero (ArithmeticException) if num == 0 or num2 == 0, but no handling is present.
            System.out.println("One of these numbers is");
            System.out.println(" evenly divisible into the other");
        } else {
            System.out.println("Neither of these numbers is");
            System.out.println(" evenly divisible into the other");
        }
    }
}
