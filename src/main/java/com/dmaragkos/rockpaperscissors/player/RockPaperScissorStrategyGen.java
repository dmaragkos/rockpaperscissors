package com.dmaragkos.rockpaperscissors.player;

import com.dmaragkos.rockpaperscissors.strategy.PaperStrategy;
import com.dmaragkos.rockpaperscissors.strategy.RockPaperScissorStrategy;
import com.dmaragkos.rockpaperscissors.strategy.RockStrategy;
import com.dmaragkos.rockpaperscissors.strategy.ScissorStrategy;

import java.util.Random;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 6:50 PM
 */
public class RockPaperScissorStrategyGen {

    private static final Random random = new Random();

    public static RockPaperScissorStrategy getNext() {
        return getStrategy(random.nextInt(3));
    }

    public static RockPaperScissorStrategy getStrategy(int id) {
        switch (id) {
            case RockPaperScissorStrategy.ROCK_STRATEGY:
                return new RockStrategy();
            case RockPaperScissorStrategy.PAPER_STRATEGY:
                return new PaperStrategy();
            case RockPaperScissorStrategy.SCISSOR_STRATEGY:
                return new ScissorStrategy();
            default:
                throw new IllegalStateException("Not a valid strategy");
        }
    }
}
