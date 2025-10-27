import java.util.Scanner;

public class BankBalanceNested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        double[] rates = {0.02, 0.03, 0.04, 0.05};

        for (int i = 0; i < rates.length; i++) {
            double rate = rates[i];
            double newBalance = balance;

            System.out.println("\nWith an initial balance of $" + balance + 
                               " at an interest rate of " + rate);

            for (int year = 1; year <= 4; year++) {
                newBalance = newBalance + (newBalance * rate);
                System.out.println("After year " + year + " balance is " + newBalance);
            }
        }

        input.close();
    }
}
