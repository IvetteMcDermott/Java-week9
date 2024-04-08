
import javax.swing.JOptionPane;

public class StringLabApp {
    // global variable
    public static String userInput = "";

    // created to call the application in restart
    public static void main(String[] args) {
        application();
    }

    public static String getStringInp() {
        // this will allow to get the string from the user independently, return the
        // jpane prefill with the global variable to that same one can be reused or
        // modified in base to if want/need
        return JOptionPane.showInputDialog(null, "Enter your string:", "String Manipulation",
                JOptionPane.PLAIN_MESSAGE, null, null, userInput).toString();
    }

    public static void application() {

        // variables
        int counter = 0;
        int selection = 0;
        String jump2String = "";
        String vowelsReplaced = "";
        String sPositions = "";
        String restart = "";

        // object
        StringLab SL = new StringLab();
        // StringLab SL = new StringLab();

        // sets
        SL.setUserInput(userInput);
        SL.setCounter(counter);
        SL.setJump2String(jump2String);
        SL.setSPositions(sPositions);
        SL.setVowelsReplaced(vowelsReplaced);

        // inputs
        userInput = getStringInp();

        selection = StringInputs.Menu();

        // compute, call it according to the selection in the menu
        if (selection == 1) {
            SL.computeCountLetters(userInput);
        } else if (selection == 2) {
            SL.computeCountVowels(userInput);
        } else if (selection == 3) {
            SL.computeJump2(userInput);
        } else if (selection == 4) {
            SL.computeSPosition(userInput);
        } else if (selection == 5) {
            SL.computeVowelsReplaced(userInput);
        }

        // get
        counter = SL.getCounter();
        jump2String = SL.getJump2();
        sPositions = SL.getSPositions();
        vowelsReplaced = SL.getVowelsReplaced();

        // output according to the selection in the menu
        if (selection == 1) {
            JOptionPane.showMessageDialog(null, "Your string contains " + counter + " letters.", "Result",
                    JOptionPane.INFORMATION_MESSAGE, null);
        } else if (selection == 2) {
            JOptionPane.showMessageDialog(null, "Your string contains " + counter + " vowel(s).", "Result",
                    JOptionPane.INFORMATION_MESSAGE, null);
        } else if (selection == 3) {
            JOptionPane.showMessageDialog(null,
                    "Your string's substring for every second position is \n\n" + jump2String,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE, null);
        } else if (selection == 4) {
            JOptionPane.showMessageDialog(null, "Your string has spaces in the positions \n" + sPositions, "Result",
                    JOptionPane.INFORMATION_MESSAGE, null);
        } else if (selection == 5) {
            JOptionPane.showMessageDialog(null, "Your string with the vowels replaced by ! is \n\n" + vowelsReplaced,
                    "Result",
                    JOptionPane.INFORMATION_MESSAGE, null);
        }

        // restart option and conditional to restart or leave
        restart = JOptionPane.showInputDialog(null, "Want to try another option?: (yes/no)", "String Manipulation",
                JOptionPane.PLAIN_MESSAGE);

        if (restart.equalsIgnoreCase("yes")) {
            application();
        } else {
            JOptionPane.showMessageDialog(null, "Invalid Option. You will exit now",
                    "Exit",
                    JOptionPane.WARNING_MESSAGE, null);
            System.exit(0);
        }

    }

}
