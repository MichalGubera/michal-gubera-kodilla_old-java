package com.kodilla.stream.beautifier;

public class PoemBeautifierExecutive {
    public static String addBeginAndEnd(String string){
        String stringToBeautify = new String(string);
        String begin = "Uwaga! Zaczynam... : ";
        String beginWith = begin.concat(stringToBeautify);
        return beginWith.concat(" - I co?!");
    }

    public static String toUpper(String string){
        String stringToBeautify = new String(string);
        return stringToBeautify.toUpperCase();
    }

    public static String toLower(String string){
        String stringToBeautify = new String(string);
        return stringToBeautify.toLowerCase();
    }

    public static String reverse(String string){
        String stringToBeautify = new String(string);
        String reversed = "";
        for(int i=(stringToBeautify.length())-1; i>0; i-- ){
            reversed += stringToBeautify.charAt(i-1);
        }
        return reversed;
    }
}
