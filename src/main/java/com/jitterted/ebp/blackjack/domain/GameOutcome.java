package com.jitterted.ebp.blackjack.domain;

public enum GameOutcome {
    PLAYER_BUSTED("You Busted, so you lose. 💸"),
    DEALER_BUSTED("Dealer went BUST, Player wins! Yay for you!! 💵"),
    PLAYER_BEATS_DEALER("You beat the Dealer! 💵"),
    PUSH("Push: Nobody wins, we'll call it even."),
    DEALER_BEATS_PLAYER("You lost to the Dealer. 💸"),
    BLACKJACK("Congratulations! You got a Blackjack!. 💵");

    private final String message;

    GameOutcome(String message) {
        this.message = message;
    }

    public String message() {
        return message;
    }
}
