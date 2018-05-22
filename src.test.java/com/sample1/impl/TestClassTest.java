/**
 * Copyright CodeJava.net To Present All rights reserved.
 */
package com.sample1.impl;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClassTest {
  TestClass test1 = new TestClass();

  @Test
  public void testsum() {

    int a = 7;
    int b = 9;
    int c = test1.sum(a, b);
    assertEquals(c, 16);
  }
}
