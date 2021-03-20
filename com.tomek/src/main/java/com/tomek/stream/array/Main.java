package com.tomek.stream.array;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{10,15,8,9,45};
       double arrayAverage =  ArrayOperations.getAverage(array);
        System.out.println(arrayAverage);
    }

}
