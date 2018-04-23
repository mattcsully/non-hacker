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
 * + ch = 2 represents the volume of a cuboid that has to be calculated 
 *   where l,b,h represent the dimensions of a cuboid.
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
 * + When ch=2, Next three lines contain l, b, h representing length, breadth
 *   and height of the cuboid respectively.  l, b, h will be in 3 separate lines
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
 */
public class Cuboid extends Shape
{
  private double l = 0.000;   // length
  private double b = 0.000;   // breadth
  private double h = 0.000;   // height
  private double vol = 0.000; // calculated

  // When ch=2, Next three lines contain l, b, h: length, breadth and height of the cuboid.
  public void Cuboid() {
  }

  public void setL( double length ) {
    // -100 <= a,l,b,h,r <= 100
    if ( length < -100 ) {
      throw new IllegalArgumentException("ERROR: " + length + " is too small for [" + getType() +"]");
    }
    if ( length > 100 ) {
      throw new IllegalArgumentException("ERROR: " + length + " is too large for [" + getType() +"]");
    }
    this.l = length;
  }

  public void setB( double breadth ) {
    // -100 <= a,l,b,h,r <= 100
    if ( breadth < -100 ) {
      throw new IllegalArgumentException("ERROR: " + breadth + " is too small for [" + getType() +"]");
    }
    if ( breadth > 100 ) {
      throw new IllegalArgumentException("ERROR: " + breadth + " is too large for [" + getType() +"]");
    }
    this.b = breadth;
  }

  public void setH( double height ) {
    // -100 <= a,l,b,h,r <= 100
    if ( height < -100 ) {
      throw new IllegalArgumentException("ERROR: " + height + " is too small for [" + getType() +"]");
    }
    if ( height > 100 ) {
      throw new IllegalArgumentException("ERROR: " + height + " is too large for [" + getType() +"]");
    }
    this.h = height;
  }

  public void calcVolume() {
    this.vol = this.l * this.b * this.h;
  }

  @Override
  public String getType() {
    return "cuboid";
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
    System.out.println("RESULT: " + getType() + " dimensions: length " + this.l + " * breadth " + this.b + " * height " + this.h );
    System.out.println("RESULT: " + getType() + " volume " + getVolume() + " = [" + df.format(this.vol) + "]");
  }

}

