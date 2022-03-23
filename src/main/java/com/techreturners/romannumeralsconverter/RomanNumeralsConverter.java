package com.techreturners.romannumeralsconverter;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;


public class RomanNumeralsConverter {


    private static Map<String, Integer> romanNumerals = new HashMap<String, Integer>(){{  //Declare and instantiate dictionary of Roman Numerals
        put("I", 1);
        put("II", 2);
        put("III", 3);
        put("IV", 4);
        put("V", 5);
        put("VI", 6);
        put("VII", 7);
        put("VIII", 8);
        put("IX", 9);
        put("X", 10);

    }};


    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);     //Create a Scanner object

        System.out.println("Please enter a Roman Numeral: ");

        String romanNumeral = myObj.nextLine();      //Read user input

        System.out.println(getRomanNumeral(romanNumeral));

    }

    public static Integer getRomanNumeral(String romanNumeral)    //Declare member method to return integer value of Roman Numeral
    {
        return romanNumerals.get(romanNumeral);
    }

}
