package InlamningsuppgiftMorse;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MorseCodeLogicTest {

    MorseCodeLogic logic = new MorseCodeLogic();

    // Test 1: Testa att översätta en engelsk bokstav till morsekod
    @Test
    public void testEnglishToMorse() {
        assertEquals(".-", logic.englishToMorse("A"));
        assertEquals("-...", logic.englishToMorse("B"));
        assertEquals("....", logic.englishToMorse("H"));
    }

    // Test 2: Testa att göra om morsekod till engelska
    @Test
    public void testMorseToEnglish() {
        assertEquals("A", logic.morseToEnglish(".-"));
        assertEquals("B", logic.morseToEnglish("-..."));

    }

    //Test 3: Testa att översätta "HELLO" från engelska till morsekod
    @Test
    public void testEnglishToMorseHello() {
    assertEquals(".... . .-.. .-.. ---", logic.englishToMorse("HELLO"));
    }


    // Test 4: Testa att omvandla morsekoden för "HELLO" till engelska
    @Test
    public void testMorseToEnglishHello() {
        assertEquals("HELLO", logic.morseToEnglish(".... . .-.. .-.. ---"));

    }

    // Test 5: Testa en tom text
    @Test
    public void testEmptyText() {
        assertEquals("", logic.englishToMorse(""));
        assertEquals("", logic.morseToEnglish(""));
    }
}
