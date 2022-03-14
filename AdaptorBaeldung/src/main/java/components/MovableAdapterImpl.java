package components;

import interfaces.Movable;
import interfaces.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {
  Movable movable;

  public MovableAdapterImpl(Movable movable) {
    this.movable = movable;
  }

  @Override
  public double getSpeed() {
    return convertMPHtoKMPH(movable.getSpeed());
  }

  private double convertMPHtoKMPH(double mph) {
    return mph * 1.60934;
  }
}
