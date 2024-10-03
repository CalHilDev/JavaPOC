package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SequenceTest {
    @Test
    public void testRunSequence(){
        Sequence sequence = new Sequence();
        int result = sequence.runSequence(4);
        assertEquals(24, result, "Input of 4 should result in 12");
    }
}