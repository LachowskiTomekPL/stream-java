package com.tomek.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        final BigDecimal POLAND_POPULATION = new BigDecimal("40000000");
        final BigDecimal GERMANY_POPULATION = new BigDecimal("80000000");
        final BigDecimal CZECH_POPULATION = new BigDecimal("10000000");
        final BigDecimal USA_POPULATION = new BigDecimal("308000000");
        final BigDecimal CANADA_POPULATION = new BigDecimal("34000000");
        final BigDecimal SUM_POPULATION = new BigDecimal("472000000");

        // EUROPE
        Country poland = new Country(POLAND_POPULATION);
        Country germany = new Country(GERMANY_POPULATION);
        Country czech = new Country(CZECH_POPULATION);

        List<Country> europeCountries = Arrays.asList(poland, germany, czech);
        Continent europe = new Continent(europeCountries);

        //NORTH AMERICA
        Country usa = new Country(USA_POPULATION);
        Country canada = new Country(CANADA_POPULATION);
        List<Country> northAmericaCountries = Arrays.asList(usa, canada);
        Continent northAmerica = new Continent(northAmericaCountries);

        //WORLD
        List<Continent> continents = Arrays.asList(europe, northAmerica);
        World world = new World(continents);
        BigDecimal population = world.getPeopleQuantity();


        Assert.assertEquals(SUM_POPULATION, population);
    }
}
