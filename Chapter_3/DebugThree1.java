import java.util.Scanner;


public class DebugThree1 {
    public static void main(String args[]) {
    
        double check1;
        double check2;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of your check >> ");
        check1 = input.nextDouble();  
        
        System.out.print("Enter the amount of your friend's check >> ");
        check2 = input.nextDouble();  
        
        calcTip(check1);  
        calcTip(check2);  
    }
    public static void calcTip(double bill) {  
    
        final double RATE = 0.15;  
        double tip;
        tip = bill * RATE;  
        System.out.println("The tip should be at least $" + tip);
    }
}

// Changed from nextInt() to nextDouble() to read decimal values
// Fixed typo: changed inputnextInt() to input.nextDouble()
// Added argument to method call
// Added parameter 'bill' to method
// Fixed typo: 'doubel' to 'double'
// Corrected calculation from division to multiplication