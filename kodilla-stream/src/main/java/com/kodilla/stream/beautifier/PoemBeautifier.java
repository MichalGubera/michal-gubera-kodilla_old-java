package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String string, PoemDecorator poemDecorator){
        String result = poemDecorator.decorate(string);
        System.out.println(result);
    }

    public static String addBeginAndEnd(String string){
        String begin = "Uwaga! Zaczynam... : ";
        String beginWith = begin.concat(string);
        return beginWith.concat(" - I co?!");
    }

    public static String toUpper(String string){
        return string.toUpperCase();
    }

    public static String toLower(String string){
        return string.toLowerCase();
    }

    public static String reverse(String string){
        String reversed = "";
        for(int i=(string.length())-1; i>0; i-- ){
            reversed += string.charAt(i-1);
        }
        return reversed;

//        execution in Main Class:
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("Nam strzelać nie kazano. - Wstąpiłem na działo", PoemBeautifier :: addBeginAndEnd);
//        poemBeautifier.beautify("I spójrzałem na pole; dwieście armat grzmiało.", PoemBeautifier :: toUpper);
//        poemBeautifier.beautify("Artyleryi ruskiej ciągną się szeregi", PoemBeautifier :: toLower);
//        poemBeautifier.beautify("Prosto, długo, daleko, jako morza brzegi;.", PoemBeautifier :: reverse);
    }
}
