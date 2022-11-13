package com.example;

import java.util.ArrayList;
import java.util.Arrays;

public class MethodTest {
    private static < T > int count(ArrayList< T > list){
        return list.size();
    }

    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<>(Arrays.asList("lmao", "LOL", "bruh", "dark", "LMFAO"));
        ArrayList<Integer> integer = new ArrayList<>(Arrays.asList(12, 6, 1, 9, 9, 9));
        ArrayList<Double> doubles = new ArrayList<>(Arrays.asList(1.5, 3.14, 9.8, 3.75, 55.24, 33.24, 5.5, 2.5));

        System.out.println(count(string));
        System.out.println(count(integer));
        System.out.println(count(doubles));

    }
}