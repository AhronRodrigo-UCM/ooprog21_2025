// This class uses a DebugBox class
// to instantiate two Box objects
import java.util.Scanner;
public class DebugFour3
{
    public static void main(String args[])
    {
        // I organize the Debugs cuz its a hassle to put them in the bottom 
        
        Scanner input = new Scanner(System.in);
        
        // Fix 2: 'l' is often used for 1, it's better to use 'len' or 'length' for clarity, but 'l' is okay.
        // The variables need to be declared as 'int'.
        int w, l, h; 
        
        System.out.print("Enter width of box >> ");
        // Fix 3: 'nextInt()' should be used for integers, not 'nextInteger()'.
        w = input.nextInt(); 
        
        System.out.print("Enter length of box >> ");
        // Fix 4: 'nextInt()' should be used for integers, not 'nextDouble()'.
        l = input.nextInt(); 
        
        System.out.print("Enter height of box >> ");
        // Fix 5: The variable 'h' is an int, so we use 'nextInt()'. The original code used 'nextInt()', so this line is OK.
        h = input.nextInt();
        
        // Fix 6: The Box class is named 'DebugBox', not 'FixDebugBox'.
        DebugBox box1 = new DebugBox();
        // Fix 7: The second object should also be a 'DebugBox' and it should use the constructor with parameters.
        DebugBox box2 = new DebugBox(w, l, h);
        
        System.out.println("The dimensions of the first box are");
        box1.showData();
        
        System.out.print(" The volume of the first box is ");
        // Fix 8: The method to show volume should be 'showVolume(box1)' not 'showVolume(box1)' as it is being passed an object to a static method. The method should also be called with the correct object.
        showVolume(box1);
        
        System.out.println("The dimensions of the second box are");
        box2.showData();
        
        System.out.print(" The volume of the second box is ");
        // Fix 9: The method should be called with 'box2' as the argument.
        showVolume(box2);
    } // End of main method
    
    // Fix 10: The method 'showVolume' must be declared as 'static' to be called from the static 'main' method.
    public static void showVolume(DebugBox aBox)
    {