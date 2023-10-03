import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExampleTest {
    Example e;

    @BeforeEach
    void init() {
        e = new Example();
    }

    @Test
    void testNull() {
        String TC = e.convertCase(null);
        assertEquals("", TC);
    }

    @Test
    void testNoInput() {
        String TC = e.convertCase("");
        assertEquals("", TC);
    }

    @Test
    void testSingleInput() {
        String TC = e.convertCase("1");
        assertEquals("1", TC);
    }

    @Test
    void testUpperCase() {
        String TC = e.convertCase("test");
        assertEquals("TEST", TC);
    }

    @Test
    void testLowerCase() {
        String TC = e.convertCase("TEST");
        assertEquals("test", TC);
    }
}
