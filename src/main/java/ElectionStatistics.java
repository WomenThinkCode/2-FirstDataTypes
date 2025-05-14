
import javax.swing.JOptionPane;


public class ElectionStatistics {
    public static void main(String[] args) {
        String politician1 = JOptionPane.showInputDialog("Enter the first politician's name: ");
    int vote1 = Integer.parseInt(JOptionPane.showInputDialog("Enter number of votes: " + politician1));

        String politian2 = JOptionPane.showInputDialog("Enter the second politician's name: ");
        int vote2 = Integer.parseInt(JOptionPane.showInputDialog("Enter number of votes: " + politian2));

        String politician3 = JOptionPane.showInputDialog("Enter the third politician's name: ");
        int vote3 = Integer.parseInt(JOptionPane.showInputDialog("Enter number of votes: " + politician3));

        int totalVotes = vote1 + vote2 + vote3;
        double percent1 = (vote1 * 100.0) / totalVotes;
        double percent2 = (vote2 * 100.0) / totalVotes;
        double percent3 = (vote3 * 100.0) / totalVotes;

        String winner;
        if (vote1 > vote2 && vote1 > vote3) {
            winner = politician1;
        } else if (vote2 > vote1 && vote2 > vote3) {
            winner = politian2;
        } else if (vote3 > vote1 && vote3 > vote2 ) {
            winner = politician3;
        } else {
            winner = "It's a tie";
        }
        
        String result = 
        politician1 + ": " + vote1 + " votes (" + String.format("%.2f", percent1) + "%)\n" +
        politian2 + ": " + vote2 + " votes (" + String.format("%.2f", percent2) + "%)\n" +
        politician3 + ": " + vote3 + " votes (" + String.format("%.2f", percent3) + "%)\n\n" +
        "Winner: " + winner;

        JOptionPane.showMessageDialog(null,result);
    }
}
