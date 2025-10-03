// DebugFive1
// Adds your lunch bill
// Burger and hot dog are $2.59
// Grilled cheese and fish are $1.99
// Fries are 89 cents
import java.util.*;

public class DebugFive1 {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        final double HIGH_PRICE = 2.59;
        final double MED_PRICE = 1.99;
        final double LOW_PRICE = 0.89;
        int usersChoice;
        double bill;  // BUG 1: 'bill' is declared but not initialized (e.g., to 0.0). It defaults to 0.0, but explicit initialization is safer and clearer to avoid potential issues.

        System.out.println("Order please 1 - Burger 2 - Hotdog");
        System.out.print("3 - Grilled cheese 4 - Fish sandwich >> ");
        usersChoice = kb.nextInt();
        
        if (usersChoice == 1 && usersChoice == 2) {  // BUG 2: Uses '&&' (logical AND), which can never be true for a single integer value (usersChoice can't be both 1 and 2 simultaneously). Should use '||' (logical OR) to check for burger (1) OR hotdog (2).
            bill = bill + HIGH_PRICE;
        } else {
            bill = bill + MED_PRICE;
        }
        
        System.out.print("Fries with that? 1 - Yes 2 - No >> ");
        usersChoice = kb.nextInt();
        
        if (usersChoice = 1) {  // BUG 3: Uses '=' (assignment operator) instead of '==' (equality comparison). This assigns 1 to usersChoice and always evaluates to true, adding fries price regardless of user input.
            bill = bill + LOW_PRICE;
        }
        
        System.out.println (Total bill is " + bill);  // BUG 4: Missing opening double quote before "Total". This results in a syntax error as the string literal is invalid (no opening quote for the full string).
    }
}
