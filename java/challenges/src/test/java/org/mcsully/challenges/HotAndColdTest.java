package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.HotAndCold;

public class HotAndColdTest 
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Hot and Cold Tests Starting =======================");
  }

   /**
    * Sample N Test
    */
   @Test
   public void testSample1() {
      HotAndCold temps1 = new HotAndCold();
      temps1.run(new String [] {"50", "40", "70", "80"} );
   }
   
   @Test
   public void testSample2() {
      HotAndCold temps2 = new HotAndCold();
      temps2.run(new String [] {"55", "66", "66", "77"} );
   }

   @Test
   public void testSample3() {
      HotAndCold temps3 = new HotAndCold();
      temps3.run(new String [] {"80", "80", "40", "40" } );
   }

  @Test
  public void testNull() {
    HotAndCold temps0 = new HotAndCold();
    try {
      temps0.run( null );
    } catch (NullPointerException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    HotAndCold temps_ = new HotAndCold();
    try {
      temps_.run(new String [] {"-1", "-9", "-40", "-3" } );
    } catch (IllegalArgumentException e) {
      System.out.println( "testNegative: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Hot and Cold Tests Completed =======================");
  }

}
