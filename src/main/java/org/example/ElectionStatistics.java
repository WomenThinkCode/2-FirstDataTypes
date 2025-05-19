package org.example;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class ElectionStatistics {
    public static void main(String[] args) {
        String[] options = {"YES", "NO"};
        String[] presidents = {"Thabo Mbeki", "Jacob Zuma", "Cyril Ramaphosa"};
        int[] scores = new int[presidents.length];

        double winner_score = 0;
        String winner = "";

        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (Math.random() * 100);
        }

        int total = Arrays.stream(scores).sum();
        System.out.println(total);

        for (int i = 0; i < presidents.length; i++) {
            int choice = JOptionPane.showOptionDialog(null, presidents[i], "Election Statistics", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);

            switch (choice) {
                case JOptionPane.YES_OPTION -> scores[i] ++;
                case JOptionPane.NO_OPTION, JOptionPane.CLOSED_OPTION -> {}
            }
        }

        System.out.println(Arrays.toString(scores));

        for (int i = 0; i < scores.length; i++) {
            double perc = ((double) scores[i] / total) * 100;

            if (perc == winner_score) {
                winner = "We have a tie: " + perc + "(from your vote) and " + winner_score+ "(existing election)\n" +
                "Vote again!";
            }
            else if (perc > winner_score) {
                winner_score = perc;
                winner = presidents[i] + " won by " + (int) perc + "% of the votes!";
            }

        }

        JOptionPane.showMessageDialog(null, winner, "Election Statistics Winner", JOptionPane.INFORMATION_MESSAGE);
    }
}
