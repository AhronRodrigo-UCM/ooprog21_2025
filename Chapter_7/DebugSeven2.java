// Program prompts user to enter a series of integers
// separated by spaces
// Program converts them to numbers and sums them
import java.util.*;
public class DebugSeven2
{
    public static void main(String[] args)
    {
        String str;
        int x;
        int length;
        int lastSpace = -1;
        int sum = 0;
        String partStr;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a series of integers separated by spaces >> ");
        str = in.nextLine();

        // FIX: str.length() instead of str.len()
        length = str.length();

        // FIX: use 'length' instead of 'len'
        for(x = 0; x < length; ++x)
        {
            if(str.charAt(x) == ' ')
            {
                partStr = str.substring(lastSpace + 1, x);
                int num = Integer.parseInt(partStr);
                System.out.println(" " + num);
                sum += num;
                lastSpace = x;
            }
        }

        // Get last number
        partStr = str.substring(lastSpace + 1, length);

        // FIX: correct variable name Integer.parseInt(partStr)
        int num = Integer.parseInt(partStr);
        System.out.println(" " + num);

        // FIX: should add to sum, not replace sum
        sum += num;

        System.out.println("-------------------" +
            "\nThe sum of the integers is " + sum);
    }
}


// FIXEDD: use 'length' instead of undefined variable 'len'
// FIXED: correct variable name: Integer.parseInt(partStr) instead of Integer.parseInt(parStr)
// FIXED: sum += num; instead of sum = num;
// FIXED: removed unused variables 'start'
// FIXED: declare 'num' inside blocks to avoid confusion