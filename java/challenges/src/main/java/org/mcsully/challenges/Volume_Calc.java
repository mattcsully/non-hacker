package org.mcsully.challenges;

import java.math.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Locale;
import java.util.regex.*;
import java.util.stream.*;

import org.mcsully.challenges.Cube;
import org.mcsully.challenges.Cuboid;
import org.mcsully.challenges.Hemisphere;

/**
 * You are given a class Solution and its main method in the editor.
 * In each test cases, it takes an input which represents a choice of the
 * following:
 * + ch = 1 represents the volume of a cube that has to be calculated where 
 *   represents the length of the sides of the cube.
 * + ch = 2 represents the volume of a cuboid that has to be calculated 
 *   where l,b,h represent the dimensions of a cuboid.
 * + ch = 3 represents the volume of a hemisphere that has to be calculated 
 *   where r represents the radius of a hemisphere.
 * + ch = 4 represents the volume of a cylinder that has to be calculated 
 *   where r,h represent the radius and height of the cylinder respectively.
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
 * + When ch=2, Next three lines contain l, b, h representing length, breadth
 *   and height of the cuboid respectively.  l, b, h will be in 3 separate lines
 * + When ch=3, Next line contains r, the radius of the hemisphere
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
public class Volume_Calc
{

  private LocalDateTime finish;
  private LocalDateTime start; 

  public void calcVolume( String[] args )
  {
    start = null;
    finish = null;
    start = LocalDateTime.of(LocalDate.now(), LocalTime.now());

    if (args == null) {
      throw new NullPointerException("ERROR: Input array is null.");
    }

    // Determine the choice of Volume required
    int choice = Integer.parseInt(args[0]);
    // Constraint: 1 <= ch <= 4
    if ( choice < 1 ) {
      throw new IllegalArgumentException("ERROR: Too small, Invalid choice [" + choice +"]");
    }
    if ( choice > 4 ) {
      throw new IllegalArgumentException("ERROR: Too large, Invalid choice [" + choice +"]");
    }

    Calculator calc=new Calculator(choice);
    System.out.print("\nChoice ["+ choice +"] for");

    // Check the correct number of args for each chosen shape.
    int argCount = args.length; 
    System.out.print(" "+ (argCount-1) +" params");
    double[] params = new double[argCount];
    for (int i=1; i<argCount; i++) {
      System.out.print(", arg["+ i +"] = " + args[i]);
      double param = Double.parseDouble(args[i]);
      if ( param < 1 ) {
        throw new NumberFormatException("ERROR: Param " + i + " is <=0 [" + param + "]");
      }
      params[i] = param;
    }

    if (choice == 1) {
      System.out.println("\n Calculate Cube.");
      // When ch=1, Next line contains a, length of the sides of the cube.
      if ( (argCount-1) != 1 ) {
        throw new IllegalArgumentException("ERROR: There must be 1 value, not [" + argCount + "]");
      }
      Cube cube = new Cube();
      cube.setA( params[0] );
      cube.calcVolume();
      cube.getDimensions();

    } else if (choice == 2) {
      // When ch=2, Next three lines contain l, b, h: length, breadth and height of the cuboid.
      if ( (argCount-1) != 3 ) {
        throw new IllegalArgumentException("ERROR: There must be 3 values, not [" + argCount + "]");
      }
      System.out.println("\n Calculate Cuboid.");
      //Cuboid cuboid = new Cuboid(params[0], params[1], params[2] );
      Cuboid cuboid = new Cuboid();
      cuboid.setL( params[1] );
      cuboid.setB( params[2] );
      cuboid.setH( params[3] );
      cuboid.calcVolume();
      cuboid.getDimensions();

    } else if (choice == 3) {
      System.out.println("\n Calculate Hemisphere.");
      // When ch=3, Next line contains r, the radius of the hemisphere
      if ( (argCount-1) != 1 ) {
        throw new IllegalArgumentException("ERROR: There must be 1 values, not [" + argCount + "]");
      }
      Hemisphere hemi = new Hemisphere();
      hemi.setR( params[1] );
      hemi.calcVolume();
      hemi.getDimensions();

    } else if (choice == 4) {
      System.out.println("\n Calculate Cylinder.");
      // When ch=4, Next two lines contain r, h: the radius and height of the cylinder.
      if ( (argCount-1) != 2 ) {
        throw new IllegalArgumentException("ERROR: There must be 2 values, not [" + argCount + "]");
      }
      Cylinder cyli = new Cylinder();
      cyli.setR( params[1] );
      cyli.setH( params[2] );
      cyli.calcVolume();
      cyli.getDimensions();
    }

    //calc.displayVolume();

    finish = LocalDateTime.of(LocalDate.now(), LocalTime.now());
    Duration duration = Duration.between(start, finish);

    NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
    String numberAsString = numberFormat.format(duration.getNano());

    System.out.println("--------------------------");
    System.out.println("Finish  = "+finish);
    System.out.println("Start   = "+start);
    System.out.println("Duration  " + numberAsString + " nano seconds.\n--------------------------");
  }
}

class Calculator 
{
  private int ch = 0;
  private double a = 0.000;   // length of a cubes sides.
  private double l = 0.000;   // length
  private double b = 0.000;   // breadth
  private double h = 0.000;   // height
  private double r = 0.000;   // radius
  private double vol = 0.000; // calculated

  public Calculator() {
  }

  public Calculator(int choice) {
    setChoice( choice );
  }

  public void setChoice(int choice) {
    this.ch = choice;
  }

  public int getChoice() {
    return ch;
  }

  public double getVolume() {
    return vol;
  }

  public void setA( double side ) {
    // -100 <= a,l,b,h,r <= 100
    if ( side < -100 ) {
      throw new IllegalArgumentException("ERROR: " + side + " is too small for [" + this.ch +"]");
    }
    if ( side > 100 ) {
      throw new IllegalArgumentException("ERROR: " + side + " is too large for [" + this.ch +"]");
    }
    this.a = side;
  }

  public void setL( double length ) {
    // -100 <= a,l,b,h,r <= 100
    if ( length < -100 ) {
      throw new IllegalArgumentException("ERROR: " + length + " is too small for [" + this.ch +"]");
    }
    if ( length > 100 ) {
      throw new IllegalArgumentException("ERROR: " + length + " is too large for [" + this.ch +"]");
    }
    this.l = length;
  }

  public void setB( double breadth ) {
    // -100 <= a,l,b,h,r <= 100
    if ( breadth < -100 ) {
      throw new IllegalArgumentException("ERROR: " + breadth + " is too small for [" + this.ch +"]");
    }
    if ( breadth > 100 ) {
      throw new IllegalArgumentException("ERROR: " + breadth + " is too large for [" + this.ch +"]");
    }
    this.b = breadth;
  }

  public void setH( double height ) {
    // -100 <= a,l,b,h,r <= 100
    if ( height < -100 ) {
      throw new IllegalArgumentException("ERROR: " + height + " is too small for [" + this.ch +"]");
    }
    if ( height > 100 ) {
      throw new IllegalArgumentException("ERROR: " + height + " is too large for [" + this.ch +"]");
    }
    this.h = height;
  }

  public void setR( double radius ) {
    // -100 <= a,l,b,h,r <= 100
    if ( radius < -100 ) {
      throw new IllegalArgumentException("ERROR: " + radius + " is too small for [" + this.ch +"]");
    }
    if ( radius > 100 ) {
      throw new IllegalArgumentException("ERROR: " + radius + " is too large for [" + this.ch +"]");
    }
    this.r = radius;
  }

  // https://github.com/charles-wangkai/hackerrank/blob/master/calculating-volume/Solution.java
  public void displayVolume() {

    // There will be at most 3 digits after decimal point in input.
    DecimalFormat df = new DecimalFormat("###.000");
    System.out.println("RESULT: volume "+vol+" = [" + df.format(this.vol) + "]");
  }

  // When ch=2, Next three lines contain l, b, h representing length, breadth
  //   and height of the cuboid respectively.  l, b, h will be in 3 separate lines
  public void calcCuboid( double params[] ) {
    setL( params[1] );
    setB( params[2] );
    setH( params[3] );
    vol = l * b * h;
  }

  // When ch=3, Next line contains r, the radius of the hemisphere
  public void calcHemisphere( double params[] ) {
    setR( params[1] );
    vol = Math.PI * r * r * r * 2 / 3;
  }

  // When ch=4, Next two lines contain r, h representing the radius and height of
  // the cylinder respectively.  r, h will be in two separate lines.
  public void calcCylinder( double params[] ) {
    setR( params[1] );
    setH( params[2] );
    vol = Math.PI * r * r * h;
  }

}

