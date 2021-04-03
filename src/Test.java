import java.util.Scanner;

/**
 * Ceaser cipher and Vigenere cipher example with Java.
 *
 * @author EBBozkurt
 * 
 */

public class Test {

        // We create Ceaser Vigenere ve Scanner object below.
        static Ceaser ceaser = new Ceaser();
        static Vigenere vigenere = new Vigenere();
        static Scanner input = new Scanner(System.in);

        public static void main(String[] args) throws Exception {

                System.out.println("Enter Original Text: ");
                String text = input.nextLine();
                System.out.println("Enter Key: ");
                String key = input.nextLine();
                // We take Inputs.
                // Just in case I edit my inputs as upperCase.
                text = text.toUpperCase();
                key = key.toUpperCase();

                // If the text or key entered in this section comes blank, we report it as an
                // error and exit the application.
                if (text == "") {
                        System.out.println("\nOriginal Text has required.\n");
                } else if (key == "") {
                        System.out.println("\nKey has required.\n");
                } else {
                        System.out.println("\nCEASER\n");
                        String encryptedText = ceaser.encrypt(text, key);
                        System.out.println("Original Text " + text + "  key: " + key + "   Encrypted Text: "
                                        + encryptedText + "\n");

                        String decryptedText = ceaser.decrypt(encryptedText, key);
                        System.out.println("Encrypted Text: " + encryptedText + "  key: " + key + "   Original Text "
                                        + decryptedText + "\n");

                        System.out.println("*********************************************************\n");

                        System.out.println("VIGENERE\n");
                        encryptedText = vigenere.encrypt(text, key);
                        System.out.println("Original Text " + text + "  key: " + key + "   Encrypted Text: "
                                        + encryptedText + "\n");
                        decryptedText = vigenere.decrypt(encryptedText, key);
                        System.out.println("Encrypted Text: " + encryptedText + "  key: " + key + "   Original Text "
                                        + decryptedText + "\n");
                }

        }
}
