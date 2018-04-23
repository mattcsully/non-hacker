package org.mcsully.challenges;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Area_of_Parallelogram;

/**
 * Unit test for simple Challenges.
 */
public class Area_of_ParallelogramTest 
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Area_of_Parallelogram Tests Start =======================");
  }

  @Test
  public void testArea_of_Parallelogram() {
    Area_of_Parallelogram aOp = new Area_of_Parallelogram();
    try {
      BigInteger area = aOp.calcArea( new String[] {"1","3"} );
      System.out.println( "testArea_of_Parallelogram result: " + area.toString());
    } catch (IllegalArgumentException e) {
      System.out.println( "testArea_of_Parallelogram: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testOne() {
    Area_of_Parallelogram aOp = new Area_of_Parallelogram();
    try {
      BigInteger area = aOp.calcArea( new String[] {"1"} );
      System.out.println( "testOne result: " + area.toString());
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }

  }

  @Test
  public void testNegative() {
    Area_of_Parallelogram aOp = new Area_of_Parallelogram();
    try {
      BigInteger area = aOp.calcArea( new String[] {"1","-211"} );
      System.out.println( "testNegative result: " + area.toString());
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNegative: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Area_of_Parallelogram aOp = new Area_of_Parallelogram();
    try {
      BigInteger area = aOp.calcArea( null );
      System.out.println( "testNull result: " + area.toString());
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Area_of_Parallelogram Tests Completed =======================");
  }

}
