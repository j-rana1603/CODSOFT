import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain = true;
        int roundNumber = 1;
        int score = 0;

        while (playAgain) {
            System.out.println("\nRound " + roundNumber);
            Random random = new Random();
            int targetNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attemptsLeft = 10;  // Limit to 10 attempts
            boolean guessedCorrectly = false;

            while (attemptsLeft > 0) {
                System.out.println("\nEnter your guess (1 to 100), Attempts left: " + attemptsLeft + ": ");
                int userGuess = scanner.nextInt();

                if (userGuess < 1 || userGuess > 100) {
                    System.out.println("Please guess a number between 1 and 100.");
                    continue;
                }

                if (userGuess < targetNumber) {
                    System.out.println("Too low!");
                } else if (userGuess > targetNumber) {
                    System.out.println("Too high!");
                } else {
                    System.out.println("Correct! You guessed the number!");
                    score += attemptsLeft; // Increase score by remaining attempts
                    guessedCorrectly = true;
                    break;
                }

                attemptsLeft--;
            }

            if (!guessedCorrectly) {
                System.out.println("\nSorry, you've used all attempts! The correct number was " + targetNumber);
            }

            roundNumber++;
            System.out.println("\nDo you want to play another round? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }

        System.out.println("\nGame Over! Your final score is: " + score);
        scanner.close();
    }
}
