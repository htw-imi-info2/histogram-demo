package de.infrastructure.histogram;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
class HistogramStarDisplayTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void getHistogramSimple() {
        HistogramStarDisplay hsd = new HistogramStarDisplay();
        int[] frequencyTable = {2};
        String actual = hsd.getHistogram(frequencyTable);
        String expected = """
                A: **
                """;
        assertEquals(expected, actual);
    }
    @Test
    void getHistogram() {
        HistogramStarDisplay hsd = new HistogramStarDisplay();
        int[] frequencyTable = {1,2,3,4};
        String actual = hsd.getHistogram(frequencyTable);
        String expected = """
A: *
B: **
C: ***
D: ****
""";
        assertEquals(expected,actual);

    }
    public void vertical(){
        String expected2 = """
   *
  **
 ***
****
ABCD
""";}
}