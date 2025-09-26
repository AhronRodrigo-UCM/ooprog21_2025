// A Trip has three constructors
// When one argument is passed,
// it is the trip destination
// When two arguments are passed,
// they are the destination and departure cities
// When three arguments are passed,
// the last one is the mode of transportation for the trip
public class DebugTrip
{
    private String destination;
    private String departure;
    private String mode;
    private static final String DEFAULT_CITY = "Atlanta";
    private static final String DEFAULT_MODE = "car";
    
    public DebugTrip(String destination)
    {
        this(destination, DEFAULT_CITY, DEFAULT_MODE);
    }
    
    
    public DebugTrip(String destination, String departure)
    {
        this(destination);  // DEBUG: This sets fields partially but leads to invalid chaining
        this(departure);    // DEBUG: Invalid second 'this()' call; causes compilation error and logical overwrite
    }
    
    public DebugTrip(String destination, String departure, String mode)
    {
        this.destination = destination;
        this.departure = departure;
        this.mode = mode;
    }
    
    public String getDestination()
    {
        return destination;
    }
    
    public String getDepartureCity()
    {
        return departure;
    }
    
    public String getMode()
    {
        return mode;
    }
}
// DEBUGSSSS

    // BUG 1: Multiple 'this()' calls in a single constructor are not allowed in Java.
    //        Constructor chaining with 'this()' must be the very first statement in the constructor body,
    //        and only one such call is permitted per constructor.
    // BUG 2: The first 'this(destination)' delegates to the one-arg constructor, which sets 'destination' correctly
    //        but also sets 'departure' to DEFAULT_CITY and 'mode' to DEFAULT_MODE.
    // BUG 3: The second 'this(departure)' is invalid: It attempts to chain to the one-arg constructor again,
    //        passing 'departure' as the 'destination' parameter, which would incorrectly overwrite fields
    //        and cause a compilation error due to multiple 'this()' calls.
    //        Semantically, for a two-arg constructor (destination and departure), it should set 'mode' to DEFAULT_MODE
    //        without overriding the destination.
    // FIX: Remove the first 'this(destination);' and replace the entire body with a single delegation:
    //      this(destination, departure, DEFAULT_MODE);
