package com.jitterted.ebp.blackjack.adapter.in.console;

import com.jitterted.ebp.blackjack.adapter.in.console.ConsoleCard;
import com.jitterted.ebp.blackjack.domain.Card;
import com.jitterted.ebp.blackjack.domain.Rank;
import com.jitterted.ebp.blackjack.domain.Suit;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CardDisplayTest {

    @Test
    void displayTenAsString() {
        Card card = new Card(Suit.CLUBS, Rank.TEN);
        String display = ConsoleCard.display(card);
        assertThat(display)
            .isEqualTo("[30m┌─────────┐[1B[11D│10       │[1B[11D│         │[1B[11D│    ♣    │[1B[11D│         │[1B[11D│       10│[1B[11D└─────────┘");
    }

    @Test
    void displayNonTenAsString() {
        Card card = new Card(Suit.HEARTS, Rank.SEVEN);
        String display = ConsoleCard.display(card);
        assertThat(display)
            .isEqualTo("[31m┌─────────┐[1B[11D│7        │[1B[11D│         │[1B[11D│    ♥    │[1B[11D│         │[1B[11D│        7│[1B[11D└─────────┘");
    }
}
