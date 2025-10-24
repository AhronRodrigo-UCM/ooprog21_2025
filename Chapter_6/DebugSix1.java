import java.util.Scanner;

public class DebugSix1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int days;
        double money = 0.01;
        int day = 1;

        // FIX 1: Added missing semicolon at the end of this line
        System.out.print("Enter number of days >> ");
        days = keyboard.nextInt();

        // FIX 2: Changed loop condition from (days < day) to (day <= days)
        // so the loop runs correctly for the number of days entered
        while (day <= days) {

            // FIX 3: Corrected print statement to use current 'day' variable
            System.out.println("After day " + day + " you have " + money);

            // FIX 4: Doubling logic kept the same but placed after the print
            // so day 1 shows 0.01 before doubling
            money = money * 2;
            ++day;

            // FIX 5: Added proper indentation and formatting for readability
        }
    }
}

