import javax.swing.JOptionPane;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        while (true) {
            String name = JOptionPane.showInputDialog(null, "What is your name?", "Input", JOptionPane.QUESTION_MESSAGE);

            if (name == null) {
                break;
            }

            int response = JOptionPane.showConfirmDialog(
                null,
                "Do you want your name to be shown?",
                "Confirmation",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
            );

            if (response == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "Hello, " + name, "Message", JOptionPane.INFORMATION_MESSAGE);
                break;
            }
        }
    }
}

