package InlamningsuppgiftMorse;

import java.util.HashMap;

public class MorseCodeLogic {

    // HashMap för morsekod till engelska
    private static HashMap<String, String> morseToEnglish = new HashMap<>();
    // HashMap för engelska till morsekod
    private static HashMap<String, String> englishToMorse = new HashMap<>();

    static {
        // Från morsekod till engelska
        morseToEnglish.put(".-", "A");
        morseToEnglish.put("-...", "B");
        morseToEnglish.put("-.-.", "C");
        morseToEnglish.put("-..", "D");
        morseToEnglish.put(".", "E");
        morseToEnglish.put("..-.", "F");
        morseToEnglish.put("--.", "G");
        morseToEnglish.put("....", "H");
        morseToEnglish.put("..", "I");
        morseToEnglish.put(".---", "J");
        morseToEnglish.put("-.-", "K");
        morseToEnglish.put(".-..", "L");
        morseToEnglish.put("--", "M");
        morseToEnglish.put("-.", "N");
        morseToEnglish.put("---", "O");
        morseToEnglish.put(".--.", "P");
        morseToEnglish.put("--.-", "Q");
        morseToEnglish.put(".-.", "R");
        morseToEnglish.put("...", "S");
        morseToEnglish.put("-", "T");
        morseToEnglish.put("..-", "U");
        morseToEnglish.put("...-", "V");
        morseToEnglish.put(".--", "W");
        morseToEnglish.put("-..-", "X");
        morseToEnglish.put("-.--", "Y");
        morseToEnglish.put("--..", "Z");

        // Från engelska till morsekod
        englishToMorse.put("A", ".-");
        englishToMorse.put("B", "-...");
        englishToMorse.put("C", "-.-.");
        englishToMorse.put("D", "-..");
        englishToMorse.put("E", ".");
        englishToMorse.put("F", "..-.");
        englishToMorse.put("G", "--.");
        englishToMorse.put("H", "....");
        englishToMorse.put("I", "..");
        englishToMorse.put("J", ".---");
        englishToMorse.put("K", "-.-");
        englishToMorse.put("L", ".-..");
        englishToMorse.put("M", "--");
        englishToMorse.put("N", "-.");
        englishToMorse.put("O", "---");
        englishToMorse.put("P", ".--.");
        englishToMorse.put("Q", "--.-");
        englishToMorse.put("R", ".-.");
        englishToMorse.put("S", "...");
        englishToMorse.put("T", "-");
        englishToMorse.put("U", "..-");
        englishToMorse.put("V", "...-");
        englishToMorse.put("W", ".--");
        englishToMorse.put("X", "-..-");
        englishToMorse.put("Y", "-.--");
        englishToMorse.put("Z", "--..");
    }

    // översätt engelska till morsekod
    public String englishToMorse(String englishText) {
        String morseText = "";
        for (int i = 0; i < englishText.length(); i++) {
            char character = englishText.charAt(i);
            String characterStr = Character.toString(character).toUpperCase();  // Gör om till stor bokstav

            // Kontrollera om det finns en motsvarande morsekod
            String morseCode = englishToMorse.get(characterStr);

            // Om det hittas någon motsvarande morsekod, lägg till den i resultatet
            if (morseCode != null) {
                morseText += morseCode;  // Lägg till morsekod
            }
        }
        return morseText;  // Returnera morsekoden
    }

    // översätt morsekod till engelska
    public String morseToEnglish(String morseText) {
        String englishText = "";
        String[] morseWords = morseText.split(" ");  // Dela upp morsekoden med mellanslag

        // För varje morsekod, översätt till en bokstav
        for (String morse : morseWords) {
            String letter = morseToEnglish.get(morse);  // Lägg till motsvarande bokstav
            if (letter != null) {
                englishText += letter;  // Lägg till bokstaven i resultatet
            }
        }
        return englishText; // returnera engelsk text
    }
}
