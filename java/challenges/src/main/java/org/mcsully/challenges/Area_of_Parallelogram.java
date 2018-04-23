package org.mcsully.challenges;

import java.math.*;

/**
 *
 * Code the calculation and output of the area of a parallelogram with breadth B
 * and height H. You should read the variables from standard input.
 * If B <= 0 or H <= 0, the output should be
 *  "java.lang.Exception: Breadth and height must be positive" 
 * without quotes.
 *
 * Input Format
 * Two lines of input. First line contains B: breadth of parallelogram.
 * Next line contains H: height of parallelogram.
 *
 * Constraints (WHICH CONFLICT WITH OTHER CONSTRAINTS)
 * -100 <= B <= 100
 * -100 <= H <= 100
 *
 * Output Format
 * If both values are greater than zero, then the main method must output the
 * area of the parallelogram; else, print "java.lang.Exception: Breadth and
 * height must be positive" without quotes.
 *
 * Sample input 1
 *  1
 *  3
 *
 * Sample output 1
 *  3
 *
 * Sample input 2
 *  -1
 *  2
 *
 * Sample output 2
 *
 *  java.lang.Exception: Breadth and height must be positive
 *
 */
public class Area_of_Parallelogram 
{
  BigInteger biZero = new BigInteger("0"); 
  BigInteger biHundred = new BigInteger("100"); 
  String error = "java.lang.Exception: Breadth and height must be positive";

  public BigInteger calcArea( String[] args )
    throws IllegalArgumentException
  {
    if (args == null) {
      throw new IllegalArgumentException("ERROR: Array is null.");
    }

    if ( args.length < 2) {
      throw new IllegalArgumentException("ERROR: Array only contains [" + args.length + "] elements.");
    }

    BigInteger B = new BigInteger( args[0] );
    System.out.println( "Breadth, arg 0: " + B.toString() );
    if ( B.compareTo(biZero) < -1 ) {
      throw new IllegalArgumentException("java.lang.Exception: Breadth is NEGATIVE");
    }
    if ( B.compareTo(biHundred) > 0 ) {
      throw new IllegalArgumentException("java.lang.Exception: Breadth > 100");
    }

    BigInteger H = new BigInteger( args[1] );
    System.out.println( "Height, arg 1: " + H.toString() );
    if ( H.compareTo(biZero) == -1 ) {
      throw new IllegalArgumentException("java.lang.Exception: Height < 0");
    }
    if ( H.compareTo(biHundred) > 0 ) {
      throw new IllegalArgumentException("java.lang.Exception: Height > 100");
    }

    BigInteger area = B.multiply( H );

    System.out.println( "Area of Parallelogram: " + B.toString() + " x " + H.toString() + " = " + area.toString() );
    return area;
  }
}
