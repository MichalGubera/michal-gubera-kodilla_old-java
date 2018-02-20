package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.Objects;

public final class Country {
    private String country;
    private final BigDecimal peopleQuantity;

    public Country(String country, final BigDecimal peopleQuantity) {
        this.country = country;
        this.peopleQuantity = peopleQuantity;
    }

    public String getCountry() {
        return country;
    }
    public BigDecimal getPeopleQuantity() {
        return peopleQuantity;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Country)) return false;
        Country country = (Country) o;
        return Objects.equals(getCountry(), country.getCountry());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getCountry());
    }
    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + country + '\'' +
                ", peopleQuantity=" + peopleQuantity +
                '}';
    }
}
