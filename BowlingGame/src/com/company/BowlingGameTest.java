package com.company;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingGameTest {

    private Game g;

    @BeforeEach
    protected void setUp() throws Exception {
        g = new Game();
    }

    @Test
    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++) {
            g.roll(pins);
        }
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertEquals(0, g.score());
    }


    @Test
    public void testAllOnes() throws Exception {
        rollMany(20,1);
        assertEquals(20, g.score());
    }

    @Test
    public void testOneStrike() throws Exception {
        rollStrike();
        g.roll(3);
        g.roll(4);
        rollMany(16,0);
        assertEquals(24,g.score());
    }

    @Test
    public void testPerfectGame() throws Exception {
        rollMany(20,10);
        assertEquals(300,g.score());
    }

    @Test
    private void rollSpare() {
        g.roll(5);
        g.roll(5);
    }

    @Test
    private void rollStrike() {
        g.roll(10);
    }


}