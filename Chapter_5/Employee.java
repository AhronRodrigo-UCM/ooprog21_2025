public class Employee {
    private int employeeNumber;
    private double payRate;
    public final static int MAX_EMPLOYEE_NUMBER = 999;
    public static final double MAX_RATE = 60.0;
    public static final double OVER_TIME_RATE = 1.5;

    public Employee(int employeeNumber, double payRate) {
        setEmployeeNumber(employeeNumber);
        setPayRate(payRate);
    }

    public void setEmployeeNumber(int employeeNumber) {
        if(employeeNumber > 0 && employeeNumber <= MAX_EMPLOYEE_NUMBER) {
            this.employeeNumber = employeeNumber;
        }
        else {
            throw new IllegalArgumentException("Invalid employee number");
        }
    }

    public void setPayRate(double payRate) {
        if(payRate > 0 && payRate <= MAX_RATE) {
            this.payRate = payRate;
        }
        else {
            throw new IllegalArgumentException("Invalid pay rate");
        }
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double calculateRegularPay(double hoursWorked) {
        if(hoursWorked <= 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;
        }
    }

    public double calculateOvertimePay(double hoursWorked) {
        if(hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVER_TIME_RATE;
        } else {
            return 0;
        }
    }
}