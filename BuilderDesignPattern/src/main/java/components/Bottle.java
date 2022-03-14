package components;

import interfaces.Packing;

public class Bottle implements Packing {

  public static final String BOTTLE = "Bottle";

  @Override
  public String pack() {
    return BOTTLE;
  }
}
