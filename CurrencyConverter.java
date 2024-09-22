import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Hardcoded exchange rates for simplicity (you can update these values)
        double inrToUsd = 0.012;  // 1 INR = 0.012 USD
        double usdToInr = 83.0;   // 1 USD = 83 INR
        double inrToEur = 0.011;  // 1 INR = 0.011 EUR
        double eurToInr = 91.0;   // 1 EUR = 91 INR
        double usdToEur = 0.93;   // 1 USD = 0.93 EUR
        double eurToUsd = 1.07;   // 1 EUR = 1.07 USD

        // Display the options to the user
        System.out.println("Welcome to Simple Currency Converter!");
        System.out.println("Available currency conversions:");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");
        System.out.println("5. USD to EUR");
        System.out.println("6. EUR to USD");

        // Ask the user to choose the conversion option
        System.out.print("Choose a conversion option (1-6): ");
        int choice = scanner.nextInt();

        // Ask the user for the amount to convert
        System.out.print("Enter the amount you want to convert: ");
        double amount = scanner.nextDouble();

        // Perform the conversion based on the user's choice
        double convertedAmount = 0;
        switch (choice) {
            case 1:
                convertedAmount = amount * inrToUsd;
                System.out.printf("%.2f INR is equal to %.2f USD\n", amount, convertedAmount);
                break;
            case 2:
                convertedAmount = amount * usdToInr;
                System.out.printf("%.2f USD is equal to %.2f INR\n", amount, convertedAmount);
                break;
            case 3:
                convertedAmount = amount * inrToEur;
                System.out.printf("%.2f INR is equal to %.2f EUR\n", amount, convertedAmount);
                break;
            case 4:
                convertedAmount = amount * eurToInr;
                System.out.printf("%.2f EUR is equal to %.2f INR\n", amount, convertedAmount);
                break;
            case 5:
                convertedAmount = amount * usdToEur;
                System.out.printf("%.2f USD is equal to %.2f EUR\n", amount, convertedAmount);
                break;
            case 6:
                convertedAmount = amount * eurToUsd;
                System.out.printf("%.2f EUR is equal to %.2f USD\n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid choice. Please run the program again and choose a valid option.");
        }

        scanner.close();
    }
}
