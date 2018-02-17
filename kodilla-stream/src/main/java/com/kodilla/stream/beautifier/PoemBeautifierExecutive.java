package com.kodilla.stream.beautifier;

public class PoemBeautifierExecutive {
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
    }
}
