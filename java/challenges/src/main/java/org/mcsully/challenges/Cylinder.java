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
 * + ch = 4 represents the volume of a cylinder that has to be calculated 
 *   where r,h represent the radius and height of the cylinder respectively.
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
 * + When ch=4, Next two lines contain r, h representing the radius and height of
 *   the cylinder respectively.  r, h will be in two separate lines.
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
 */
public class Cylinder extends Shape
{
  private double r = 0.000;   // radius
  private double h = 0.000;   // height
  private double vol = 0.000; // calculated

  // r, h representing the radius and height of the cylinder respectively.
  public void Cylinder() {
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

  // Volume of a cylinder: V = pi * r^2 * h
  public void calcVolume() {
    this.vol = (Math.PI * Math.pow(r, 2)) * h;
  }

  @Override
  public String getType() {
    return "cylinder";
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
    System.out.println("RESULT: " + getType() + " dimensions: radius " + this.r + " * height " + this.h );
    System.out.println("RESULT: " + getType() + " volume " + getVolume() + " = [" + df.format(this.vol) + "]");
  }

}

