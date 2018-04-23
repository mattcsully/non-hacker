package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Volume_Calc;

/**
 * Unit test for simple Challenges.
 */
public class Volume_CalcCylinderTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  String choice = "4";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Volume Calculation Cylinder Tests Starting =======================");
  }

  @Test
  public void testVolume_Calc() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {choice, "3.14159265359", "99.9999"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestVolume_Calc: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testOne() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {choice, "3", "3.14159265359"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testBig() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {"6", "[^abc]", "[a-zA-Z]", "[a-d[m-p]]", "[a-z&&[def]]", "[a-z&&[^bc]]", "[a-z&&[^m-p]]"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestBig: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {choice, "-11", "-99"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNegative: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( null );
    } catch (NullPointerException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Volume Calculation Cylinder Tests Completed =======================");
  }

}
