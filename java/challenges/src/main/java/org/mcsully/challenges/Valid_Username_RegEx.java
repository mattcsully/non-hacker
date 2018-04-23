package org.mcsully.challenges;

import java.util.regex.*;

/**
 *
 * A username is considered valid if all the following constraints are satisfied:
 * + The username consists of 8 to 30 characters inclusive, i.e., if the username
 *   consists of less than 8 or greater than 30 characters, then it is invalid
 *   username.
 * + The username must contain alphanumeric characters, and underscores (_) only.
 *   Alphanumeric characters describe the character set consisting of lowercase 
 *   characters [a-z], uppercase characters [A-Z], and digits [0-9].
 * + The first character of the username must be an alphabetic character, i.e.,
 *   either lowercase character [a-z] or uppercase character [A-Z].
 *
 * For example:
 *  + Julia is invalid user name because it contains less than characters.
 *  + Samantha is valid as it satisfies all the three constraints for a valid
 *    username.
 *  + Samantha_21 is valid as it satisfies all the three constraints for a
 *    valid username.
 *  + 1Samantha is invalid as the first character must be alphabetic.
 *  + Samantha?10_2A is invalid as it contains the which does not belong to
 *    any of the allowed characters set.
 * Update the value of regularExpression field in the UsernameValidator class
 * so that the regular expression only matches with valid usernames.
 *
 * Input Format
 *
 * The first line of input contains an integer n, describing the total number
 * of usernames. Each of the next n lines contains a string describing the
 * username. The locked stub code reads the inputs and validates the username.
 *
 * Constraints
 *
 * + 1 <= n <= 100
 * + The username consists of any printable characters.
 *
 * Output Format
 *
 * For each of the usernames, the locked stub code prints "Valid" if the
 * username is valid; otherwise "Invalid" each on a new line.
 *
 * Sample Input 0
 *   8
 *   Julia
 *   Samantha
 *   Samantha_21
 *   1Samantha
 *   Samantha?10_2A
 *   JuliaZ007
 *   Julia@007
 *   _Julia007
 *
 * Sample Output 0
 *   Invalid
 *   Valid
 *   Valid
 *   Invalid
 *   Invalid
 *   Valid
 *   Invalid
 *   Invalid
 *
 * Explanation 0
 *
 *  + Julia is invalid user name because it contains less than 8 characters.
 *  + Samantha is valid as it satisfies all the three constraints for a valid username.
 *  + Samantha_21 is valid as it satisfies all the three constraints for a valid username.
 *  + 1Samantha is invalid as the first character must be alphabetic.
 *  + Samantha?10_2A is invalid as it contains the which does not belong to any of the allowed characters set.
 *  + JuliaZ007 is a valid username as it satisfies all the constraints.
 *  + Julia@007 is an invalid username as it contains the invalid character, @.
 *  + _Julia007 is an invalid username as the first charachter is which is
 *    not an alphabetic character.
 *
 */
class UsernameValidator {

  public static final int MIN_LENGTH = 8;
  public static final int MAX_LENGTH = 30;

  // ENGLISH regular expressions here.
  // https://docs.oracle.com/javase/7/docs/api/java/util/regex/Pattern.html
  public static final String firstCharRegex = "[a-zA-Z]";
  //blic static final String regEx = "[ -~]";
  //blic static final String regEx = "\\p{Print}";
  public static final String regEx = "\\w";
 
  public boolean validName( String name ) {

    boolean good = true;
    boolean bad = false;

    if (name.length() < MIN_LENGTH ) {
      System.out.println("Invalid, shorter than " + MIN_LENGTH);
      return bad;
    }

    if (name.length() > MAX_LENGTH ) {
      System.out.println("Invalid, longer than " + MAX_LENGTH);
      return bad;
    }

    String firstChar = name.substring(0, 1);
    Pattern firstPattern = Pattern.compile(firstCharRegex);
    Matcher firstMatch = firstPattern.matcher(firstChar);
    if ( firstMatch.matches() ) {
      Pattern pattern = Pattern.compile(regEx);
      Matcher matcher = pattern.matcher(name);
      //return matcher.matches();
      return good;
    } else {
      System.out.println("Invalid first character [" +firstChar +"]");
      return bad;
    }
  }
}

public class Valid_Username_RegEx 
{
  public void checkUserNames(String[] names) {

    if (names == null) {
      throw new NullPointerException("ERROR: Input array is null.");
    }

    int N = Integer.parseInt(names[0]);
    if (N < 1) {
      throw new NullPointerException("ERROR: Input array does not contain values.");
    }

    System.out.println("Check "+ N + " names.");
    for(int i=1; i==N; i++) {
      String name = names[i];
      System.out.println("Check "+ i + " ["+ name + "]");
      UsernameValidator isValid = new UsernameValidator();
      if ( isValid.validName( name ) ) {
        System.out.println("  Valid " + name);
      } else {
        System.out.println("Invalid " + name);
      }
    }
  }

}



