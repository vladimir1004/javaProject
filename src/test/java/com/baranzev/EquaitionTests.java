package com.baranzev;


import org.testng.Assert;
import org.testng.annotations.Test;

public class EquaitionTests {

  @Test
  public void test0() {
    Equaition e = new Equaition(1, 1, 1);
    Assert.assertEquals(e.rootNumber(), 0);

  }

  @Test
  public void test1() {
    Equaition e = new Equaition(1, 2, 1);
    Assert.assertEquals(e.rootNumber(), 1);

  }

  @Test
  public void test2() {
    Equaition e = new Equaition(1, 5, 6);
    Assert.assertEquals(e.rootNumber(), 2);
  }
}
