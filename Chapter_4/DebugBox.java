public class DebugBox
{
    private int width;
    private int length;
    private int height;
    
    public DebugBox()
    {
        length = 1;
        width = 1;
        height = 1;
    }
    
    
    public DebugBox(int width, int length, int height)
    {
        this.width = width;
        this.length = length;  
        this.height = height;  
    }
    
    public void showData()
    {
        System.out.println("Width: " + width + " Length: " +
                           length + " Height: " + height);
    }
    
    public double getVolume()
    {
        double vol = length * width * height;
        return vol;
    }
    
    public static void main(String[] args)
    {
        
        DebugBox defaultBox = new DebugBox();
        System.out.println("Default Box:");
        defaultBox.showData();
        System.out.println("Volume: " + defaultBox.getVolume());
        System.out.println();
        
        DebugBox customBox = new DebugBox(5, 10, 3);
        System.out.println("Custom Box:");
        customBox.showData();
        System.out.println("Volume: " + customBox.getVolume());
    }
}

// no "class" in public
// Fixed constructor: Now correctly assigns parameters to the respective fields
// Fixed: Was incorrectly set to 'width'
// Added main method to make the class runnable and demonstrate functionalit 
// Test default constructor
