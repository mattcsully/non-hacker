package org.mcsully.challenges;

import java.util.Comparator;
import org.mcsully.challenges.HashCodeUtil;

// A simple key, value object.
public class KVRecord implements Comparable<KVRecord>
{
  final int BEFORE = -1;
  final int EQUAL = 0;
  final int AFTER = 1;

  KVRecord(int a, String n){ 
    this.key = a; 
    this.value = n; 
  } 

  public int getKey() { return this.key; } 
  public void setKey(int i) { this.key = i; } 

  public String getValue() {return value; } 
  public void setValue(String str) {this.value = str; } 

  //Use simple this and that comparison.
  @Override
  public int compareTo(KVRecord aThat) {

    // Start with simple check
    if (this == aThat) return EQUAL;

    // int uses the <> check
    if (this.key < aThat.key) return BEFORE;
    if (this.key > aThat.key) return AFTER;

    // String objects use their own compareTo
    int comparison = this.value.compareTo(aThat.value);
    if (comparison != EQUAL) return comparison;

    // all comparisons are equal, so this equals that.
    return EQUAL;
  }

  public String toString() {     
    return ("KVRecord[ Value: "+this.getValue()+", Key: "+ this.getKey()+"]"); 
  }

  // Implement equality.
  @Override
  public boolean equals(Object aThat) {
     if (this == aThat) return true;
     if (!(aThat instanceof KVRecord)) return false;

     KVRecord that = (KVRecord)aThat;
     return ( this.key == that.key ) &&
            ( this.value.equals(that.value) );
   }

  // Override equals requires override of hashCode.
  @Override
  public int hashCode() {
     int result = HashCodeUtil.SEED;
     result = HashCodeUtil.hash( result, key );
     result = HashCodeUtil.hash( result, value );
     return result;
  }

  // private members
  private int key;
  private String value;

}
