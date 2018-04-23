package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Weird_Numbers;

/**
 * Unit test for simple Challenges.
 */
public class Weird_NumbersTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Weird Numbers Tests Starting =======================");
  }

  @Test
  public void testWeird_Numbers() {
    Weird_Numbers wNum = new Weird_Numbers();
    try {
      wNum.check( 3 );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestWeird_Numbers: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testOne() {
    Weird_Numbers wNum = new Weird_Numbers();
    try {
      wNum.check( 1 );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testBig() {
    Weird_Numbers wNum = new Weird_Numbers();
    try {
      wNum.check( 99 );
      wNum.check( 98 );
      wNum.check( 91 );
      wNum.check( 22 );
      wNum.check( 75 );
      wNum.check( 65 );
      wNum.check( 62 );
      wNum.check( 53 );
      wNum.check( 52 );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestBig: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testTooBig() {
    Weird_Numbers wNum = new Weird_Numbers();
    try {
      wNum.check( 101 );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestTooBig: " + logFail + ": " + e.toString());
    }
  }


  @Test
  public void testNegative() {
    Weird_Numbers wNum = new Weird_Numbers();
    try {
      wNum.check( -1 );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNegative: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Weird_Numbers wNum = new Weird_Numbers();
    try {
      wNum.check( 0 );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Weird Numbers Tests Completed =======================");
  }

}
