// This class uses a DebugPen class
// to instantiate two Pen objects
// One with default values
// and the other with user-supplied values
import java.util.Scanner;
public class DebugFour2
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        String color;
        String point;
        DebugPen pen1;
        DebugPen pen2;
        System.out.print("Enter a color ink for the pen >> ");
        color = input.nextLine();
        System.out.print("Enter a point size - fine, medium, or thick >> ");
        point = input.nextLine();
        pen1 = new DebugPen();
        
       
        pen2 = new DebugPen(point, color);
        
        System.out.println("Default value pen:");
        display(pen1);
        System.out.println("User  value pen:");
        
     
        display(pen22);
    }
    
   
    public static void display(FixDebugPen p)
    {
        System.out.println(" The pen has ink color " + p.getColor());
        
     
        System.out.println(" and a " + p1.getPoint() + " point.");
    }
}


// DEBUGSSSS


// BUG 1: line 22 - Constructor args are swapped.
//        From DebugPen class, constructor is DebugPen(String color, String point).
//        Should be: new DebugPen(color, point); not new DebugPen(point, color).
//        This will set color to point value and point to color value (wrong).
// BUG 2: Line - 29 - Typo in variable name.
//        'pen22' does not exist; should be 'pen2'.
//        This causes compilation error: cannot find symbol 'pen22'.
// BUG 3: Line 33 - Wrong parameter type.
//        'FixDebugPen' is not a class; should be 'DebugPen'.
//        Causes compilation error: cannot find symbol 'FixDebugPen'.
// BUG 4: - Typo in variable name.
//        'p1' does not exist; should be 'p' (the parameter).
//        Causes compilation error: cannot find symbol 'p1'.
//        Also, minor: Add space after "a" in print for better output.
// BUG 5: No closing of Scanner (line ~13).
//        Add input.close(); at end of main to free resources.
//        Not a compilation error, but good practice.
// BUG 6: Missing import for DebugPen (if not in same package).
//        Add: import DebugPen; at top.
//        Causes compilation error if DebugPen is in another package.