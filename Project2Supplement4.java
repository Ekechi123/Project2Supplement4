import java.util.Random;

public class Project2Supplement4 {

    public static String generateRandomHexadecimal() {
        Random rand = new Random();
        StringBuilder hexString = new StringBuilder();

        // Generate 32 hexadecimal characters
        for (int i = 0; i < 8; i++) {
            hexString.append(Integer.toHexString(rand.nextInt(16)));
        }
        hexString.append("-");

        for (int i = 0; i < 4; i++) {
            hexString.append(Integer.toHexString(rand.nextInt(16)));
        }
        hexString.append("-");

        for (int i = 0; i < 4; i++) {
            hexString.append(Integer.toHexString(rand.nextInt(16)));
        }
        hexString.append("-");

        for (int i = 0; i < 4; i++) {
            hexString.append(Integer.toHexString(rand.nextInt(16)));
        }
        hexString.append("-");

        for (int i = 0; i < 12; i++) {
            hexString.append(Integer.toHexString(rand.nextInt(16)));
        }

        return hexString.toString();
    }
}

