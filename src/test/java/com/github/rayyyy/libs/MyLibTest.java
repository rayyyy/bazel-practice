package test.java.com.github.rayyyy.libs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.java.com.github.rayyyy.libs.MyLib;

public class MyLibTest {
  @Test
  public void testFibonacci() {
    assertEquals(144, MyLib.fibonacci(12));
  }
}
