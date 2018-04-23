package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Private_Access;

/**
 * Unit test for simple Challenges.
 */
public class Private_AccessTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Private Access Tests Starting =======================");
  }

  @Test
  public void testPrint_Int_Array() {
    Private_Access prvAcs = new Private_Access();
    try {
      prvAcs.access( new String[] {"2147483647"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testBad() {
    Private_Access prvAcs = new Private_Access();
    try {
      prvAcs.access( new String[] {"0.016"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testLong() {
    Private_Access prvAcs = new Private_Access();
    try {
      prvAcs.access( new String[] {"9223372036854775807"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestLong: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    Private_Access prvAcs = new Private_Access();
    try {
      prvAcs.access( new String[] {"-211"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNegative: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Private_Access prvAcs = new Private_Access();
    try {
      prvAcs.access( null );
    } catch (NullPointerException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Private Access Tests Completed =======================");
  }

}
