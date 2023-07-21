 
 import org.junit.jupiter.api.Assertions;
 import org.junit.jupiter.api.Test;

public class PasswordGeneratorTest {

    @Test
    public void testGeneratePasswordStrings() {
        int numPasswords = 5;
        int passwordLength = 12;

        String[] passwords = PasswordGenerator.generatePasswordStrings(numPasswords, passwordLength);

        Assertions.assertEquals(numPasswords, passwords.length);
        for (String password : passwords) {
            Assertions.assertEquals(passwordLength, password.length());
        }
    }

    @Test
    public void testCalculateStrength() {
        String weakPassword = "password";
        String mediumPassword = "P@ssw0rd";
        String goodPassword = "StrongP@ssw0rd";
        String greatPassword = "SuperStr0ngP@ssw0rd";

        int weakScore = PasswordGenerator.calculateStrength(weakPassword);
        int mediumScore = PasswordGenerator.calculateStrength(mediumPassword);
        int goodScore = PasswordGenerator.calculateStrength(goodPassword);
        int greatScore = PasswordGenerator.calculateStrength(greatPassword);

        Assertions.assertEquals(2, weakScore);
        Assertions.assertEquals(5, mediumScore);
        Assertions.assertEquals(5, goodScore);
        Assertions.assertEquals(6, greatScore);
    }

    @Test
    public void testCheckStrength() {
        String weakStrength = PasswordGenerator.checkStrength(2);
        String mediumStrength = PasswordGenerator.checkStrength(3);
        String goodStrength = PasswordGenerator.checkStrength(4);
        String greatStrength = PasswordGenerator.checkStrength(6);

        Assertions.assertEquals("Weak", weakStrength);
        Assertions.assertEquals("Medium", mediumStrength);
        Assertions.assertEquals("Good", goodStrength);
        Assertions.assertEquals("Great", greatStrength);
    }
}
