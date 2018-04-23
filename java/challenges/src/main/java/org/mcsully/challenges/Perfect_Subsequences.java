package org.mcsully.challenges;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * We call a string, s, consisting of the letters in the set {a,b,c,d} a
 * perfect string if both the conditions below are true:
 *  #s(a)=#s(b)
 *  #s(c)=#s(d)
 * where #s(x) denotes the number of occurrences of character x in s.
 * For example, the diagram below demonstrates why s = "abacadbbcd"
 * is a perfect string:
 *    aaa
 *    bbb
 * abacadbbcd
 *     cc
 *     dd
 *
 * Solve q queries, where each query consists of a string, s.
 * For each query, print the number of non-empty subsequences of s that are
 * perfect strings. As this number can be very large, print it
 * modulo 10**9 + 7.
 * 
 * Input Format
 * 
 * The first line contains an integer, q, denoting the number of queries.
 * Each of the q subsequent lines contains string s for a query.
 * 
 * Constraints
 * 
 *  + 1 <= q <= 5
 *  + 1 <= length(s) <= 5 * 10**5
 *  + String s consists only of the following characters: a, b, c, and d.
 * 
 * Subtask
 * 
 *  * For 40% of the total score, 1 <= length(s) <= 4000.
 * 
 * Output Format
 * 
 * For each, print the number of non-empty sub-sequences of s that are perfect
 * strings, modulo 10**9 + 7, on a new line.
 * 
 * Sample Input 0
 * 
 *      3
 *      abcd
 *      cad
 *      dcc
 * 
 * Sample Output 0
 * 
 *      3
 *      1
 *      2
 * 
 * Explanation 0
 * 
 * We perform the following q = 3 queries:
 *    * s = "abcd" has 3 non-empty perfect subsequences: ab, cd, and abcd.
 *      Thus, the answer is 3 mod (10**9 + 7) = 3.
 *    * s = "cad" has 1 non-empty perfect subsequence: cd.
 *      Thus, the answer is 1 mod (10**9 + 7) = 1.
 *    * s = dcc has 2 non-empty perfect subsequences: dc and dc.  Note that,
 *      while both these strings contain the same characters, they are distinct
 *      subsequences of s (i.e., s0 s1 and s0 s2).
 *      Thus, the answer is 2 mod (10**9 + 7) = 2.
 *
 */
public class Perfect_Subsequences
{
  public void checkSequence( String[] args )
  {
    // Constraints
    // First line is q: 1 <= q <= 5
    // 1 <= length(s) <= 5 * 10**5
    // String s consists only of the following characters: a, b, c, and d.

    if (args == null) {
      throw new NullPointerException("ERROR: Input array is null.");
    }

    // First line is q: 1 <= q <= 5
    int N = Integer.parseInt(args[0]);
    if (N < 1 || N > 5 ) {
      throw new IllegalArgumentException("ERROR: Number of queries " + args[0] + " must be > 0 and < 6.");
    }

    // 1 <= length(s) <= 5 * 10**5
    int MAX_LENGTH = 500000;
    String str;
    int strLength;
    int M = 1000000007;  // Print out in modulo 1,000,000,007
    long countAs = 0;
    long countBs = 0;
    long countCs = 0;
    long countDs = 0;

    // String s consists only of the following characters: a, b, c, and d.
    String regex = "^[a-d]+$";
    Pattern pattern = Pattern.compile(regex);

    for (int i=1; i<N; i++) {              

      str = args[i];

      strLength = str.length();
      if (strLength < 1) {
        throw new IllegalArgumentException("ERROR: String " + str + " is less than 1 character.");
      }

      if (strLength > MAX_LENGTH) {
        throw new IllegalArgumentException("ERROR: String " + str + " is more than " + MAX_LENGTH + " characters.");
      }

      Matcher matcher = pattern.matcher(str);
      if (!matcher.matches()) {
        throw new IllegalArgumentException("ERROR: String " + str + " contains characters other than abcd");
      }

      // Output Format
      // For each, print the number of non-empty sub-sequences of s that are perfect
      // strings, modulo 10**9 + 7, on a new line.
      System.out.println("\nAnalyze String " + str );
 
      Character ch;
      char[] chars = str.toCharArray();
      for (int r=0; r<chars.length; r++) {              
        ch = chars[r];
        switch (ch) {
          case 'a':
            countAs++;
            break;
          case 'b':
            countBs++;
            break;
          case 'c':
            countCs++;
            break;
          case 'd':
            countDs++;
            break;
          default: 
            System.out.println("ERROR: " + ch + " is not a, b, c, or d");
            break;
        }
      }

      System.out.println( " modulo [" + M + "]" );
      System.out.println("A count [" + countAs + "]" );
      System.out.println("B count [" + countBs + "]" );
      System.out.println("C count [" + countCs + "]" );
      System.out.println("D count [" + countDs + "]" );

      long modCount = 0;
      if (countAs == countBs) {
         modCount = (countAs % M);
         System.out.println("A = B " + modCount );
      }

      if (countCs == countDs) {
         modCount = (countDs % M);
         System.out.println("C = D " + modCount );
      }

    }

  }

}
