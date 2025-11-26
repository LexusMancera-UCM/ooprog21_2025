import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String predefinedString = "Carmen";
        
        System.out.print("Enter your name > ");
        String userInput = input.nextLine();
        
        if (userInput.equals(predefinedString)) {
            System.out.println(predefinedString + " equals " + userInput);
        } else {
            System.out.println(predefinedString + " does not equal " + userInput);
        }
        
        input.close();
    }
}
