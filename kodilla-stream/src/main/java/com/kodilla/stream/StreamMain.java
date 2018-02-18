package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("Nam strzelać nie kazano. - Wstąpiłem na działo", PoemBeautifier :: addBeginAndEnd);
        poemBeautifier.beautify("I spójrzałem na pole; dwieście armat grzmiało.", PoemBeautifier :: toUpper);
        poemBeautifier.beautify("Artyleryi ruskiej ciągną się szeregi", PoemBeautifier :: toLower);
        poemBeautifier.beautify("Prosto, długo, daleko, jako morza brzegi;.", PoemBeautifier :: reverse);
    }
}
