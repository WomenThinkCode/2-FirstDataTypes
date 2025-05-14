
import javax.swing.JOptionPane;


public class MinutesConversion {
    public static void main(String[] args) {
        String input =  JOptionPane.showInputDialog("Enter minutes:");
        try {
            int minutes = Integer.parseInt(input);
            int days = minutes / 1440;
            int remainingDays = minutes % 1440;
            int hours = remainingDays / 60;
            int finalMinutes = remainingDays % 60;
            String message = minutes + " minutes = " + days + " day(s), " 
                           + hours + " hour(s), and " + finalMinutes + " minute(s)";
            JOptionPane.showMessageDialog(null, message);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid input. Please enter a valid number");
        }

    }
}
