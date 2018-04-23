package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Valid_Username_RegEx;

/**
 * Unit test for simple Challenges.
 */
public class Valid_Username_RegExTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Valid UserName RegExTests Start =======================");
  }

  @Test
  public void testValidate_User_Name() {
    Valid_Username_RegEx nameVal = new Valid_Username_RegEx();
    try {
      nameVal.checkUserNames( new String[] {"8", "Julia", "Samantha", "Samantha_21", "1Samantha", "Samantha?10_2A", "JuliaZ007", "Julia@007", "_Julia007"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testBad() {
    Valid_Username_RegEx nameVal = new Valid_Username_RegEx();
    try {
      nameVal.checkUserNames( new String[] {"0.016"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testLong() {
    Valid_Username_RegEx nameVal = new Valid_Username_RegEx();
    try {
      nameVal.checkUserNames( new String[] {"41","James","Mary","John","Patricia","Robert","Jennifer","Michael","Elizabeth","William","Linda8oo8","David","Barbara","Richard","Susan","Joseph","Jessica","Thomas","Margaret","Charles","Sarah","Christopher","Karen","Daniel","Nancy","Matthew","Betty","Anthony","Lisa","Donald","Dorothy","Mark","Sandra","Paul","Ashley","Steven","Kimberly","Andrew","Donna","Kenneth","Carol","Barnaby_Marmaduke_Aloysius_Benjy_Cobweb_Dartagnan_Egbert_Felix_Gaspar_Humbert_Ignatius_Jayden_Kasper_Leroy_Maximilian_Neddy_Obiajulu_Pepin_Quilliam_Rosencrantz_Sexton_Teddy_Upwood_Vivatma_Wayland_Xylon_Yardley_Zachary_Usansky"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestLong: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    Valid_Username_RegEx nameVal = new Valid_Username_RegEx();
    try {
      nameVal.checkUserNames( new String[] {"-211"} );
    } catch (NullPointerException e) {
      System.out.println( "\ntestNegative: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Valid_Username_RegEx nameVal = new Valid_Username_RegEx();
    try {
      nameVal.checkUserNames( null );
    } catch (NullPointerException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Valid UserName RegExTests Completed =======================");
  }

}
