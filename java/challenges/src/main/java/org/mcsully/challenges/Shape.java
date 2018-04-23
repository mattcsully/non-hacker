package org.mcsully.challenges;

import java.text.DecimalFormat;

public abstract class Shape {
  private double vol = 0.000; // calculated

  public abstract double getVolume();
  public abstract void getDimensions();
  public abstract String getType();
}

