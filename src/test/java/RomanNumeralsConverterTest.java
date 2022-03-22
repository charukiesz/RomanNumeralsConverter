import com.techreturners.romannumeralsconverter.RomanNumeralsConverter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class RomanNumeralsConverterTest {

    @Test
   public void checkRomanNumeralI(){
         String input = "I";
         Integer expectedResult = 1;
         Integer actualResult = RomanNumeralsConverter.romanNumerals.get(input);

         Assertions.assertEquals(expectedResult, actualResult);
    }


}
