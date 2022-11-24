package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP10K7Square2Dot73() {
        double expected = 2.73;
        double p = 10;
        double k = 2;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP0K12Square0() {
        double expected = 0.00;
        double p = 0;
        double k = 12;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when18K36Square2Dot13() {
        double expected = 2.13;
        double p = 18;
        double k = 36;
        double out = SqArea.square(p, k);
        assertEquals(expected, out, 0.01);
    }
}