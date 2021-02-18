package com.invillia.challenge.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Challenge 2
 *
 * Java Classes, Constructors, Methods, Collection
 *
 * 1. Write missing code to compile
 * 2. Write the code to create the catalog and add cars in it
 * 3. Cars contains name, price and horsePower
 * 4. Write the code to printCatalog using stout
 * 5. Print only cards below the maximum price
 * 6. Sort by horsePower from hightest to lowest
 *
 */


/**
 * Enter your code here.
 */


public class Challenge2 {

    public static void main(String args[]) {

        Catalog catalog = new Catalog();

        catalog.add(new Car("Jetta", 28900, 228));
        catalog.add(new Car("BMW 320", 52700, 382));
        catalog.add(new Car("Corolla", 27025, 169));
        catalog.add(new Car("C180", 43600, 355));
        catalog.add(new Car("Civic", 33995, 220));

        double maximumPrice = 40000;

        catalog.printCatalog(maximumPrice);
    }
}
