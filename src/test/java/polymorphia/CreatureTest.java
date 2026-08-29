package polymorphia;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreatureTest {

    @Test
    void testCreation() {
        Creature ogre = new Creature("Shrek", 5.0);
        assertEquals("Shrek", ogre.getName());
        assertEquals(5.0, ogre.getHealth());
    }
}
