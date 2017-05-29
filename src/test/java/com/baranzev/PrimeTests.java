package com.baranzev;


import org.testng.Assert;
import org.testng.annotations.Test;

public class PrimeTests {


  @Test
  public void testPrimes() {
    Assert.assertTrue(Primes.isPrime(Integer.MAX_VALUE));
  }

  @Test
  public void testNotPrimes() {
    Assert.assertFalse(Primes.isPrime(Integer.MAX_VALUE - 2));
  }
//test отключается таким образом
  @Test (enabled = false)
  public void testPrimesLong() {
    long n = Integer.MAX_VALUE;
    Assert.assertTrue(Primes.isPrime(n));
  }
}
