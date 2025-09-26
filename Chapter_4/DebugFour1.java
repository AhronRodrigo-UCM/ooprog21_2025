// This class uses a DebugCircle class
// to instantiate a Circle object
import java.util.Scanner;


public class DebugFour1
{
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        int radius;
        
    
        Circle c = new Circle();
        
        System.out.print("Enter a radius for a circle >> ");
        radius = input.nextInt();
        
      
        c = new DebugCircle(c);  
        
        System.out.println("The radius is " + c.getRad());
        System.out.println("The diameter is " + c.getDiam());
        System.out.println("The area is " + c.getArea());
        
       
    }
}
// DEBUGSSSS

  // BUG 1: No import for Circle and DebugCircle.
  //        Add: import Circle; import DebugCircle;
  //        Else, code won't compile - can't find classes.
  // BUG 2 line 1: This line makes a Circle but it's not used.
  //        Remove it - next line overwrites 'c'.
  // BUG 3: Wrong way to make DebugCircle.
  //        Passing old 'c' (default circle) is bad.
  //        Use radius from user: new DebugCircle(radius).
  // DEBUG: Change to c = new DebugCircle(radius);
  // BUG 4: Close Scanner to free resources.
  //        Add: input.close(); at end.
