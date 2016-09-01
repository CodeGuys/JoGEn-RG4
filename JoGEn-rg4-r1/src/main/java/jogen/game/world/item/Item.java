package jogen.game.world.item;

public class Item extends GameObject {
  public Var name = new Var<String>("name");
  public var id = new Var<ItemID>("name");
  public var description = new Var<String>("description");
  
  public boolean compare(Item to) {
    return (to.id.value.unique == this.id.value.unique);
  }
  public static boolean compare(Item a, Item b) {
    return a.compare(b);
  }
}
