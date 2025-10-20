import javax.swing.JOptionPane;

public class BankBalance {
    public static void main(String[] args) {
        double balance = Double.parseDouble(JOptionPane.showInputDialog("Enter initial bank balance:"));
        double rate = 0.03;
        int year = 1;
        int choice = 1;

        while (choice == 1) {
            balance += balance * rate;
            JOptionPane.showMessageDialog(null, 
                "After year " + year + " at 0.03 interest rate, balance is $" + balance);
            choice = Integer.parseInt(JOptionPane.showInputDialog(
                "Do you want to see the balance at the end of another year?\nEnter 1 for yes or any other number for no:"));
            year++;
        }

        JOptionPane.showMessageDialog(null, "Operation complete.");
    }
}
