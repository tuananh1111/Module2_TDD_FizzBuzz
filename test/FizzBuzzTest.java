import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void testFindDivisible(){
        int number= 3;
        String expected= "Fizz";
        String result= FizzBuzz.findDivisible(number);
        assertEquals(result,expected);
    }
    @Test
    void testFindDivisible1(){
        int number= 5;
        String expected= "Buzz";
        String result= FizzBuzz.findDivisible(number);
        assertEquals(result,expected);
    }
    @Test
    void testFindDivisible2(){
        int number= 15;
        String expected= "FizzBuzz";
        String result= FizzBuzz.findDivisible(number);
        assertEquals(result,expected);
    }
    @Test
    void testFindDivisible3(){
        int number= 16;
        String expected= "null";
        String result= FizzBuzz.findDivisible(number);
        assertEquals(result,expected);
    }

}