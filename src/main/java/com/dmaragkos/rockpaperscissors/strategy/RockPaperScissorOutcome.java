package com.dmaragkos.rockpaperscissors.strategy;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 4:06 PM
 *
 * Enum which models the outcome of a game round
 */
public enum RockPaperScissorOutcome {

    // TODO: i do not like the description of the outcome, change it
    TIE("The game is a tie..."),
    WIN("Computer Won!"),
    LOSE("You won!");

    private final String description;

    private RockPaperScissorOutcome(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
