package com.dmaragkos.rockpaperscissors.strategy;

import org.apache.log4j.Logger;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 4:25 PM
 */
public class ScissorStrategy implements RockPaperScissorStrategy {

    private static final Logger logger = Logger.getLogger(ScissorStrategy.class);

    public RockPaperScissorOutcome compete(RockPaperScissorStrategy opponentStrategy) {
        return opponentStrategy.getOutcome(this);
    }

    public RockPaperScissorOutcome getOutcome(PaperStrategy paperStrategy) {
        logger.info(String.format("%s loses by %s", paperStrategy, this));
        return RockPaperScissorOutcome.LOSE;
    }

    public RockPaperScissorOutcome getOutcome(RockStrategy rockStrategy) {
        logger.info(String.format("%s wins %s", rockStrategy, this));
        return RockPaperScissorOutcome.WIN;
    }

    public RockPaperScissorOutcome getOutcome(ScissorStrategy scissorStrategy) {
        logger.info(String.format("%s ties with %s", scissorStrategy, this));
        return RockPaperScissorOutcome.TIE;
    }

    @Override
    public String toString() {
        return "Scissor";
    }
}
