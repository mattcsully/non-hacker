package org.mcsully.challenges;

import java.io.*;
import java.lang.reflect.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

import org.mcsully.challenges.Shape;

/**
 * You are given a class Solution and its main method in the editor.
 * In each test cases, it takes an input which represents a choice of the
 * following:
 * + ch = 1 represents the volume of a cube that has to be calculated where 
 *   represents the length of the sides of the cube.
 *
 * Your task is to create the class Calculate and the required methods so that
 * the code prints the volume of the figures rounded to exactly decimal places.
 *
 * In case any of the values are <=0, print "java.lang.NumberFormatException:
 * All the values must be positive" without quotes and terminate the program.
 *
 * Note: Use Math.PI or 3.14159265 as the value of pi.
 *
 * Input Format
 *
 * First line contains T, the number of test cases.
 * Each test case contains ch, representing the choice as given in the problem
 * statement.
 * + When ch=1, Next line contains a, length of the sides of the cube.
 *
 * Note: You have to determine the data type of each parameter by looking at the
 *       code given in the main method.
 *
 * Constraints
 * 1 <= ch <= 4
 * -100 <= a,l,b,h,r <= 100
 * There will be at most 3 digits after decimal point in input.
 *
 * Output Format
 *
 * For each test case, print the answer rounded up to exactly 3 decimal places in a single line.
 * For example, 1.2345 should be rounded to 1.235, 3.12995 should be rounded to 3.130.
 *
 * Sample Input 1
 *   2
 *   1
 *   4
 *   4
 *   67.89
 *   -98.54
 *
 * Sample Output 1
 *   64.000
 *   java.lang.NumberFormatException: All the values must be positive
 *
 * Explanation
 *
 * There are two test cases. In the first test case ch = 1, means you have to
 * calculate the volume of a cube. The next line contains the a=4, means the
 * side of the cube is 4. So the volume of the cube is 64.000.
 * In the second test case, you have to calculate volume of a cylinder.
 * But the height of the cylinder is negative, so an exception is thrown.
 *
 * Sample Input 2
 *   1
 *   3
 *   1.02
 *
 * Sample Output 2
 *   2.223
 */
public class Cube extends Shape
{
  private double a = 0.000;   // length of a cubes sides.
  private double vol = 0.000;   // length of a cubes sides.

  // When ch=1, Next line contains a, length of the sides of the cube.
  //public void Cube();

  // When ch=1, Next line contains a, length of the sides of the cube.
  public void Cube( double a ) {
    setA( a );
    vol = a * a * a;
  }

  public void setA( double side ) {
    // -100 <= a,l,b,h,r <= 100
    if ( side < -100 ) {
      throw new IllegalArgumentException("ERROR: " + side + " is too small for [" + getType() +"]");
    }
    if ( side > 100 ) {
      throw new IllegalArgumentException("ERROR: " + side + " is too large for [" + getType() +"]");
    }
    this.a = side;
    this.vol = a * a * a;
  }


  @Override
  public String getType() {
    return "cube";
  }

  public void calcVolume() {
    this.vol = this.a * this.a * this.a;
  }

  @Override
  public double getVolume() {
    calcVolume();
    return this.vol;
  }

  @Override
  public void getDimensions() {
    // There will be at most 3 digits after decimal point in input.
    DecimalFormat df = new DecimalFormat("###.000");
    System.out.println("RESULT: " + getType() + " dimensions " + this.a + " * " + this.a + " * " + this.a );
    System.out.println("RESULT: " + getType() + " volume "+vol+" = [" + df.format(this.vol) + "]");
  }

}

