package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Volume_Calc;

/**
 * Unit test for simple Hemisphere challenge
 * + ch = 3 represents the volume of a hemisphere that has to be calculated 
 *   where r represents the radius of a hemisphere.
 * When ch=3, Next line contains r, the radius of the hemisphere
 */
public class Volume_CalcHemisphereTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  String choice = "3";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Volume Calculation Hemishpere Tests Starting =======================");
  }

  @Test
  public void testVolume_Calc() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {choice, "3.14"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestVolume_Calc: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testOne() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {choice, "99.99"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testBig() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {choice, "99999999999"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestBig: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    Volume_Calc volCalc = new Volume_Calc();
    try {
      volCalc.calcVolume( new String[] {choice, "-211"} );
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
    System.out.println("======================= Volume Calculation Hemishpere Tests Completed =======================");
  }

}
