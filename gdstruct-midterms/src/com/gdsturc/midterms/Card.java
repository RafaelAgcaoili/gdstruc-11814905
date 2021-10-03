package com.gdsturc.midterms;

import java.util.Objects;

public class Card {
    private int cardId;
    private String cardName;

    public Card(int cardId, String userName) {
        this.cardId = cardId;
        this.cardName = userName;
    }

    public int getCardId() {
        return cardId;
    }

    public Card setCardId(int cardId) {
        this.cardId = cardId;
        return this;
    }

    public String getUserName() {
        return cardName;
    }

    public Card setCardName(String cardName) {
        this.cardName = cardName;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return cardId == card.cardId &&
                Objects.equals(cardName, card.cardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardId, cardName);
    }

    @Override
    public String toString() {
        return "Card{" +
                "CardId=" + cardId +
                ", cardName='" + cardName + '\'' +
                '}';
    }


}
