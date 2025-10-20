import java.util.Scanner;

public class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        final double INTEREST_RATE = 0.03; // 3% interest
        double balance;
        int year = 1;
        int choice;
        
        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();
        
        do {
            System.out.print("Do you want to see next year's balance?\n");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            
            if (choice == 1) {
                balance = balance + (balance * INTEREST_RATE);
                System.out.printf("After year %d at %.2f interest rate, balance is $%.2f%n",
                                  year, INTEREST_RATE, balance);
                year++;
            }
            
        } while (choice == 1);
        
        System.out.println("Program terminated.");
        input.close();
    }
}
