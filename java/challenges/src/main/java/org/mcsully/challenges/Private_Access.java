package org.mcsully.challenges;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;

/**
 * 
 * You are given a class Solution and an inner class Private.
 * The main method of class Solution takes an integer as input.
 * powerof2 in class Private checks whether a number is a power of 2.
 * You have to call the method powerof2 of the class Private from the main method of class Solution.
 * 
 * Constraints
 * 
 * Sample Input
 * 
 * 8
 * 
 * Sample Output
 * 
 * 8 is power of 2
 * An instance of class: Private has been created
 *
 */
public class Private_Access
{
  public void access(String[] args) {
  
      String strNum = args[0];
      System.out.println(strNum + ", an instance of class: "+strNum.getClass().getSimpleName()+" has been created");
      int num=Integer.parseInt(strNum);
      Private priv = new Private();
      String result = priv.powerof2( num );
      System.out.println( result );
  }

  class Private
  {
    private String powerof2(int num) {
      return ((num&num-1)==0)?"power of 2":"not a power of 2";
    }

  }

}//end of solution
