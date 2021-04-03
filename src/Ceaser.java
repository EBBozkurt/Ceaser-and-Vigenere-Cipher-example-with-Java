/**
 * Ceaser Class.
 *
 * @author EBBozkurt
 * 
 */

public class Ceaser extends Cipher {

    // We need to complete alphabets for Caesar encrypt and decrypt so let's define
    // our alphabet.

    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    @Override
    String encrypt(String text, String key) {

        int length = text.length();
        String encryptText = "";

        // We do our encrypt process with our nested loops.
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 26; j++) {
                if (text.charAt(i) == alphabet.charAt(j)) {
                    // In this section, with the charAt function in the alphabet, the value in the
                    // index at that moment is replaced by the value we encrypt. In this section, we
                    // will do the work we did by collecting it by subtracting it in Decrypt.
                    encryptText += alphabet.charAt((j + key.length()) % 26);
                }
            }
        }
        return encryptText;
    }

    // I'm not writing the decrypt extra comment line, which is almost the same as
    // the encrypt operation.
    @Override
    String decrypt(String encryptText, String key) {

        int length = encryptText.length();
        String decryptText = "";
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < 26; j++) {
                if (encryptText.charAt(i) == alphabet.charAt(j)) {
                    decryptText += alphabet.charAt((j - key.length()) % 26);
                }
            }
        }

        return decryptText;
    }

}
