package org.solutions;

import java.util.HashMap;

public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getPricePerSquare() {
        return pricePerSquare;
    }

    public int getRooms() {
        return rooms;
    }

    public int getSquares() {
        return squares;
    }

    public boolean largerThan(Apartment compared) {
        int ownLarge = getSquares();
        int comparedLarge = compared.getSquares();

        if (ownLarge < comparedLarge) {
            return false;
        }
        return true;
    }

    public int priceDifference(Apartment compared) {
        int result = 0;
        int ownPrice = getPricePerSquare() * getSquares();
        int comparedPrice = compared.getPricePerSquare() * compared.getSquares();

        result = ownPrice - comparedPrice;

        if (result < 0) {
            return result * -1;
        }
        return result;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ownPrice = getPricePerSquare() * getSquares();
        int comparedPrice = compared.getPricePerSquare() * compared.getSquares();

        if (ownPrice < comparedPrice) {
            return false;
        }
        return true;
    }

    public static class Abbreviations {
        private HashMap<String, String> abbreviationsHashMap;

        public Abbreviations() {
            this.abbreviationsHashMap = new HashMap<>();
        }

        public void addAbbreviation(String abbreviation, String explanation) {
            this.abbreviationsHashMap.put(abbreviation, explanation);
        }

        public boolean hasAbbreviation(String abbreviation) {
            if (this.abbreviationsHashMap.containsKey(abbreviation)) {
                return true;
            } else {
                return false;
            }
        }

        public String findExplanationFor(String abbreviation) {
            if (this.abbreviationsHashMap.containsKey(abbreviation)) {
                return abbreviationsHashMap.get(abbreviation);
            } else  {
                return "sosi";
            }
        }
    }
}
