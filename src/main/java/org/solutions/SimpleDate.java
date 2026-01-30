package org.solutions;

import java.util.Objects;

public class SimpleDate {
    private final int year;
    private final int month;
    private final int day;

    public SimpleDate(int year, int month, int day) {
        this.year = year;
        this. month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if(!(object instanceof SimpleDate)) {
            return false;
        }

        SimpleDate compared = (SimpleDate) object;

        return this.year == compared.year &&
                this.month == compared.month &&
                this.day == compared.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.day, this.month, this.year);
    }
 }
