package com.examen.hashCode;

import java.util.Objects;

public class Carta {
    private String value;
    private String suit;

    public Carta(String value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return Objects.equals(value, carta.value) && Objects.equals(suit, carta.suit);
    }

    @Override
    public int hashCode() {

        //Define que el hashcode sea el mismo por suit.
        return suit.hashCode();
        //Objects.hash(value, suit);
    }
}
