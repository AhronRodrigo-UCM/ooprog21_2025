// DebugFive4.java
// Outputs highest of four numbers
import java.util.*;

public class DebugFive4 {
    public static void main(String args[]) {
        int one, two, three, four;
        int highest;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an integer >> ");
        one = input.nextInt();  
        
        System.out.print("Enter an integer >> ");
        one = input.nextInt();  // Bug 1: this overwrites 'one' instead of setting 'two'. The next two inputs do the same, so 'two', 'three', and 'four' stay at 0 (default value), making all comparisons wrong.
        
        System.out.print("Enter an integer >> ");
        one = input.nextInt();  // Bug 2: Same issue—should be 'three = input.nextInt();' to capture the third number.
        
        System.out.print("Enter an integer >> ");
        one = input.nextInt();  // Bug 3: overwriting 'one'; should be 'four = input.nextInt();' for the fourth number.
        
        if (one > two && one > three && one > four) {
            highest = one;
        } else if (two > one && two > three || two > four) {  // Bug 4: The logic here is flawed due to operator precedence—it's like ((two > one && two > three) || two > four), which doesn't properly check if 'two' is bigger than all three others. Should use && for all: two > one && two > three && two > four. Plus, since two is 0, this won't trigger anyway.
            highest = two;
        } else if (three == one && three > two && three > four) {  // Bug 5: Why check three == one? That doesn't make sense for finding the max—it should be three > one to see if three is bigger than one. And again, use && for all comparisons: three > one && three > two && three > four. With three at 0, this is pointless.
            highest = three;
        } else {
            highest = four;  // Bug 6: This assumes 'four' is the highest by default, but since four is 0 and the prior conditions are broken, it'll almost always pick 0 unless the first input (one) is positive and bigger than 0s.
        }
        
        System.out.println("The highest number is " + highest);
    }
}
