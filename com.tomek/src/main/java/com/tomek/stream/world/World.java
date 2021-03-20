package com.tomek.stream.world;

import java.math.BigDecimal;
import java.util.List;

public class World {
private List<Continent> continents;

    public World(List<Continent> continents) {
        this.continents = continents;
    }

    public List<Continent> getContinents() {
        return continents;
    }

    public BigDecimal getPeopleQuantity(){

         return continents.stream()
                .map(Continent::getCountries)
                .flatMap(countries -> countries.stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

    }

}
