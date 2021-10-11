package dev.goo.trump;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PairOfCardTest {

    @Test
    void winnerPairOfCards() {
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♣4","♥7","♥7","♠Q","♣J"}, new String[]{"♥10","♥6","♣K","♠Q","♦2"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♣4","♥7","♥7","♠Q","♣J"}, new String[]{"♥7","♥7","♣K","♠Q","♦2"}));
        assertEquals("draw", PairOfCard.winnerPairOfCards(new String[]{"♣A","♥2","♥3","♠4","♣5"}, new String[]{"♥A","♥2","♣3","♠4","♦5"}));
        assertEquals("draw", PairOfCard.winnerPairOfCards(new String[]{"♣A","♥A","♥A","♠4","♣5"}, new String[]{"♥A","♥A","♣A","♠4","♦5"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♣9","♥8","♥7","♠4","♣5"}, new String[]{"♥10","♥8","♣7","♠4","♦5"}));
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♣A","♥A","♥2","♠3","♣4"}, new String[]{"♥6","♥6","♣Q","♠Q","♦8"}));
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♣A","♥A","♥A","♠3","♣4"}, new String[]{"♥6","♥6","♣Q","♠Q","♦Q"}));
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♣K","♥K","♥K","♠A","♣A"}, new String[]{"♥6","♥6","♣Q","♠Q","♦Q"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♣6","♠3","♠J","♦2","♥3"}, new String[]{"♠8","♥2","♦8","♥9","♦J"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♥3","♠9","♦3","♣Q","♦A"}, new String[]{"♥4","♥3","♠10","♦3","♥4"}));
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♥3","♠9","♦3","♣Q","♦3"}, new String[]{"♥4","♥A","♠10","♦A","♥4"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♣K","♥8","♥K","♠K","♣A"}, new String[]{"♥K","♥4","♣K","♠4","♦K"}));
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♥9","♠8","♦7","♣6","♦5"}, new String[]{"♥9","♥8","♠7","♦6","♥4"}));
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♥3","♠4","♦5","♣6","♦7"}, new String[]{"♥2","♥3","♠5","♦6","♥7"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♥K","♠4","♦K","♣6","♦6"}, new String[]{"♥6","♥K","♠K","♦6","♥7"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♥2","♠2","♦2","♣2","♦6"}, new String[]{"♥2","♥2","♠2","♦2","♥7"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♥2","♠2","♦2","♣2","♦6","♠3","♦3","♣4","♦6"}, new String[]{"♥2","♥2","♠2","♦3","♥7","♠2","♦3","♣6","♦6"}));
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♥2","♠2","♦2","♣2","♦6","♠3","♦3","♣4","♦3"}, new String[]{"♥2","♥2","♠2","♦3","♥7","♠2","♦3","♣6","♦6"}));
        assertEquals("player1", PairOfCard.winnerPairOfCards(new String[]{"♥2","♠2","♦6"}, new String[]{"♥2","♥2","♥3"}));
        assertEquals("player2", PairOfCard.winnerPairOfCards(new String[]{"♥2","♠A","♦6"}, new String[]{"♥2","♥2","♥3"}));
    }
}