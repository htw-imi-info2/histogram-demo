package playground;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterPlayground {
    @Test
    public void charFromIndex() {
        assertEquals('A',(char)65);
        assertEquals(97,(int)'a');
        assertEquals('a',(char)97);
        assertEquals('z',(char)((int)'a'+25));

    }
}
