import java.util.Scanner;

public class BankBalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double balance = 100.00;   // Starting balance
        double rate = 0.03;        // Fixed 3% interest rate
        int year = 1;              // Year counter
        int choice;                // User choice

        System.out.printf("Initial balance: $%.2f\n", balance);

        do {
            // Calculate interest and update balance
            balance = balance + (balance * rate);

            // Display the current year's balance
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f\n",
                    year, rate, balance);

            // Ask the user if they want to continue
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes\n  or any other number for no >> ");
            choice = input.nextInt();

            // Move to next year
            year++;

        } while (choice == 1); // Loop continues if user enters 1

        System.out.println("\n----jGRASP: Operation complete.----");
        input.close();
    }
}
