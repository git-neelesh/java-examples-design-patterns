package components;

import interfaces.Item;
import interfaces.Packing;

public abstract class ColdDrink implements Item {
  @Override
  public Packing packing() {
    return new Bottle();
  }

  @Override
  public abstract float price();
}
