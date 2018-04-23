package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Checking_Prime;

/**
 * Unit test for simple Challenges.
 */
public class Checking_PrimeTest
{
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Checking Prime Tests Start =======================");
  }

  @Test
  public void testChecking_Prime() {
    Checking_Prime cp = new Checking_Prime();
    String[] numbers = {"89", "19", "787", "11", "2", "31"};
    try {
      cp.checkPrime( numbers );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestChecking_Prime: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Checking_Prime cp = new Checking_Prime();
    String[] numbers = null;
    try {
      cp.checkPrime( numbers );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testLong() {
    Checking_Prime cp = new Checking_Prime();
    String[] numbers = {"31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679821480865132823066470938446095505822317253594081284811174502841027019385211055596446229489549303819644288109756659334461284756482337867831652712019091456485669234603486104543266482133936072602491412737245870066063155881748815209209628292540917153643678925903600113305305488204665213841469519415116094330572703657595919530921861173819326117931051185480744623799627495673518857527248912279381830119491298336733624406566430860213949463952247371907021798609437027705392171762931767523846748184676694051320005681271452635608277857713427577896091736371787214684409012249534301465495853710507922796892589235420199561121290219608640344181598136297747713099605187072113499999983729780499510597317328160963185950244594553469083026425223082533446850352619311881710100031378387528865875332083814206171776691473035982534904287554687311595628638823537875937519577818577805321712268066130019278766111959092164201989"};
    try {
      cp.checkPrime( numbers );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestLong: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void test1stThousand() {
    Checking_Prime cp = new Checking_Prime();
    String[] numbers = {"15485557","4908","15485567","16","15485581","746561","746509"};
    try {
      cp.checkPrime( numbers );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntest1stThousand: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Checking Prime Tests Completed =======================");
  }

}
