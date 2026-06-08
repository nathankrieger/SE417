import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays; 

import java.util.LinkedList;
import java.util.Collection;


public class PrimeNumberFinderTest {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      List<Integer> list0 = PrimeNumberFinder.findPrimes(1676, 239);
      assertFalse(list0.contains(239));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(0);
      List<Integer> list0 = List.of(integer0, integer0, integer0, integer0);
      int int0 = PrimeNumberFinder.computeSumOfPrimes(list0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1402));
      linkedList0.add(integer0);
      int int0 = PrimeNumberFinder.computeSumOfPrimes(linkedList0);
      assertEquals((-1402), int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PrimeNumberFinder.findPrimes(0, 1907);
      // Undeclared exception!
      PrimeNumberFinder.findPrimes((-6940), 1907);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      assertThrows(NullPointerException.class, () -> {
        PrimeNumberFinder.computeSumOfPrimes(null);
        });
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      assertThrows(IndexOutOfBoundsException.class, () -> {
        PrimeNumberFinder.computeSumOfPrimes(linkedList0);
        });
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      List<Integer> list0 = List.copyOf((Collection<? extends Integer>) linkedList0);
      // Undeclared exception!
      assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
        PrimeNumberFinder.computeSumOfPrimes(list0);
        });
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(371);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(2045);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(5);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(2073);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(1676);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(7);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime((-32));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = PrimeNumberFinder.isPrime(29929);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      List<Integer> list0 = PrimeNumberFinder.findPrimes(239, 239);
      assertTrue(list0.contains(239));
      
      int int0 = PrimeNumberFinder.computeSumOfPrimes(list0);
      assertEquals(239, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      List<Integer> list0 = PrimeNumberFinder.findPrimes(0, 2059);
      int int0 = PrimeNumberFinder.computeSumOfPrimes(list0);
      assertEquals(310, list0.size());
      assertEquals(291229, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PrimeNumberFinder primeNumberFinder0 = new PrimeNumberFinder();
  }
}
