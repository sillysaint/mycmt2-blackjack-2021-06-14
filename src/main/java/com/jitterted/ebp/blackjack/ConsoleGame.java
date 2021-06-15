package com.jitterted.ebp.blackjack;

// Controller/Boundary
public class ConsoleGame {

    private final Game game;

    public ConsoleGame(Game game) {
        this.game = game;
    }

    public void start() {
        Game.displayWelcomeScreen();

        game.initialDeal();

        playerPlays();

        game.dealerTurn();

        game.displayFinalGameState();

        game.determineOutcome();

        Game.resetScreen();
    }

    public void playerPlays() {
        while (!game.isPlayerDone()) {
            game.displayGameState();
            String command = game.inputFromPlayer();
            handle(command);
        }
    }

    // Translator/Dispatcher
    public void handle(String command) {
        if (command.toLowerCase().startsWith("h")) {
            game.playerHits();
        } else if (command.toLowerCase().startsWith("s")) {
            game.playerStands();
        }
    }
}
