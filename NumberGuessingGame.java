//Ali Issa
// June 22, 2023
import javax.swing.JOptionPane;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int targetNumber = (int) (Math.random() * 100 + 1);
        int userGuess = 0;
        System.out.println("The correct guess would be " + targetNumber);
        int attempts = 1;

        while (userGuess != targetNumber) {
            String response = JOptionPane.showInputDialog(null,
                    "Enter a guess between 1 and 100", "Number Guessing Game", 3);
            userGuess = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, "" + evaluateGuess(userGuess, targetNumber, attempts));
            attempts++;
        }
    }

    public static String evaluateGuess(int userGuess, int targetNumber, int attempts) {
        if (userGuess <= 0 || userGuess > 100) {
            return "Your guess is invalid";
        } else if (userGuess == targetNumber) {
            return "Correct!\nTotal Attempts: " + attempts;
        } else if (userGuess > targetNumber) {
            return "Your guess is too high, try again.\nAttempt Number: " + attempts;
        } else {
            return "Your guess is too low, try again.\nAttempt Number: " + attempts;
        }
    }
}
