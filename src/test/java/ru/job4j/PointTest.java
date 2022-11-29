package ru.job4j;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

public class PointTest {
    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isCloseTo(expected, within(delta));
    }

    @Test
    public void when11To35Then4Dot47() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 3;
        int y2 = 5;
        double expected = 4.47;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isCloseTo(expected, within(delta));
    }

    @Test
    public void when11To00Then4Dot47() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 0;
        int y2 = 0;
        double expected = 1.41;
        double delta = 0.01;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isCloseTo(expected, within(delta));
    }
}