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
        Boolean succeed = false;              //Declare and initialise succeed variable to false
        Scanner myObj = new Scanner(System.in);  //Declare and instantiate Scanner object
        while (succeed == false) {                    //While succeed is false
            succeed = getInputRomanNumeral(myObj); //Set value of succeed to the return value of getInputRomanNumeral method
        }
    }

    // Member method to return integer representation of the Roman Numeral,
    // or -1 if not a valid Roman Numeral
    public static Integer getRomanNumeral(String romanNumeral)
    {
        if (romanNumerals.containsKey(romanNumeral)) {       //Check if the input Roman Numeral is valid
            return romanNumerals.get(romanNumeral);
        }
        else
            return -1;
    }

    //Member method to return integer representation of the Roman Numeral,
    //or message indicating the Roman Numeral is not valid followed by the message
    // to prompt user to enter a Roman Numeral
   public static boolean getInputRomanNumeral(Scanner myObj)
    {
        System.out.println("Please enter a Roman Numeral: ");  //Prompt the user to input a Roman Numeral

        String romanNumeral = myObj.nextLine();         //Read and store input in romanNumeral
    Integer result = getRomanNumeral(romanNumeral);   
        if (result > -1) {
            System.out.println(result);          //Print the integer value of the Roman Numeral
            return true;
        } else {
            System.out.println("Not a valid Roman Numeral. Please use the symbols I, V or X.");
            return false;
        }
    }
}
