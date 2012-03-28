package com.dmaragkos.rockpaperscissors.rules;

import com.dmaragkos.rockpaperscissors.strategy.RockPaperScissorOutcome;
import com.dmaragkos.rockpaperscissors.strategy.RockPaperScissorStrategy;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 4:16 PM
 */
@Deprecated
public interface RockPaperScissorsRulesEvaluator {

    public RockPaperScissorOutcome eval(RockPaperScissorStrategy strategy1, RockPaperScissorStrategy strategy2);
}
