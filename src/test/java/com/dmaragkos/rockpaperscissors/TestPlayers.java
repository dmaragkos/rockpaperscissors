package com.dmaragkos.rockpaperscissors;

import com.dmaragkos.rockpaperscissors.player.RockPaperScissorPlayer;
import com.dmaragkos.rockpaperscissors.player.RockPaperScissorStrategyGen;
import com.dmaragkos.rockpaperscissors.strategy.*;
import junit.framework.TestCase;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 8:53 PM
 */
public class TestPlayers extends TestCase {

    public void testRockPlayer() {
        RockPaperScissorPlayer player = new RockPaperScissorPlayer(RockPaperScissorStrategyGen.getStrategy(RockPaperScissorStrategy.ROCK_STRATEGY));
        assertEquals(player.play(new RockStrategy()), RockPaperScissorOutcome.TIE);
        assertEquals(player.play(new PaperStrategy()), RockPaperScissorOutcome.LOSE);
        assertEquals(player.play(new ScissorStrategy()), RockPaperScissorOutcome.WIN);
    }

    public void testPaperPlayer() {
        RockPaperScissorPlayer player = new RockPaperScissorPlayer(RockPaperScissorStrategyGen.getStrategy(RockPaperScissorStrategy.PAPER_STRATEGY));
        assertEquals(player.play(new RockStrategy()), RockPaperScissorOutcome.WIN);
        assertEquals(player.play(new PaperStrategy()), RockPaperScissorOutcome.TIE);
        assertEquals(player.play(new ScissorStrategy()), RockPaperScissorOutcome.LOSE);
    }

    public void testScissorsPlayer() {
        RockPaperScissorPlayer player = new RockPaperScissorPlayer(RockPaperScissorStrategyGen.getStrategy(RockPaperScissorStrategy.SCISSOR_STRATEGY));
        assertEquals(player.play(new RockStrategy()), RockPaperScissorOutcome.LOSE);
        assertEquals(player.play(new PaperStrategy()), RockPaperScissorOutcome.WIN);
        assertEquals(player.play(new ScissorStrategy()), RockPaperScissorOutcome.TIE);
    }
}
