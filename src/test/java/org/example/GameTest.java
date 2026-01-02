package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    void testGreenLightZeroSpeed() {
        Game.setGreenLight(true);
        Assertions.assertFalse(Game.isPlayerOut(0));
    }

    @Test
    void testGreenLightNonZeroSpeed() {
        Game.setGreenLight(true);
        Assertions.assertFalse(Game.isPlayerOut(5));
        Assertions.assertFalse(Game.isPlayerOut(10));
    }

    @Test
    void testRedLightZeroSpeed() {
        Game.setGreenLight(false);
        Assertions.assertFalse(Game.isPlayerOut(0));
    }

    @Test
    void testRedLightNonZeroSpeed() {
        Game.setGreenLight(false);
        Assertions.assertTrue(Game.isPlayerOut(5));
        Assertions.assertTrue(Game.isPlayerOut(1));
    }

    @Test
    void testRedLightEdgeCases() {
        Game.setGreenLight(false);
        Assertions.assertTrue(Game.isPlayerOut(1));
        Assertions.assertTrue(Game.isPlayerOut(100));
        Assertions.assertTrue(Game.isPlayerOut(Integer.MAX_VALUE));
    }

    @Test
    void testGreenLightEdgeCases() {
        Game.setGreenLight(true);
        Assertions.assertFalse(Game.isPlayerOut(1));
        Assertions.assertFalse(Game.isPlayerOut(100));
        Assertions.assertFalse(Game.isPlayerOut(Integer.MAX_VALUE));
    }

    @Test
    void testLightSwitching() {
        Game.setGreenLight(true);
        Assertions.assertFalse(Game.isPlayerOut(5));

        Game.setGreenLight(false);
        Assertions.assertTrue(Game.isPlayerOut(5));

        Game.setGreenLight(true);
        Assertions.assertFalse(Game.isPlayerOut(5));
    }
}