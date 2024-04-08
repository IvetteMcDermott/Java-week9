
import javax.swing.JOptionPane;

public class StringInputs {

    public static int Menu() {
        int selection = 0;

        // input menu selection
        selection = Integer.parseInt(
                JOptionPane.showInputDialog(null, "1. Counts the letters.\r\n" +
                        "2. Counts vowels.\r\n" +
                        "3. Generates a string with every second letter.\r\n" +
                        "4. generate a string with the positions of each space.\r\n" +
                        "5. Generates a string with all vowels are replaced with an exclamation\r\n" +
                        "\nWhat do you want to do with your string?", "Menu",
                        JOptionPane.PLAIN_MESSAGE));

        while (selection < 1 || selection > 5) {

            // input menu selection
            selection = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "1. Counts the letters.\r\n" +
                            "2. Counts vowels.\r\n" +
                            "3. Generates a string with every second letter.\r\n" +
                            "4. generate a string with the positions of each space.\r\n" +
                            "5. Generates a string with all vowels are replaced with an exclamation\r\n" +
                            "\nWhat do you want to do with your string?", "Menu",
                            JOptionPane.PLAIN_MESSAGE));
        }

        return selection;
    }

}
