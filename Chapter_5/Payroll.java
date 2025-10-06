import java.util.Scanner;

class Employee {
    private int employeeNumber;
    private double payRate;

    public Employee(int empNum, double rate) {
        this.employeeNumber = empNum;
        this.payRate = rate;
    }

    public double calculateRegularPay(double hours) {
        if (hours <= 40) {
            return hours * payRate;
        } else {
            return 40 * payRate;
        }
    }

    public double calculateOvertimePay(double hours) {
        if (hours <= 40) {
            return 0.0;
        } else {
            double overtimeHours = hours - 40;
            return overtimeHours * payRate * 1.5;
        }
    }
}

public class Payroll {  // Made public for best practices
    public static void main(String[] a) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number: ");
        int empNum = input.nextInt();
        System.out.print("How many hours did you work this week? ");
        double hrsWorked = input.nextDouble();
        System.out.print("What is your regular pay rate? ");
        double pRate = input.nextDouble();

        Employee emp1 = new Employee(empNum, pRate);

        double regPay = emp1.calculateRegularPay(hrsWorked);
        double overPay = emp1.calculateOvertimePay(hrsWorked);

        System.out.println("Regular Pay is " + regPay +
                           "\nOvertime Pay is " + overPay);
        
        input.close();  // Good practice
    }
}
