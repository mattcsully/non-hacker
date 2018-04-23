package org.mcsully.challenges;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.mcsully.challenges.Compare_Players;

/**
 * Unit test for simple Challenges.
 */
public class Compare_PlayersTest
{
  private static String logGood = "All tests pass";
  private static String logFail = "There are test failures";

  @BeforeAll
  public static void printHeader(){
    System.out.println("======================= Compare Players Tests Starting =======================");
  }

  /*
   * Sample Input
   *   5
   *   amy 100
   *   david 100
   *   heraldo 50
   *   aakansha 75
   *   aleksa 150
   */
  @Test
  public void testCompare_Players() {
    Compare_Players cPlay = new Compare_Players();
    try {
      // "5",
      // "amy","100",
      // "david","100",
      // "heraldo","50",
      // "aakansha","75",
      // "aleksa","150"} );
      cPlay.addPlayers( new String[] {"5", "amy","100", "david","100", "heraldo","50", "aakansha","75", "aleksa","150"} );
      cPlay.printPlayers();
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestCompare_Players: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testOne() {
    Compare_Players cPlay = new Compare_Players();
    try {
      cPlay.addPlayers( new String[] {"1"} );
      cPlay.printPlayers();
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestOne: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testTen() {
    Compare_Players cPlay = new Compare_Players();
    try {
      cPlay.addPlayers( new String[] {"10", "Mikaela SHIFFRIN - USA", "1773", "Wendy HOLDENER - SUI", "1168", "Viktoria REBENSBURG - GER", "977", "Sofia GOGGIA - ITA", "958", "Petra VLHOVA - SVK", "888", "Tina WEIRATHER - LIE", "887", "Michelle GISIN - SUI", "868", "Ragnhild MOWINCKEL - NOR", "849", "Frida HANSDOTTER - SWE", "817", "Lindsey VONN - USA", "792"} );
      cPlay.printPlayers();
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestTen: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testTopForty() {
    Compare_Players cPlay = new Compare_Players();
    try {
      cPlay.addPlayers( new String[] {"40", "Marcel HIRSCHER - AUT", "1620", "Mattias HARGIN - SWE", "214", "Brice ROGER - FRA", "211", "Marco SCHWARZ - AUT", "210", "Ted LIGETY - USA", "188", "Henrik KRISTOFFERSEN - NOR", "1285", "Aksel LundSVINDAL - NOR", "886", "Dominik PARIS - ITA", "518", "Manuel FELLER - AUT", "481", "Victor MUFFAT-JEANDET - FRA", "458", "Aleksander AamodtKILDE - NOR", "454", "Peter FILL - ITA", "433", "Max FRANZ - AUT", "446", "Adrien THEAUX - FRA", "407", "Kjetil JANSRUD Kjetil - NOR", "884", "Beat FEUZ - SUI", "856", "Alexis PINTURAULT - FRA", "707", "Vincent KRIECHMAYR - AUT", "704", "Thomas DRESSEN - GER", "672", "Matthias MAYER - AUT", "622", "Hannes REICHELT - AUT", "535", "Andre MYHRER - SWE", "522", "Michael MATT - AUT", "394", "Christof INNERHOFER - ITA", "389", "Manfred MOELGG - ITA", "376", "Daniel YULE - SUI", "370", "Mauro CAVIEZEL - SUI", "358", "Leif Kristian NESTVOLD-HAUGEN - NOR", "346", "Luca AERNI - SUI", "333", "Ramon ZENHAEUSERN - SUI", "326", "Loic MEILLARD - SUI", "299", "Matts OLSSON - SWE", "299", "Sebastian FOSS-SOLEVAAG - NOR", "298", "Justin MURISIER - SUI", "276", "Andreas SANDER - GER", "275", "Zan KRANJEC Zan - SLO", "272", "Dave RYDING - GBR", "237", "Josef FERSTL - GER", "237", "Linus STRASSER - GER", "224", "Stefano GROSS - ITA", "274"});
      cPlay.printPlayers();
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestTopForty: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNegative() {
    Compare_Players cPlay = new Compare_Players();
    try {
      cPlay.addPlayers( new String[] {"1","-211"} );
      cPlay.printPlayers();
    } catch (IllegalArgumentException e) {
      System.out.println( "\ntestNegative: " + logFail + ": " + e.toString());
    }
  }

  @Test
  public void testNull() {
    Compare_Players cPlay = new Compare_Players();
    try {
      cPlay.addPlayers( null );
      cPlay.printPlayers();
    } catch (NullPointerException e) {
      System.out.println( "\ntestNull: " + logFail + ": " + e.toString());
    }
  }

  @AfterAll
  public static void printDivider(){
    System.out.println("======================= Compare Players Tests Completed =======================");
  }


}
