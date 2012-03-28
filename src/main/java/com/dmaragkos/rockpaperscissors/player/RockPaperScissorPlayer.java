package com.dmaragkos.rockpaperscissors.player;

import com.dmaragkos.rockpaperscissors.strategy.RockPaperScissorOutcome;
import com.dmaragkos.rockpaperscissors.strategy.RockPaperScissorStrategy;
import org.apache.log4j.Logger;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 4:08 PM
 */
public class RockPaperScissorPlayer {

    private static final Logger logger = Logger.getLogger(RockPaperScissorPlayer.class);

    private RockPaperScissorStrategy strategy;

    public RockPaperScissorPlayer(RockPaperScissorStrategy strategy) {
        this.strategy = strategy;
        logger.debug(String.format("Setting computer strategy to %s", strategy.toString()));
    }

    public RockPaperScissorStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(RockPaperScissorStrategy strategy) {
        if(strategy == null) throw new IllegalArgumentException("Cannot set strategy to null");
        this.strategy = strategy;
        logger.debug(String.format("Setting computer strategy to %s", strategy.toString()));
    }

    public RockPaperScissorOutcome play(RockPaperScissorStrategy opponentStrategy) {
        return strategy.compete(opponentStrategy);
    }
}
