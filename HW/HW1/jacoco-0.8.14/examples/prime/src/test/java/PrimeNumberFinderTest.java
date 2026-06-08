import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays; 

/*sample tests for homework. you will need to add to these */

public class PrimeNumberFinderTest{

    //Instantiate class - this will cover the constructor of the class
    @Test
    public void instantiateClass(){
      PrimeNumberFinder myPrime=new PrimeNumberFinder();
    }

    
    //Tests for the findPrimes method (you can add to these)
    @Test
    public void testFindPrimes1() {
       List<Integer> primes = PrimeNumberFinder.findPrimes(6,14);
       List<Integer> expected = Arrays.asList(7,11,13);
       assertArrayEquals(expected.toArray(),primes.toArray());
    }

    //test for isPrime
   @Test
    public void testIsPrime1() {
        assertTrue(PrimeNumberFinder.isPrime(23));
    }

    //test for a non-prime number
    @Test
    public void testIsPrime2() {
        assertFalse(PrimeNumberFinder.isPrime(10));
    }

    //test for a negative number to enter the first if condition
    // line 67, 68 in jacoco report.
    @Test
    public void testIsPrime3() {
        assertFalse(PrimeNumberFinder.isPrime(-1));
    }

    // The next 3 tests are to check the 2nd if condition in isPrime expilicitly.
    // Test 4 and 5 also test the logic for the first 2 conditions of the 3rd if statement.
    // line 71, 75, 76 in jacoco report.
    @Test
    public void testIsPrime4() {
        assertTrue(PrimeNumberFinder.isPrime(2));
    }

    // line 71, 75, 76 in jacoco report.
    @Test
    public void testIsPrime5() {
        assertTrue(PrimeNumberFinder.isPrime(3));
    }

    // line 71, 72 in jacoco report.
    @Test
    public void testIsPrime6() {
        assertTrue(PrimeNumberFinder.isPrime(7));
    }

    // This test is to test the 3rd condition in the 3rd if statement. 
    // However, this will never reach because if a number is divisible by 6, it is also divisible by 2 and 3.
    // line 75, 76 in jacoco report.
    @Test
    public void testIsPrime7() {
        assertFalse(PrimeNumberFinder.isPrime(6));
    }

    // This test is to hit the 4th if condition
    // line 79, 80 in jacoco report.
    @Test
    public void testIsPrime10() {
        assertFalse(PrimeNumberFinder.isPrime(25));
    }

    // This test is to hit the 4th if condition
    // line 79 in jacoco report.
    @Test
    public void testIsPrime11() {
        assertTrue(PrimeNumberFinder.isPrime(5));
    }

    // Tests to check the for-loop logic in isPrime
    // line 83-87 in jacoco report.
    @Test
    public void testIsPrime8() {
        assertFalse(PrimeNumberFinder.isPrime(26));
    }
    // line 83-87 in jacoco report.
    @Test
    public void testIsPrime9() {
        assertFalse(PrimeNumberFinder.isPrime(49));
    }

    // line 83-87 in jacoco report.
    // Hits the "num % i == 0" branch
    @Test
    public void testIsPrime_LoopCondition1() {
        assertFalse(PrimeNumberFinder.isPrime(121)); 
    }

    // line 83-87 in jacoco report.
    // Hits the "num % (i + 2) == 0" branch
    @Test
    public void testIsPrime_LoopCondition2() {
        assertFalse(PrimeNumberFinder.isPrime(91)); 
    }

    // line 89 in jacoco report.
    // Hits the "return true" AFTER the loop finishes
    @Test
    public void testIsPrime_PassesLoop() {
        assertTrue(PrimeNumberFinder.isPrime(17));
    }

    //tests for the sumofP method - note the list provided is the list of primes
    // to be summed - not the lower and upper bound

    @Test
    public void sumofP1() {
	List<Integer> input = Arrays.asList(5,7);
	assertEquals(12,PrimeNumberFinder.computeSumOfPrimes(input));
    }

    // tests for sumofP with an empty list to evaluate line 52 if statement to false and hit line 58
    @Test
    public void sumofP2() {
	List<Integer> input = Arrays.asList(1);
	assertEquals(1,PrimeNumberFinder.computeSumOfPrimes(input));
    }



    // Faults and exceptions
    @Test
    public void testIsPrime_fault1() {
        assertFalse(PrimeNumberFinder.isPrime(1));
    }

    @Test
    public void testFindPrimes_fault2() {
        assertArrayEquals(new Integer[]{2,3,5,7}, PrimeNumberFinder.findPrimes(1,7).toArray());
    }

    @Test
    public void testComputeSum_Exception() {
        assertEquals(0, PrimeNumberFinder.computeSumOfPrimes(new ArrayList<Integer>()));
    }

}
