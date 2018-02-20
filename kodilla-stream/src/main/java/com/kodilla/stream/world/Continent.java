package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.*;

public final class Continent {
    private String continent;
    private final List<Country> countries;

    public Continent(final String continent, final List<Country> countries) {
        this.continent = continent;
        this.countries = countries;
    }

    public String getContinent() {
        return continent;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Continent continent1 = (Continent) o;
        return Objects.equals(continent, continent1.continent) &&
                Objects.equals(countries, continent1.countries);
    }

    @Override
    public int hashCode() {

        return Objects.hash(continent, countries);
    }

//    public BigDecimal getPeopleQuantity() {
//        return countries.stream()
//                .map(country -> country.getPeopleQuantity())
//                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
//    }
}
