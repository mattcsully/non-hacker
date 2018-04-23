package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Pattern_Syntax_Checker;

/**
 * Unit test for simple Challenges.
 */
public class Pattern_Syntax_CheckerTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Pattern Syntax Check Tests Starting =======================");
  }

  /*
   * Sample Input
   *  3
   *  ([A-Z])(.+)
   *  [AZ[a-z](a-z)
   *  batcatpat(nat
   */

  @Test
  public void testPattern_Syntax_Checker() {
    Pattern_Syntax_Checker patChk = new Pattern_Syntax_Checker();
    try {
      patChk.matchSearch( new String[] {"3", "([A-Z])(.+)", "[AZ[a-z](a-z)", "batcatpat(nat"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestPattern_Syntax_Checker: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testOne() {
    Pattern_Syntax_Checker patChk = new Pattern_Syntax_Checker();
    try {
      patChk.matchSearch( new String[] {"1","[abc]"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testTen() {
    Pattern_Syntax_Checker patChk = new Pattern_Syntax_Checker();
    try {
      patChk.matchSearch( new String[] {"6", "[^abc]", "[a-zA-Z]", "[a-d[m-p]]", "[a-z&&[def]]", "[a-z&&[^bc]]", "[a-z&&[^m-p]]"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestTen: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testOneBat() {
    Pattern_Syntax_Checker patChk = new Pattern_Syntax_Checker();
    try {
      patChk.matchSearch( new String[] {"1", "batcatpat(nat" } );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOneBat: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    Pattern_Syntax_Checker patChk = new Pattern_Syntax_Checker();
    try {
      patChk.matchSearch( new String[] {"1", "-211"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNegative: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Pattern_Syntax_Checker patChk = new Pattern_Syntax_Checker();
    try {
      patChk.matchSearch( null );
    } catch (NullPointerException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Pattern Syntax Check Tests Completed =======================");
  }



}
