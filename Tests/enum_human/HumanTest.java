package enum_human;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HumanTest {

    private Human pola = new Human("Pola", 21, ColorOfEye.DARK, ColorOfHair.BROWN);

    @Test
    void getName() {
        assertEquals("Pola", pola.getName());
    }

    @Test
    void getOld() {
        assertNotEquals(10, pola.getOld());
    }

    @Test
    void getColorOfEye() {
        assertEquals(ColorOfEye.DARK, pola.getColorOfEye());
    }

    @Test
    void getColorOfHair() {
        assertEquals(ColorOfHair.BROWN, pola.getColorOfHair());
    }
}