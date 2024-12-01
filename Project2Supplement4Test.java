import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Project2Supplement4Test {

    @Test
    public void testGenerateRandomHexadecimal() {
        String result = Project2Supplement4.generateRandomHexadecimal();

        // Check the length of the result string is 36 characters (including the dashes)
        assertEquals(36, result.length());

        // Check the format of the string
        assertTrue(result.matches("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}"));
    }
}

