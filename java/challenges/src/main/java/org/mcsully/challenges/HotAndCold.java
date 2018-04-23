package org.mcsully.challenges;
/*
 * Hot and Cold
 * 
 * Carl, Caroline, Helen, and Han are four friends sharing a one-room workspace.
 * The workspace has a single thermostat which they can set to any integer
 * temperature between degrees to degrees Fahrenheit, inclusive.
 * The four friends can't agree on the room's temperature! Carl and Caroline
 * don't want it to be too cold, while Helen and Han don't want it to be too hot.
 * Specifically:
 *   + Carl wants it to be at least c1 degrees Fahrenheit.
 *   + Caroline wants it to be at least c2 degrees Fahrenheit.
 *   + Helen wants it to be at most h1 degrees Fahrenheit.
 *   + Han wants it to be at most h2 degrees Fahrenheit.
 * Given c1, c2, h1, and h2, is there a satisfactory temperature that all four
 * friends will be happy with? If it's possible, print YES; otherwise, print NO.
 * 
 * Input Format
 * Four space-separated integers describing the respective values of c1, c2, h1,
 * and h2.
 * 
 * Constraints
 *   + 35 < c1, c2, h1, h2 < 95
 * 
 * Output Format
 * Print YES if it's possible to satisfy all four friends' conditions;
 * otherwise, print NO instead.
 * 
 * Sample Input 0
 * 50 40 70 60
 * 
 * Sample Output 0
 * YES
 * 
 * Explanation 0
 * The four friends have the following temperature preferences:
 *   + Carl wants it to be at least c1 = 50 degrees.
 *   + Caroline wants it to be at least c2 = 40 degrees.
 *   + Helen wants it to be at most h1 = 70 degrees.
 *   + Han wants it to be at most h2 = 60 degrees.
 *
 * Any temperature between and degrees will satisfy all four friends, so we
 * print YES.
 *
 * Sample Input 1
 * 55 66 66 77
 *
 * Sample Output 1
 * YES
 *
 * Explanation 1
 * The four friends have the following temperature preferences:
 *   + Carl wants it to be at least c1=55 degrees.
 *   + Caroline wants it to be at least c2 = 66 degrees.
 *   + Helen wants it to be at most h1 = 66 degrees.
 *   + Han wants it to be at most h2 = 77 degrees.
 *
 * A temperature of exactly degrees will satisfy all four friends,
 * so we print YES.
 *
 * Sample Input 2
 * 80 80 40 40
 *
 * Sample Output 2
 * NO
 *
 * Explanation 2
 * In this test case, Carl wants the temperature to be at least c1 = 80 and
 * Helen wants it to be at most h1 = 40. There is no temperature that is both
 * > 80 and < 40, so we print NO because no satisfactory temperature exists.
 *
 */
public class HotAndCold {

  private int c1, c2, h1, h2 = 0;

  public HotAndCold() {
  }

  public void run (String[] args) {

    String c1Str = args[0];
    c1 = Integer.valueOf(c1Str);

    String c2Str = args[1];
    c2 = Integer.valueOf(c2Str);

    String h1Str = args[2];
    h1 = Integer.valueOf(h1Str);

    String h2Str = args[3];
    h2 = Integer.valueOf(h2Str);

    System.out.println("\nInput: c1 [" + c1Str + "] c2 [" + c2Str + "] h1 [" + h1Str + "] h2 [" + h2Str + "]\n");

    checkConstraints( "c1", c1); 
    checkConstraints( "c2", c2); 
    checkConstraints( "h1", h1); 
    checkConstraints( "h2", h2); 

    satisfies();
  }

  protected void checkConstraints( String var, int value) {
    if ( (value >= 35) & (value <= 95) ) {
      System.out.println( var + " meets constraints" );
    }
    else {
      throw new IllegalArgumentException("ERROR: Input " + var + " does not meet constraints.");
    }
  }

  protected String satisfies() {
    int min=0;
    int max=0;
        
    if(c1>c2)
      min=c1;
    else
      min=c2;
        
    if(h1<h2)
      max=h1;
    else
      max=h2;
        
    if(max-min>=0) {
      System.out.println("Do inputs meet requirements [YES]");
      return "YES";
    }
    else {
      System.out.println("Do inputs meet requirements [NO]");
      return "NO";
    }
            
  }

}
