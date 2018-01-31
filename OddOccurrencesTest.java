import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddOccurrencesTest {
    @Test
    void solution() {
    int[] A = {9,3,9,3,9,7,9};
    assertEquals(7,OddOccurrences.Solution(A));

    int[] B = {1,2,3,4,5,6,7,7,6,5,4,3,2,1,13};
    assertEquals(13,OddOccurrences.Solution(B));


    int[] C = {13,2,3,4,5,6,7,7,6,5,4,3,2,1,13};
    assertEquals(1,OddOccurrences.Solution(C));
    }
}