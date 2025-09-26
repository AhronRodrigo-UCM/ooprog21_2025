public class DebugPen
{
    private String color;
    private String point;
    
    public DebugPen()
    {
        color = "black";
        point = "fine";
    }
    
    
   
    public DebugPen(String color, String point)
    {
        color = color;  
        point = point;  
    }
    
    public String getColor()
    {
        return color;
    }
    
    public String getPoint()
    {
        return point;
    }
}

//  In the parameterized constructor, the assignments 'color = color;' and 'point = point;' 
//        are assigning the local parameter values to themselves, not to the instance variables.


// line 14:  Use 'this.color = color;' and 'this.point = point;' to assign to the instance fields

//  Should be this.color = color; (shadowing issue)
//  Should be this.point = point; (shadowing issue)
