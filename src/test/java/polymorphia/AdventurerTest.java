package polymorphia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdventurerTest {

    @Test
    void testCreation() {
        Adventurer bilbo = new Adventurer("Bilbo", 5.0);
//        assertTrue(bilbo != null); -- not possible, so not a good test
        assertEquals("Bilbo", bilbo.getName());
        assertEquals(5.0, bilbo.getHealth());
    }
}
