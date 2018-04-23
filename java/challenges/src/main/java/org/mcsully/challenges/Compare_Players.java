package org.mcsully.challenges;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

import org.mcsully.challenges.KVRecord;
import org.mcsully.challenges.HashCodeUtil;

/**
 * There are players in a tournament.  You will be given the name of each player
 * and his score.  You need to sort the players in decreasing order by score.
 * If two players have the same score, the one whose name is lexicographically
 * larger should appear first.
 * Note We have already provided you partially completed code in the editor.
 * Your task is to create the class Checker which uses a comparator desc to
 * sort the players.
 * A string is lexicographically smaller than another string if it appears
 * earlier in a standard dictionary.  For example, "cat" is lexicographically
 * smaller than "dog", but larger than "cab" or "ca".
 *
 * Input Format
 * The first line contains an integer, the number of players.  The next lines 
 * contain the name of a player and his score separated by a space.  Two
 * players can have the same name.  A name will consist of lower-case English
 * characters.  The score of a player can range from 0 to 1000.  You don't need
 * to worry about any other constraints.
 * 
 * Output Format
 * Print the sorted order of players and their score as explained in the
 * problem statement.
 * 
 * Sample Input
 *   5
 *   amy 100
 *   david 100
 *   heraldo 50
 *   aakansha 75
 *   aleksa 150
 *   
 * Sample Output
 *   aleksa 150
 *   david 100
 *   amy 100
 *   aakansha 75
 *   heraldo 50
 */
public class Compare_Players 
{
  // Collection to be sorted
  List<KVRecord> players;

  public void addPlayers( String[] args )
  {
    // Collection to be sorted
    players = new ArrayList<>();

    // The first argument contains an integer, the number of players.
    // The next lines 
    int N = Integer.parseInt(args[0]);
    // The elements remainding must be an even number
    int remainder = args.length - 1;
    if ( remainder == 0 ) {
      // nothing to process
      throw new IllegalArgumentException("ERROR: No data to process!" );
    }

    if ( (remainder & 1) == 0 ) {
      // even number remaining
      for(int i=1; i<(N*2); i++) {
        String name=args[i];
        i++;
        int score=Integer.parseInt(args[i]);

        KVRecord player = new KVRecord(score, name);
        players.add(player);
      }
    }
    else {
      // odd number
      throw new IllegalArgumentException("ERROR: Even number of elements required, not " + remainder );
    }
  }

  public void printPlayers()
  {
    // Sort players and print
    //players.sort(Player, check.desc);
    Collections.sort(players, Collections.reverseOrder());
   
    //display elements of ArrayList
    KVRecord player;
    System.out.println("Player elements after sorting in ascending order : ");
    try {
      for(int i=0; i<players.size(); i++) {
        player = players.get(i);
        System.out.printf("%s %s\n",player.getValue(),player.getKey());
      }
    }
    catch (Exception e) {
      System.out.printf("ERROR: " + e.toString());
    }
  }
}
