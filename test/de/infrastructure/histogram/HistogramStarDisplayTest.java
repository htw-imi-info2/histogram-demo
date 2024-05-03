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
    void testGetHistogram() {
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

    @Test
    void getHistogram5() {
        HistogramStarDisplay hsd = new HistogramStarDisplay();
        int[] frequencyTable = {1,2,3,4,5};
        String actual = hsd.getHistogram(frequencyTable);
        String expected = """
A: *
B: **
C: ***
D: ****
E: *****
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