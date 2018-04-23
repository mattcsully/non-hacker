package org.mcsully.challenges;

import java.math.*;

/**
 * 
 * Create a class which contains a single method checkPrime so that
 * the code prints the following prime numbers as output.
 *   89
 *   19 787 11
 *   2 31
 * Please do not use method overloading!
 *
 */
public class Checking_Prime 
{
  public void checkPrime( String[] numbers )
    throws IllegalArgumentException
  {
    if (numbers == null) {
      throw new IllegalArgumentException("ERROR: Input array is null.");
    }

    for( int i = 0; i < numbers.length; i++) {

      BigInteger bi = new BigInteger( numbers[i] );
      //BigInteger bi = numbers[i];

      // Keep it to a maximum 100 digits.
      int chk = bi.bitLength();
      if ( chk > 100 ) {
        throw new IllegalArgumentException("ERROR: No values with more than 100 digits.");
      }
      System.out.println(bi.isProbablePrime(9) ? numbers[i] + " prime" : numbers[i] + " not prime");
    }
  }
}
