package com.tomek.stream.world;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Country poland = new Country(new BigDecimal("40000000"));
        Country germany = new Country(new BigDecimal("80000000"));
        Country czech = new Country(new BigDecimal("10000000"));
        List<Country> countries = Arrays.asList(poland, germany, czech);
        Continent europe = new Continent(countries);
        List<Continent> continents = Collections.singletonList(europe);
        World world = new World(continents);
        System.out.println(world.getPeopleQuantity());
    }
}
