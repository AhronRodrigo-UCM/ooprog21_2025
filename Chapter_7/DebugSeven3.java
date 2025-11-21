// Program accepts a String and displays some facts
import java.util.*;
public class DebugSeven3
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String quote, charString;
        char searchChar;

        System.out.print("Enter a famous quote >> ");

        quote = kb.nextLine();

        System.out.print("Enter a character to search for >> ");

        charString = kb.nextLine();

        searchChar = charString.charAt(0);

        System.out.println("indexOf('" + searchChar + "') is: " +
            quote.indexOf(searchChar));

        System.out.println("indexOf('a') is: " + quote.indexOf('a'));

        System.out.println("indexOf('x') is: " + quote.indexOf('x'));

        System.out.println("charAt(5) is: " + quote.charAt(5));

        System.out.println("replace('e', '*') is: " +
            quote.replace('e', '*'));
    }
}

// FIXED: quote = kb.nextLine(); instead of quote = nextLine();
// FIXED: charString = kb.nextLine(); instead of kb.nextInt()
// FIXED: Correct missing parenthesis in indexOf() print
// FIXEd: quote.indexOf('a') instead of quote.indexOf'a'
// FIXED: corrected spelling: replace() instead of repplace()
// FIXED: ensure searchChar = charString.charAt(0)