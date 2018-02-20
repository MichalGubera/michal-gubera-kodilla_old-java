package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.*;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent("Europe", Arrays.asList(
                new Country("Germany", new BigDecimal("5554567890")),
                new Country("France", new BigDecimal("5687456789"))
        ));
        Continent asia = new Continent("Asia", Arrays.asList(
                new Country("Russia", new BigDecimal("11234567890")),
                new Country("China",new BigDecimal("5568745678901"))
        ));
        Continent america = new Continent("America", Arrays.asList(
                new Country("USA", new BigDecimal("11234567890")),
                new Country("Brazil", new BigDecimal("25687456"))
        ));
        World theWholeWorld = new World(Arrays.asList(europe, asia, america));

        //When
        BigDecimal worldPopulation = theWholeWorld.getPeopleQuantity();

        //Then
        BigDecimal peopleQuantityCheck = new BigDecimal("5602482526816");
        Assert.assertEquals(peopleQuantityCheck,worldPopulation);
    }
}
