package com.kodilla.stream.person;

import java.util.ArrayList;
import java.util.List;

public final class People {
    public static List<String> getList() {
        final List<String> theList = new ArrayList<>();
        theList.add("John Smith");
        theList.add("Dorothy Newman");
        theList.add("John Wolkowitz");
        theList.add("Lucy Riley");
        theList.add("Owen Rogers");
        theList.add("Matilda Davies");
        theList.add("Declan Booth");
        theList.add("Corinne Foster");
        theList.add("Khloe fry");
        theList.add("Martin Valenzuela");
        return new ArrayList<String>(theList);
    }
//    execute in Main:
//
//    People.getList().stream()
//                .map(s -> s.toUpperCase())
////                .map(String::toLowerCase)
//            .filter(s -> s.length() > 11)
//            .map(s -> s.substring(0, s.indexOf(' ') +2) + ".")
//            .filter(s -> s.substring(0, 1).equals("M"))
////                .forEach(s -> System.out.println(s));
//            .forEach(System.out::println);
}
