// This class uses a DebugTrip class
// to instantiate three Trip objects
// Each uses a different version of the constructor
import java.util.Scanner;
public class DebugFour4
{
    public static void main(String args[])
    {
        // Bug 1: Capitalize Scanner in the variable declaration for consistency, though not strictly required.
        // It was: Scanner input = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        
        String destinationCity;
        String departureCity;
        String mode;
        // Big 2: The class for the objects is DebugTrip, not DebugTrip1, DebugTrip2, etc.
        DebugTrip trip1;
        DebugTrip trip2;
        DebugTrip trip3;
        
        System.out.print("Enter destination city >> ");
        // Bug 3: 'nextLine()' should be used to read a full string of input for a city name.
        destinationCity = input.nextLine();
        
        System.out.print("Enter departure city >> ");
        // Bug 4: 'nextLine()' should be used to read a full string of input for a city name.
        departureCity = input.nextLine();
        
        System.out.print("Enter mode of transportation >> ");
        // Bug 5: 'nextLine()' should be used to read a full string of input for the mode.
        mode = input.nextLine();
        
        // Bug 6: Constructor names must match the class name, 'DebugTrip'.
        trip1 = new DebugTrip(destinationCity);
        // Bug 7: Constructor names must match the class name, 'DebugTrip'.
        trip2 = new DebugTrip(destinationCity, departureCity);
        // Bug 8: Constructor names must match the class name, 'DebugTrip'.
        trip3 = new DebugTrip(destinationCity, departureCity, mode);
        
        // Bug 9: The method to display the trip details is named 'display', not 'display'. 
        // Also, the method must be static to be called from the static main method.
        display(trip1);
        display(trip2);
        display(trip3);
        
    } // End of main method
    
    // Bug 10: The method 'display' must be declared as 'static' to be called from the static 'main' method.
    public static void display(DebugTrip trip)
    {
        // Bug 11: The methods to get the data are likely 'getDestination()', 'getDepartureCity()', and 'getMode()' 
        // with parentheses, but the original code had them correct.
        System.out.println("Going to " + trip.getDestination());
        System.out.println("     Leaving from " + trip.getDepartureCity());
        System.out.println("     Going by " + trip.getMode());
    } 
} 
