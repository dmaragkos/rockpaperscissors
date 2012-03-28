package com.dmaragkos.rockpaperscissors.strategy;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 4:03 PM
 * <p/>
 * Interface which models the strategies used for the Rock/Paper/Scissor game
 */
public interface RockPaperScissorStrategy {

    public static final short ROCK_STRATEGY = 0;
    public static final short PAPER_STRATEGY = 1;
    public static final short SCISSOR_STRATEGY = 2;

    /**
     * @param opponentStrategy the opponent's strategy
     * @return if this @RockPaperScissorStrategy wins @opponentStrategy, false otherwise
     */
    public RockPaperScissorOutcome compete(RockPaperScissorStrategy opponentStrategy);
    public RockPaperScissorOutcome getOutcome(RockStrategy rockStrategy);
    public RockPaperScissorOutcome getOutcome(PaperStrategy paperStrategy);
    public RockPaperScissorOutcome getOutcome(ScissorStrategy scissorStrategy);
}
