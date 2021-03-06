package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Print_Array;

/**
 * Unit test for simple Challenges.
 */
public class Print_ArrayTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Print Arrays Tests Starting =======================");
  }

  @Test
  public void testPrint_Int_Array() {
    Print_Array prnAry = new Print_Array();
    try {
      prnAry.print( new int[] {3, 9, -2147483648, 2147483647} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testBad() {
    Print_Array prnAry = new Print_Array();
    try {
      prnAry.print( new Object[] {1, 4, 0.030, 4, 0.027, 6, 0.016, 3, 0.013, 5, 0.015, 1, 0.001, 122337203} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testLong() {
    Print_Array prnAry = new Print_Array();
    try {
      prnAry.print( new String[] {"9,223,372,036,854,775,807", 
"abaabbdcabcadadccbbddcbdcabadbacbbbdccbbbddacccbccaaccbdcbcccbbaddbcdbbcdbabbdacdcaadbdcbcdabdbbbdcadcaccbdcaaaadabccacbcaabbaadbaadadacbbbddacbddbbbdbbaddabcdbadcbdbcbbbaaadadcddddbabcddaaaabbdccbabcadaadddadaaaccbcdbbccbcaadabcdddabbdbbdaadbabacdabadcaacdadbcddcadcddaaadbdadcdaadabdcdddaababcbbcbdadbcbbbbdbdddbbddbabcccbbabccddbbadcabcaaddbbbabddbdbcbbcabacacdaddcdbbaadaddadbccdddbaaadadadccbdcddcacdababdcadbcacaccddbbcddbccbdadcaddddaacaccdaadbdccdbadcacabababcadcdbdcbbbbaddadcdbaaacdababdbcabdccbabaabbbaccbadbdaabcdcaddcddaaccddaabababcdabacadddbbdbaaccacacaddadadbcbddddadadbcbddacaccdcaadabcacadcbbabcccbdbbdcdcacaacdccadcccacdbccdcdddacaabcbcaadcbcbcdbaacdabbbcaddbaaaddacbbdbdcbdbdbadadacaddcbdcddbabcbdadbadddddabbdcbbcabdacdbbdcbabadcbcacdcdadbbdbcdbcdcaccddcdaccbdbbcbbbcccbbabdbcddbbdddadcaabbaccacccadddcbcbddbaccadacbbadbacbbaabdabdbbbbadbddcbbcbdbbbdabaacbdddccbbabacbdcaddbcdcdddddbccdbcbbddbcaccbdccbbabdacadcabbadacacdadabcbabadaadbdbbbcddccaacbcdbddbbbdbacbbaacdccadbccddddacdacccccabdbdbddcacbbdcbbbdddbbcacbacadcccdcdcbddcaccdbbdaccdbddacbaddbccabbacabadbdbbccbbabcdadcbcaacdddddadbddbcbcdadacccccbdccaaabdccabdadacddcbcabcaadbdbdbbacbbdbcbadcbadacdbabdcddccbccbccccdbcbbdcdcdbccacdabacccbbdadcdbbbbdbbbdadcccbbddbbbddbcabcbdcbdbdbdadccdccabdccdddcdddacbccdbadcadacdaddadabbdacddabccbbbbdbddbbbadcbbacbdbbaaaddbcacdcaacccdbdddddbacbabccacadcdcaacdcacdcbbcabcdcdadbcaacdbdaadadaccdcaabacdacbcbadcccdacbcacccdbdbbadbdabdaddaaabcdcacaaaaddcbdaabdddcbaddbcbaabddbdbbcdbaadccbbdacadbccbbdccadacaadbbadaccaccbaabbdcdccdcdbbbddddacbdbdabbbcababccbbbdcdcacadbdccbdccaadcabcddbbcbbddbacddbdaccbdbaacdbbccddbccbcdbaccabcbbccddbabddbddccdbbaddabbcbbdabbdadcbbccacaccacdcbcadccccccdaacdabacababcbcabddbbdabddddbbccaddadacdcbdbabddbaacadbdaacdcaacabaacbcadcbcadadbcdabacbbaacadacbdbacdddbaadddaabbdbbdadcdcacdcbabacaccdcacdbccabbbbaccbcaacaacaadcdaccbbadaccadbbcaabcdbbcccbbbabccadbccdbbbbbabdacacccadcabbccbbabbaacadcacbacdabddcddaabbbbdaababbdbbbbdcabdabdccabcbcccbdccdbabadccbcabdcbcbaacbbbdddbdbacbabdcacababccbadcabdaccddbbbbbadccabbdacddddcbcdabbcbdcdabaaadabcdcabbdcaacbcadccbacccabadababaccababbccdccdccdcbbaadcbaadadadbcbabcdaadabbaababacaddbbaaaabddbcddacbddbabcadabbbacbdcbccbaccdbadababacdddaddddccddcbacacbdbcbbadaddbbadcaadccdacaaadacdbbaacabacdbcccbdaabbcbabcabdacccbdbddbbcddbcabaabaccbbdbddcacabaaadcbdcacbaaacddadcccdccdcbbaaddccdacdcaadbabacabaaddabcddbdbcacbcaaddaabdaccacddddbabaacbccccbcbbcbacbccbdcaacddbbdcabbcdacbaadccabcdddccdbbcdaadaabcccdccabbcbaaadcdbcbdbcdcdbcccaddbaccdaaadbabcbbcbbaddcadddcdddbbcdccabcbcdccbadcabddabadbaaadaacabbbabddadaadaccccbbdddbadadbabaadddcddddbbcaadccdacbbcccacabcbdbdbdaaccdddcabdaacccdbbcddbabdbcbadaddbbcacaabccddacdddcacaabbabcabcaabdbbdaccddbbdbabdabbdbdacccaadccccdccbaabdcacbcdadddbaacbbbccbbadbaabccccabcaaddbdcdcbadcacccbcccbdbaabbcdadcbcdbcdccaadcbcdccdbaabbbcbaaacdbdadbadcbdabcbacdbcadcaddbbaacacaabaaaddcbdaabaaccbbdbcabccabbbdabadababbdccdbbbccbdcadbbdcbbbdaababacaadcccbabdbccadacacaccadabacaadacbbccbddcccabcdcdbccbbbaacaabddaddaabacadbbcdaaaabdddccbcbdcbabcdaccddcaabadcaacaabcbdadcddcdcadcdbabadcbdcbdcadcdbaddbccbadbacacbcadddacdaacccadabcdcacacabcdbaddababdbcaacdabaccdcbacdcbdcaddacdbdcacdbabcbaadbcbbaacdbcabcadbbbddadaadaabddcbbdabadcdbbbdbadccdacdbdbcbbdacaaabdcacaadacbcbbadccabcbaabbdcaadcaaabdbadbdadddbacdbabdadccaaabaddbdaabacbcbadacbaabdddcdbbacbaacacacaddadbabbbadbdbdcbcabddbbacbabbcadaadbadbcdbccadadadccccacdddcdacbaadbabbbbbabaacddbccaaacadbacbbddcacbdacadabdcbdccdababdabbdbbcddcdabcabaadcdbdcbddacaabcaadddabacddaadbbaacadbcbbddbdaadcbbacdcbdaabdcdbcadcdacadbdacbbacacdcccdacccdcbadddadacadaacdaaaccbabdbabacaacaaaddaddaadccaaacbdbcdaaaacdaabaabdabdbdadccbccadbddabbadabdddcdcdccccdacaaabcbaccbaaddcbacdcadcddcaddbadadadcbcabbadabcbbcbdcbcbbcaaacbbbbdbadcdcadcbcbcbdddbbcdccbacbdbbddccadadcaddacaaacbcacdcaabacdabababaaaaddbcbaacddaaccbbabadcbaacdcacbabdcacbccadcbaaabbbbcbddcaacbdbadbcbbbcabcaabdddcabbacbdadbbaaacdbdddcabaaaaddadcabcccddbaaacccdbacccbbadbaadcacbdbcddbaacdbbaccdccbadbababbdbbcbcdadcaadccabccadcbcddcabdbcdcdacddcbcaacabbbdaacbdbcacababbdaddbbdcccbabccccaababdcdacddadadbaac",
"baabbdcabcadadccbbddcbbbaadbaadadacbbbddacbddbbbdbbaddabcdbadcbdbcbbbaaadadcddddbabcddaaaabbdccbabcadaadddadaaaccbcdbbccbcaadabcdddabbdbbdaadbabacdabadcaacdadbcddcadcddaaadbdadcdaadabdcdddaababcbbcbdadbcbbbbdbdddbbddbabcccbbabccddbbadcabcaaddbbbabddbdbcbbcabacacdaddcdbbaadaddadbccdddbaaadadadccbdcddcacdababdcadbcacaccddbbcddbccbdadcaddddaacaccdaadbdccdbadcacabababcadcdbdcbbbbaddadcdbaaacdababdbcabdccbabaabbbaccbadbdaabcdcaddcddaaccddaabababcdabacadddbbdbaaccacacaddadadbcbddddadadbcbddacaccdcaadabcacadcbbabcccbdbbdcdcacaacdccadcccacdbccdcdddacaabcbcaadcbcbcdbaacdabbbcaddbaaaddacbbdbdcbdbdbadadacaddcbdcddbabcbdadbadddddabbdcbbcabdacdbbdcbabadcbcacdcdadbbdbcdbcdcaccddcdaccbdbbcbbbcccbbabdbcddbbdddadcaabbaccacccadddcbcbddbaccadacbbadbacbbaabdabdbbbbadbddcbbcbdbbbdabaacbdddccbbabacbdcaddbcdcdddddbccdbcbbddbcaccbdccbbabdacadcabbadacacdadabcbabadaadbdbbbcddccaacbcdbddbbbdbacbbaacdccadbccddddacdacccccabdbdbddcacbbdcbbbdddbbcacbacadcccdcdcbddcaccdbbdaccdbddacbaddbccabbacabadbdbbccbbabcdadcbcaacdddddadbddbcbcdadacccccbdccaaabdccabdadacddcbcabcaadbdbdbbacbbdbcbadcbadacdbabdcddccbccbccccdbcbbdcdcdbccacdabacccbbdadcdbbbbdbbbdadcccbbddbbbddbcabcbdcbdbdbdadccdccabdccdddcdddacbccdbadcadacdaddadabbdacddabccbbbbdbddbbbadcbbacbdbbaaaddbcacdcaacccdbdddddbacbabccacadcdcaacdcacdcbbcabcdcdadbcaacdbdaadadaccdcaabacdacbcbadcccdacbcacccdbdbbadbdabdaddaaabcdcacaaaaddcbdaabdddcbaddbcbaabddbdbbcdbaadccbbdacadbccbbdccadacaadbbadaccaccbaabbdcdccdcdbbbddddacbdbdabbbcababccbbbdcdcacadbdccbdccaadcabcddbbcbbddbacddbdaccbdbaacdbbccddbccbcdbaccabcbbccddbabddbddccdbbaddabbcbbdabbdadcbbccacaccacdcbcadccccccdaacdabacababcbcabddbbdabddddbbccaddadacdcbdbabddbaacadbdaacdcaacabaacbcadcbcadadbcdabacbbaacadacbdbacdddbaadddaabbdbbdadcdcacdcbabacaccdcacdbccabbbbaccbcaacaacaadcdaccbbadaccadbbcaabcdbbcccbbbabccadbccdbbbbbabdacacccadcabbccbbabbaacadcacbacdabddcddaabbbbdaababbdbbbbdcabdabdccabcbcccbdccdbabadccbcabdcbcbaacbbbdddbdbacbabdcacababccbadcabdaccddbbbbbadccabbdacddddcbcdabbcbdcdabaaadabcdcabbdcaacbcadccbacccabadababaccababbccdccdccdcbbaadcbaadadadbcbabcdaadabbaababacaddbbaaaabddbcddacbddbabcadabbbacbdcbccbaccdbadababacdddaddddccddcbacacbdbcbbadaddbbadcaadccdacaaadacdbbaacabacdbcccbdaabbcbabcabdacccbdbddbbcddbcabaabaccbbdbddcacabaaadcbdcacbaaacddadcccdccdcbbaaddccdacdcaadbabacabaaddabcddbdbcacbcaaddaabdaccacddddbabaacbccccbcbbcbacbccbdcaacddbbdcabbcdacbaadccabcdddccdbbcdaadaabcccdccabbcbaaadcdbcbdbcdcdbcccaddbaccdaaadbabcbbcbbaddcadddcdddbbcdccabcbcdccbadcabddabadbaaadaacabbbabddadaadaccccbbdddbadadbabaadddcddddbbcaadccdacbbcccacabcbdbdbdaaccdddcabdaacccdbbcddbabdbcbadaddbbcacaabccddacdddcacaabbabcabcaabdbbdaccddbbdbabdabbdbdacccaadccccdccbaabdcacbcdadddbaacbbbccbbadbaabccccabcaaddbdcdcbadcacccbcccbdbaabbcdadcbcdbcdccaadcbcdccdbaabbbcbaaacdbdadbadcbdabcbacdbcadcaddbbaacacaabaaaddcbdaabaaccbbdbcabccabbbdabadababbdccdbbbccbdcadbbdcbbbdaababacaadcccbabdbccadacacaccadabacaadacbbccbddcccabcdcdbccbbbaacaabddaddaabacadbbcdaaaabdddccbcbdcbabcdaccddcaabadcaacaabcbdadcddcdcadcdbabadcbdcbdcadcdbaddbccbadbacacbcadddacdaacccadabcdcacacabcdbaddababdbcaacdabaccdcbacdcbdcaddacdbdcacdbabcbaadbcbbaacdbcabcadbbbddadaadaabddcbbdabadcdbbbdbadccdacdbdbcbbdacaaabdcacaadacbcbbadccabcbaabbdcaadcaaabdbadbdadddbacdbabdadccaaabaddbdaabacbcbadacbaabdddcdbbacbaacacacaddadbabbbadbdbdcbcabddbbacbabbcadaadbadbcdbccadadadccccacdddcdacbaadbabbbbbabaacddbccaaacadbacbbddcacbdacadabdcbdccdababdabbdbbcddcdabcabaadcdbdcbddacaabcaadddabacddaadbbaacadbcbbddbdaadcbbacdcbdaabdcdbcadcdacadbdacbbacacdcccdacccdcbadddadacadaacdaaaccbabdbabacaacaaaddaddaadccaaacbdbcdaaaacdaabaabdabdbdadccbccadbddabbadabdddcdcdccccdacaaabcbaccbaaddcbacdcadcddcaddbadadadcbcabbadabcbbcbdcbcbbcaaacbbbbdbadcdcadcbcbcbdddbbcdccbacbdbbddccadadcaddacaaacbcacdcaabacdabababaaaaddbcbaacddaaccbbabadcbaacdcacbabdcacbccadcbaaabbbbcbddcaacbdbadbcbbbcabcaabdddcabbacbdadbbaaacdbdddcabaaaaddadcabcccddbaaacccdbacccbbadbaadcacbdbcddbaacdbbaccdccbadbababbdbbcbcdadcaadccabccadcbcddcabdbcdcdacddcbcaacabbbdaacbdbcacababbdaddbbdcccbabccccaababdcdacddadadbaac"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestLong: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    Print_Array prnAry = new Print_Array();
    try {
      prnAry.print( new String[] {"1","-211"} );
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNegative: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Print_Array prnAry = new Print_Array();
    try {
      prnAry.print( null );
    } catch (NullPointerException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Print Arrays Tests Completed =======================");
  }

}
