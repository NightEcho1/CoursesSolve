package org.solutions;

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
}
