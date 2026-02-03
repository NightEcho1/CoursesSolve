package org.solutions;

public class CD implements Packable {
    private String artistName;
    private String nameOfCD;
    private int publicationYear;
    private double weight;

    public CD(String artistName, String nameOfCD, int publicationYear) {
        this.artistName = artistName;
        this.nameOfCD = nameOfCD;
        this.publicationYear = publicationYear;
        this.weight = 0.1;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getNameOfCD() {
        return nameOfCD;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return this.artistName + ": " +  this.nameOfCD + " (" + this.publicationYear + ")";
    }

    @Override
    public double weight() {
        return this.weight;
    }
}
