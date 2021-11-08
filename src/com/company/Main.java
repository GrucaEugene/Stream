package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static String getReversed(String s) {
        List<String> words = Arrays.asList(s.split(" "));
        Collections.reverse(words);

        return words.stream()
                .reduce((accum, item) -> accum.concat(" " + item)).orElseThrow();


    }

    public static void main(String[] args) {
        System.out.println(getReversed("I went to school"));
    }
}

