package com.dmaragkos.rockpaperscissors.strategy;

import org.apache.log4j.Logger;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 4:25 PM
 */
public class RockStrategy implements RockPaperScissorStrategy {

    private static final Logger logger = Logger.getLogger(RockStrategy.class);

    public RockPaperScissorOutcome compete(RockPaperScissorStrategy opponentStrategy) {
        return opponentStrategy.getOutcome(this);
    }

    public RockPaperScissorOutcome getOutcome(RockStrategy rockStrategy) {
        logger.info(String.format("%s ties with %s", rockStrategy, this));
        return RockPaperScissorOutcome.TIE;
    }

    public RockPaperScissorOutcome getOutcome(PaperStrategy paperStrategy) {
        logger.info(String.format("%s wins %s", paperStrategy, this));
        return RockPaperScissorOutcome.WIN;
    }

    public RockPaperScissorOutcome getOutcome(ScissorStrategy scissorStrategy) {
        logger.info(String.format("%s loses by %s", scissorStrategy, this));
        return RockPaperScissorOutcome.LOSE;
    }

    @Override
    public String toString() {
        return "Rock";
    }
}
