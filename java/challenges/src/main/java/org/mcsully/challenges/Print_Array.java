package org.mcsully.challenges;

import java.util.Arrays;

/**
 * Let's say you have an integer array and a string array.
 * You have to write a SINGLE method printArray that can print all the elements of both arrays.
 * The method should be able to accept both integer arrays or string arrays.
 * You are given code in the editor.
 * You have to complete it so that it prints the following lines:
 *   1
 *   2
 *   3
 *   Hello
 *   World
 * You should not use method overloading (your answer will not get accepted).
 *
 */
public class Print_Array
{
  public void print(Object objArray) {
    if (objArray instanceof int[]) {
      System.out.println(Arrays.toString((int[]) objArray));
    }
    else if (objArray instanceof String[]) {
      System.out.println(Arrays.toString((String[]) objArray));
    }
  }
}
