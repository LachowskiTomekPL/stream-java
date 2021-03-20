package com.tomek.stream.bautifier;

public class Test {
    public static void main(String[] args) {
        PoemBeautifier.toUpperCase("mama");
        PoemBeautifier.addABC("mama");
        PoemBeautifier.wordPlusLength("mama");
        for(int i = 0; i<10; i++) {
            PoemBeautifier.wordPlusRandom("mama");
        }

    }
}
