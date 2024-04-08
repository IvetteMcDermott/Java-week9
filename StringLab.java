
public class StringLab {

    // variables

    private String userInput;
    private StringBuffer BufferInput;
    private int counter;
    private String jump2String;
    private String vowelsReplaced;
    private String sPositions;

    // constructors

    // set
    public void setUserInput(String userInput) {
        this.userInput = userInput;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void setJump2String(String jump2String) {
        this.jump2String = jump2String;
    }

    public void setVowelsReplaced(String vowelsReplace) {
        this.vowelsReplaced = vowelsReplaced;
    }

    public void setSPositions(String sPositions) {
        this.sPositions = sPositions;
    }

    // compute

    public void computeCountLetters(String userInput) {
        counter = 0;
        // BufferString
        StringBuffer BufferInput = new StringBuffer(userInput);
        // loop in it
        for (int i = 0; i < BufferInput.length(); i++) {
            // check if the char [i] is empty or dot dont count it
            if (BufferInput.charAt(i) == ' ' || BufferInput.charAt(i) == '.') {
            } else {
                // if different(letter) count it
                counter++;
            }

            // DIFFERENT WAY TO GET IT DONE
            // Convert the string to an array of chars
            // for (char i : userInput.toCharArray()) {
            // if (Character.isLetter(i)) {
            // counter++;
            // }
        }
    }

    public void computeCountVowels(String userInput) {
        counter = 0;
        // bufferString to manipulate
        StringBuffer BufferInput = new StringBuffer(userInput);
        // loop in it
        for (int i = 0; i < BufferInput.length(); i++) {
            // turning the char into string to use methods

            String temp = Character.toString(BufferInput.charAt(i));
            // String method to compare if space and evaluate

            if (temp.equalsIgnoreCase("a") || temp.equalsIgnoreCase("e") || temp.equalsIgnoreCase("i")
                    || temp.equalsIgnoreCase("o") || temp.equalsIgnoreCase("u")) {
                counter++;
            } else {
                // do nothing
            }
        }
    }

    public void computeJump2(String userInput) {
        // bufferString to manipulate
        StringBuffer BufferInput = new StringBuffer(userInput);
        // new bufferString to append the chars
        StringBuffer temp = new StringBuffer(jump2String);
        // loop in it
        for (int i = 0; i < BufferInput.length(); i += 2) {
            // append
            temp.append(BufferInput.charAt(i));
            // return it to string
            jump2String = temp.toString();
        }

        if (jump2String.isEmpty()) {
            jump2String = "-";
        }
    }

    public void computeSPosition(String userInput) {
        // bufferString to manipulate
        StringBuffer BufferInput = new StringBuffer(userInput);
        // new bufferString to append the positions
        StringBuffer tempS = new StringBuffer();
        // loop in it
        for (int i = 0; i < BufferInput.length(); i++) {
            // turning the char into string to use methods
            String temp = Character.toString(BufferInput.charAt(i));
            // String method to compare if space and evaluate
            if (!temp.equals(" ")) {
                // no space, do nothing
            } else {
                // space append it plus a space for better visual
                tempS.append(i + " ");
                sPositions = tempS.toString();
            }
        }

        if (sPositions.isEmpty()) {
            sPositions = "\n-\n\nThere was no spaces in your string.";
        }
    }

    public void computeVowelsReplaced(String userInput) {
        // bufferString to manipulate
        StringBuffer BufferInput = new StringBuffer(userInput);
        // loop in it
        for (int i = 0; i < BufferInput.length(); i++) {
            // turning the char into string to use methods
            String temp = Character.toString(BufferInput.charAt(i));
            // conditional with string methods
            if (temp.equalsIgnoreCase("a") || temp.equalsIgnoreCase("e") || temp.equalsIgnoreCase("i")
                    || temp.equalsIgnoreCase("o") || temp.equalsIgnoreCase("u")) {
                // replace method
                BufferInput.replace(i, i + 1, "!");
                // return to string
                vowelsReplaced = BufferInput.toString();
            } else {
                // do nothing
                if (vowelsReplaced == null) {
                    vowelsReplaced = BufferInput.toString();

                    vowelsReplaced = vowelsReplaced + "\n\nThere was no vowel to replace.";
                }
            }
        }
    }

    // gets

    public int getCounter() {
        return counter;
    }

    public String getJump2() {
        return jump2String;
    }

    public String getVowelsReplaced() {
        return vowelsReplaced;
    }

    public String getSPositions() {
        return sPositions;
    }

}
