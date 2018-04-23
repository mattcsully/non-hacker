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
 * Simple Hemisphere challenge
 * + ch = 3 represents the volume of a hemisphere that has to be calculated 
 *   where r represents the radius of a hemisphere.
 * When ch=3, Next line contains r, the radius of the hemisphere
 *
 * In case any of the values are <=0, print "java.lang.NumberFormatException:
 * All the values must be positive" without quotes and terminate the program.
 *
 * Note: Use Math.PI or 3.14159265 as the value of pi.
 * Volume of a hemisphere: V = (2/3)pr3
 *
 * Input Format
 *
 * First line contains T, the number of test cases.
 * Each test case contains ch, representing the choice as given in the problem
 * statement.
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
 */
public class Hemisphere extends Shape
{
  private double r = 0.000;   // radius
  private double vol = 0.000; // calculated

  public void Hemisphere() {
  }

  public void setR( double radius ) {
    // -100 <= a,l,b,h,r <= 100
    if ( radius < -100 ) {
      throw new IllegalArgumentException("ERROR: " + radius + " is too small for [" + getType() +"]");
    }
    if ( radius > 100 ) {
      throw new IllegalArgumentException("ERROR: " + radius + " is too large for [" + getType() +"]");
    }
    this.r = radius;
  }

  // Volume of a hemisphere: V = (2/3)pi * r^3
  public void calcVolume() {
    this.vol = (0.6666666666666667 * Math.PI) * Math.pow(r, 3);
  }

  @Override
  public String getType() {
    return "hemisphere";
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
    System.out.println("RESULT: " + getType() + " dimensions: (2/3)pi * " + r + "^3");
    System.out.println("RESULT: " + getType() + " volume " + getVolume() + " = [" + df.format(this.vol) + "]");
  }

}

