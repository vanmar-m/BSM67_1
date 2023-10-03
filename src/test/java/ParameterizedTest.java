import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParameterizedTest {
    @org.junit.jupiter.params.ParameterizedTest
    @ValueSource(strings={"radar","madam","pavan"})
    public void palindromeTest(String input){
        assertTrue(Parameterized.isPalindrome(input));
    }
}
