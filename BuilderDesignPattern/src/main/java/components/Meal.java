package components;

import interfaces.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
  private List<Item> items = new ArrayList<Item>();

  public Meal addItem(Item item) {
    items.add(item);
    return this;
  }

  public float getCost() {
    return items.stream()
            .map(x -> x.price())
            .reduce(0f, Float::sum);
  }

  public void showItems() {
    items.stream().forEach(item -> {
      System.out.print("Item : " + item.name());
      System.out.print(", Packing : " + item.packing().pack());
      System.out.println(", Price : " + item.price());
    });
  }
}
