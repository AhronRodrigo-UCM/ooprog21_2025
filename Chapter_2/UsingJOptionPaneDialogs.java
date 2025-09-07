import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs 

{

    public static void main(String[] args) 

    {

        String nameValue;
         int confirmValue;
 
        do   
        {    
            nameValue = JOptionPane.showInputDialog(null, "What is your name?");
            confirmValue = JOptionPane.showConfirmDialog(null, "Would you like your name to be shown ?");

        } while (confirmValue == 1); 

     
        String outputMessage = "My name is " + nameValue;

        JOptionPane.showMessageDialog(null, outputMessage);
    }
}