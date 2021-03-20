package com.tomek.stream.bautifier;

import java.util.Random;

public class PoemBeautifier {
   public static void toUpperCase(String toUpperWord){
       PoemDecorator poemDecorator = word -> word.toUpperCase();
       System.out.println(poemDecorator.decorate(toUpperWord));
    }
    public static void addABC(String abcWord){
       PoemDecorator abcPoemDecorator = word -> {
           return "abc" + word;
       };
        System.out.println(abcPoemDecorator.decorate(abcWord));
    }
    public static void wordPlusLength(String wordPlus){
       PoemDecorator wordPlusLength = word -> {
           return word + word.length();
       };
        System.out.println(wordPlusLength.decorate(wordPlus));

    }
    public static void wordPlusRandom(String wordRandom){
       Random random = new Random();
        PoemDecorator wordPlusLength = word -> {
            int intToChar = random.nextInt(51);
            char intChar = (char)intToChar;
            return word + intChar;
        };
        System.out.println(wordPlusLength.decorate(wordRandom));

    }
}
