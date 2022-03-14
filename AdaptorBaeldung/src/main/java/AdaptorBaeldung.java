import components.BugattiVeyron;
import components.MovableAdapterImpl;
import interfaces.Movable;
import interfaces.MovableAdapter;

/**
 * Adaptor pattern example
 * Reference: https://www.baeldung.com/java-adapter-pattern
 */
public class AdaptorBaeldung {
  public static void main(String aargs[]) {
    Movable bugattiVeyron = new BugattiVeyron();
    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
    System.out.println(bugattiVeyronAdapter.getSpeed());
  }
}
