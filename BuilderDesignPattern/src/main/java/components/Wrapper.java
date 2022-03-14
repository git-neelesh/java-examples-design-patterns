package components;

import interfaces.Packing;

public class Wrapper implements Packing {

  public static final String WRAPPER = "Wrapper";

  @Override
  public String pack() {
    return WRAPPER;
  }
}
