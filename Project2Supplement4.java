import java.util.Random;

public class Project2Supplement4 {

    public static String generateRandomHexadecimal() {
        Random rand = new Random();
        StringBuilder hexString = new StringBuilder();

        // Generate 32 hexadecimal characters
        for (int i = 0; i < 32; i++) {
            hexString.append(Integer.toHexString(rand.nextInt(16)));
        }

        // Format the result into the required string format
        String formattedHex = hexString.toString();
        return formattedHex.substring(0, 8) + "-" + formattedHex.substring(8, 12) + "-" +
               formattedHex.substring(12, 16) + "-" + formattedHex.substring(16, 20) + "-" +
               formattedHex.substring(20, 32);
    }

    public static void main(String[] args) {
        System.out.println(generateRandomHexadecimal());
    }
}

