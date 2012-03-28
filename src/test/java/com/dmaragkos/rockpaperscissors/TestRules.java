package com.dmaragkos.rockpaperscissors;

import com.dmaragkos.rockpaperscissors.player.RockPaperScissorPlayer;
import com.dmaragkos.rockpaperscissors.player.RockPaperScissorStrategyGen;
import com.dmaragkos.rockpaperscissors.strategy.*;
import junit.framework.TestCase;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 8:15 PM
 */
public class TestRules extends TestCase {

    public void testWins() {
        assertEquals(new RockStrategy().compete(new ScissorStrategy()), RockPaperScissorOutcome.WIN);
        assertEquals(new ScissorStrategy().compete(new PaperStrategy()), RockPaperScissorOutcome.WIN);
        assertEquals(new PaperStrategy().compete(new RockStrategy()), RockPaperScissorOutcome.WIN);
    }

    public void testLosses() {
        assertEquals(new RockStrategy().compete(new PaperStrategy()), RockPaperScissorOutcome.LOSE);
        assertEquals(new PaperStrategy().compete(new ScissorStrategy()), RockPaperScissorOutcome.LOSE);
        assertEquals(new ScissorStrategy().compete(new RockStrategy()), RockPaperScissorOutcome.LOSE);
    }

    public void testTies() {
        assertEquals(new RockStrategy().compete(new RockStrategy()), RockPaperScissorOutcome.TIE);
        assertEquals(new ScissorStrategy().compete(new ScissorStrategy()), RockPaperScissorOutcome.TIE);
        assertEquals(new PaperStrategy().compete(new PaperStrategy()), RockPaperScissorOutcome.TIE);
    }

}
