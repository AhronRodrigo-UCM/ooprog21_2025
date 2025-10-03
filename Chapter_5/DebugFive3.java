// DebugFive3.java
// Determines whether item number on order is valid
// Over 999 invalid
// Less than 111 Invalid
// Valid and less than 500 - Automotive Department
// Valid and 500 or higher Housewares Department
import java.util.Scanner;

public class DebugFive3 {
    public static void main(String args[]) {
        int item;
        String output;
        final int LOW = 111;
        final int HIGH = 999;
        final int CUTOFF = 500;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter item number >> ");
        item = input.nextInt();
        
        if (item > LOW) {  // Bug 1: This checks if the item is greater than 111, but it should actually check if it's less than 111 to catch "too low" numbers. Right now, it's backwards.
            output = "Item number too low";
        } else if (item >= HIGH) {  // Bug 2: There's a typo here—'HIGHH' should be 'HIGH'. Plus, for numbers over 999, it should be item > HIGH (since HIGH is 999). And this branch only runs if the item is <= 111 from the first check, so the logic is all flipped.
            output = "Item number too high";
        } else if (item == CUTOFF) {  // Bug 3: This only flags exactly 500 as Automotive, but it should be anything less than 500 for Automotive. The else would then handle 500+ as Housewares, but the whole chain breaks because of the earlier issues—valid items might get misclassified or not checked at all.
            output = "Valid - Item in Automotive Department";
        } else {
            output = "Valid - Item in Housewares Department";
        }
        
        System.out.println(output);
    }
}
