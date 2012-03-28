package com.dmaragkos.rockpaperscissors;

import com.dmaragkos.rockpaperscissors.player.RockPaperScissorPlayer;
import com.dmaragkos.rockpaperscissors.player.RockPaperScissorStrategyGen;
import com.dmaragkos.rockpaperscissors.strategy.RockPaperScissorOutcome;
import com.dmaragkos.rockpaperscissors.strategy.RockPaperScissorStrategy;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: dmaragkos
 * Date: 2/18/12
 * Time: 4:12 PM
 */
public class RockPaperScissorPlay {

    private static final Logger logger = Logger.getLogger(RockPaperScissorPlay.class);

    private static RockPaperScissorPlayer COMPUTER;
    private static final String WELCOME = "Welcome to the Rock Paper Scissor Game";
    private static final String NO_OF_GAMES = "How many times would you like to play?";
    private static final String PLAYER_CALL = "What is your call? [0] for Rock ,[1] for Paper, [2] for Scissors";
    private static final String PLAY_NO = "Play no. %d\n";
    private static final String END = "End of game";

    private static int parsePositiveBoundedArithmetic(String inputString, int upperBound) {
        int arithmetic = parsePositiveArithmetic(inputString);
        return arithmetic <= upperBound ? arithmetic : -1;
    }

    private static int parsePositiveArithmetic(String inputString) {
        int userInput = -1;
        try {
            userInput = Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input!");
        }
        return userInput;
    }

    private static RockPaperScissorPlayer getComputerPlayer() {
        if (COMPUTER == null) {
            COMPUTER = new RockPaperScissorPlayer(RockPaperScissorStrategyGen.getNext());
            return COMPUTER;
        }
        COMPUTER.setStrategy(RockPaperScissorStrategyGen.getNext());
        return COMPUTER;
    }

    private static int getNumberOfPlays(BufferedReader input) throws IOException {
        int numberOfPlays = -1;
        while (numberOfPlays < 0) {
            System.out.println(NO_OF_GAMES);
            numberOfPlays = parsePositiveArithmetic(input.readLine());
        }
        return numberOfPlays;
    }

    private static RockPaperScissorOutcome getOutcome(BufferedReader input) throws IOException {
        RockPaperScissorStrategy userStrategy = RockPaperScissorStrategyGen.getStrategy(parsePositiveBoundedArithmetic(input.readLine(), 2));
        logger.debug(String.format("Human Strategy %s", userStrategy));
        return getComputerPlayer().play(userStrategy);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(WELCOME);
        int numberOfPlays = getNumberOfPlays(br);
        for (int i = 0; i < numberOfPlays; i++) {
            System.out.println();
            System.out.printf(PLAY_NO, i);
            System.out.println(PLAYER_CALL);
            RockPaperScissorOutcome outcome = null;
            while (outcome == null) {
                try {
                    outcome = getOutcome(br);
                } catch (Exception e) {
                    System.out.println(e.getLocalizedMessage());
                    System.out.println();
                    System.out.printf(PLAY_NO, i);
                    System.out.println(PLAYER_CALL);
                }
            }
            System.out.println(outcome.toString());
            System.out.println(END);
        }
    }
}
