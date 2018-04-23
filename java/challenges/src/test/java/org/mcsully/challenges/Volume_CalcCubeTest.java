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
public class Volume_CalcCubeTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  /*
   * Sample Input
   *   2
   *   1
   *   4
   *   4
   *   67.89
   *   -98.54
   */
  /*
   * Sample Input 2
   *   1
   *   3
   *   1.02
   */

  String choice = "1";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Volume Calculation Cube Tests Starting =======================");
  }

  @Test
  public void testVolume_Calc() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {"1", "3"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestVolume_Calc: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testOne() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {"1"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }


  @Test
  public void testBig() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {"1", "99"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestBig: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {"1","-11"} );
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
    System.out.println("======================= Volume Calculation Cube Tests Completed =======================");
  }

}
