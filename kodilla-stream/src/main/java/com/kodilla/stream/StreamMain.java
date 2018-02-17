package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemBeautifierExecutive;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("Nam strzelać nie kazano. - Wstąpiłem na działo", PoemBeautifierExecutive :: addBeginAndEnd);
        poemBeautifier.beautify("I spójrzałem na pole; dwieście armat grzmiało.", PoemBeautifierExecutive :: toUpper);
        poemBeautifier.beautify("Artyleryi ruskiej ciągną się szeregi", PoemBeautifierExecutive :: toLower);
        poemBeautifier.beautify("Prosto, długo, daleko, jako morza brzegi;.", PoemBeautifierExecutive :: reverse);


        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
