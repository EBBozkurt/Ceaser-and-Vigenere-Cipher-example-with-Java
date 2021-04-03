/**
 * Vigenere Class.
 *
 * @author EBBozkurt
 * 
 */

public class Vigenere extends Cipher {

    // We need to define alphabets for Vigenere encrypt and decrypt. This time, I
    // will work with their equivalents in the ASCII table.

    @Override
    String encrypt(String text, String key) {
        String encryptText = "";

        // Let's examine their process, similar to your operation in Caesar.
        for (int i = 0, j = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            // Just in case, we check whether the data is char or not.
            if (Character.isLetter(c)) {
                // And again, just in case we check our upperCase and lowerCase.
                if (Character.isUpperCase(c)) {
                    // In this section, different from what we do in Caesar Encryption, since we use
                    // our ASCII table, we do our direct processing without using anything like
                    // alphabet.charAt (j).
                    encryptText += (char) ((c + key.toUpperCase().charAt(j) - 2 * 'A') % 26 + 'A');
                } else {
                    encryptText += (char) ((c + key.toLowerCase().charAt(j) - 2 * 'a') % 26 + 'a');
                }
            } else {
                encryptText += c;
            }
            j = ++j % key.length();
        }
        return encryptText;
    }

    // I'm not writing the decrypt extra comment line, which is almost the same as
    // the encrypt operation.
    @Override
    String decrypt(String encryptText, String key) {
        String decryptText = "";

        for (int i = 0, j = 0; i < encryptText.length(); i++) {

            char c = encryptText.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    decryptText += ((char) ('Z' - (25 - (c - key.toUpperCase().charAt(j))) % 26));

                } else {
                    decryptText += ((char) ('z' - (25 - (c - key.toLowerCase().charAt(j))) % 26));
                }
            } else {
                decryptText += c;
            }

            j = ++j % key.length();
        }
        return decryptText;
    }

}
