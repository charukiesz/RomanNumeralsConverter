package com.techreturners.romannumeralsconverter;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;


public class RomanNumeralsConverter {
    public static void main(String[] args) {


        romanNumerals.put("I", 1);
        romanNumerals.put("II", 2);
        romanNumerals.put("III", 3);
        romanNumerals.put("IV", 4);
        romanNumerals.put("V", 5);
        romanNumerals.put("VI", 6);
        romanNumerals.put("VII", 7);
        romanNumerals.put("VIII", 8);
        romanNumerals.put("IX", 9);
        romanNumerals.put("X", 10);



        Console c = System.console();
        String romanNumeral = c.readLine();

        System.out.println("Please enter a Roman Numeral: ");

        System.out.println(romanNumerals.get(romanNumeral));

    }

  public static Map<String, Integer> romanNumerals = new HashMap<String, Integer>();

}
