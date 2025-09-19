public class DemoGrossPay {


    public static void main(String[] args) 
    {
        
        double HOURLY_RATE = 22.75;
        
        calculateGross(10.0, HOURLY_RATE);
        calculateGross(25.0, HOURLY_RATE);
        calculateGross(37.5, HOURLY_RATE);
    }
    
    public static void calculateGross(double hoursWorked, double rate) 
    {
        double grossPay = hoursWorked * rate;
        System.out.println(hoursWorked + " hours at $" + rate + " per hour is $" + grossPay);
    }
}