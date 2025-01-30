package InlamningsuppgiftMorse;

import java.util.Scanner;

public class MorseCodeMain {

    public static void main(String[] args) {

        MorseCodeLogic logic = new MorseCodeLogic();

        // Skapar en scanner för användarens input
        Scanner scanner = new Scanner(System.in);

        // Testa koden
        try {
            System.out.println("Tryck 1 för att översätta text från engelska till morsekod.");
            System.out.println("Tryck 2 för att översätta morsekod till engelska bokstäver.");
            int choice = scanner.nextInt(); // Läs in användarens val av 1 eller 2
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Skriv in en text på engelska: ");
                String englishText = scanner.nextLine();
                // Översätt från engelska till morsekod
                String morseCode = logic.englishToMorse(englishText);
                System.out.println("Morse koden för denna text blir: " + morseCode);
            } else if (choice == 2) {
                System.out.print("Skriv in morsekod: ");
                String morseText = scanner.nextLine();
                // Översätt från morsekod till engelska
                String englishText = logic.morseToEnglish(morseText);
                System.out.println("På engelska blir det: " + englishText);
            } else {
                System.out.println("Hoppsan, nu blev det lite fel! Vänligen ange 1 eller 2.");
            }
        } catch (Exception e) {
            System.out.println("Ogiltig inmatning!");
        }
    }
}
