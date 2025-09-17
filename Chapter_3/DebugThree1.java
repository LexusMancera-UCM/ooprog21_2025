import java.util.Scanner;

public class DebugThree1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Your check amount: ");
        double check1 = input.nextDouble();

        System.out.print("Friend's check amount: ");
        double check2 = input.nextDouble();

        showTip(check1);
        showTip(check2);
    }

    public static void showTip(double bill) {
        double rate = 0.15;
        double tip = bill * rate;
        System.out.println("Minimum tip: $" + tip);
    }
}
