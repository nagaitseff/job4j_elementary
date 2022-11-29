package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class FitTest {
    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        double delta = 0.01;
        assertThat(out).isCloseTo(expected, within(delta));
    }

    @Test
    public void whenWoman170Then69() {
        short in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        double delta = 0.01;
        assertThat(out).isCloseTo(expected, within(delta));
    }
}