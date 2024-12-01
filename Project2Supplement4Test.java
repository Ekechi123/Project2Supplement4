public class Project2Supplement4Test {

    public static void main(String[] args) {
        testGenerateRandomHexadecimal();
    }

    public static void testGenerateRandomHexadecimal() {
        String result = Project2Supplement4.generateRandomHexadecimal();

        // Check the length of the result string is 36 characters (including the dashes)
        if (result.length() == 36) {
            System.out.println("Test Passed: Length is correct.");
        } else {
            System.out.println("Test Failed: Length is incorrect.");
        }

        // Check the format of the string (xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx)
        if (result.matches("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}")) {
            System.out.println("Test Passed: Format is correct.");
        } else {
            System.out.println("Test Failed: Format is incorrect.");
        }
    }
}
