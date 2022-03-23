import com.techreturners.romannumeralsconverter.RomanNumeralsConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;


public class RomanNumeralsConverterTest {
    @Test
   public void checkRomanNumeralI(){
        //Arrange
         RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
         String romanNumeral = "I";
         Integer expectedResult = 1;
         //Act
         Integer actualResult = RomanNumeralsConverter.getRomanNumeral(romanNumeral);
        //Assert
         Assertions.assertEquals(expectedResult, actualResult);
    }
   @Test
    public void checkRomanNumeralV(){
       //Arrange
       RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
       String romanNumeral = "V";
       Integer expectedResult = 5;
       //Act
       Integer actualResult = RomanNumeralsConverter.getRomanNumeral(romanNumeral);
       //Assert
       Assertions.assertEquals(expectedResult, actualResult);

   }

   @Test
    public void checkNotARomanNumeralLowerCasei(){
       //Arrange
       RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
       String romanNumeral = "i";
       Integer expectedResult = null;
       //Act
       Integer actualResult = RomanNumeralsConverter.getRomanNumeral(romanNumeral);
       //Assert
       Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void checkNotARomanNumeralLowerCasev(){
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        String romanNumeral = "v";
        Integer expectedResult = null;
        //Act
        Integer actualResult = RomanNumeralsConverter.getRomanNumeral(romanNumeral);
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void checkNotARomanNumeralLowerCaseLetter() {
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        String romanNumeral = "a";
        Integer expectedResult = null;
        //Act
        Integer actualResult = RomanNumeralsConverter.getRomanNumeral(romanNumeral);
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void checkNotARomanNumeralUpperCaseLetter(){
        //Arrange
        RomanNumeralsConverter romanNumeralsConverter = new RomanNumeralsConverter();
        String romanNumeral = "C";
        Integer expectedResult = null;
        //Act
        Integer actualResult = RomanNumeralsConverter.getRomanNumeral(romanNumeral);
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
}

}
