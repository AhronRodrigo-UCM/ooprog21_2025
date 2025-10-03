// DebugFive2.java
// Decides if two numbers are evenly divisible
import java.util.Scanner;

public class DebugFive2 {
    public static void main(String args[]) {
        int num;
        int num2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a number ");
        num = input.nextInt;  // BUG 1: Missing '()' on nextInt() method call; causes compilation error.
        
        System.out.print("Enter another number ");
        num2 = input.nextInt;  // BUG 2: Missing parentheses '()'. Same issue as above; should be 'input.nextInt();' to read the integer input correctly.
        
        if ((num % num2 == 0) && (num2 / num) == 0) {  // BUG 3: Incorrect logic. Use '||' (OR) for either direction; change (num2 / num == 0) to (num2 % num == 0). Risks division by zero if num or num2 is 0.
            System.out.println("One of these numbers is");
            System.out.println(" evenly divisible into the other");
        }
    }
}

