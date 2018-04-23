package org.mcsully.challenges;

import java.text.*;
import java.math.*;
import java.util.*;
import java.util.regex.*;

/**
 * Given an integer as input, can you check the following:
 * If is odd then print "Weird"
 * If is even and, in between range 2 and 5(inclusive), print "Not Weird"
 * If is even and, in between range 6 and 20(inclusive), print "Weird"
 * If is even print "Not Weird"
 *
 * Input Format
 *
 * Single line of input: integer N.
 *
 * Constraints
 * 1 <= N <= 100
 *
 * Output Format
 *
 * Print "Weird" if the number is weird; else, not "Not Weird" without the quotes.
 *
 * Sample Input 1
 * 3
 *
 * Sample Output 1
 * Weird
 *
 * Sample Input 2
 * 24
 *
 * Sample Output 2
 * Not Weird
 *
 */
public class Weird_Numbers  
{
  public void Weird_Numbers() {
  }

  public void check( int i ) {

    // Constraints
    // 1 <= i <= 100
    if ( i < 1 ) {
      throw new IllegalArgumentException("ERROR: " + i + " is too small.");
    }
    if ( i > 100 ) {
      throw new IllegalArgumentException("ERROR: " + i + " is too large.");
    }

    // If is odd then print "Weird"
    if (i %2 != 0) {
      // odd print "Weird"
      System.out.println(i + " is Weird");
    } else {
      // even
      if (i > 2 && i < 6) {
        // If is even and, in between range 2 and 5(inclusive), print "Not Weird"
        System.out.println(i + " is Not Weird");
      } else if (i > 5 && i < 21) {
        // If is even and, in between range 6 and 20(inclusive), print "Weird"
        System.out.println(i + " is Weird");
      } else {
        // If is even print "Not Weird"
        System.out.println(i + " is Not Weird");
      }
    }

  }

}
