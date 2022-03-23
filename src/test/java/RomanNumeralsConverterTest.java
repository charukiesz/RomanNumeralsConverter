import com.techreturners.romannumeralsconverter.RomanNumeralsConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class RomanNumeralsConverterTest {


    @Test
   public void checkRomanNumeralI(){
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
         String romanNumeral = "I";
         Integer expectedResult = 1;
         Integer actualResult = RomanNumeralsConverter.getRomanNumeral(romanNumeral);

         Assertions.assertEquals(expectedResult, actualResult);
    }
   @Test
    public void checkNotARomanNumeralLowerCase(){

       RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
       String romanNumeral = "i";
       Integer expectedResult = 1;
       Integer actualResult = RomanNumeralsConverter.getRomanNumeral(romanNumeral);

       Assertions.assertEquals(expectedResult, actualResult);

   }


}
