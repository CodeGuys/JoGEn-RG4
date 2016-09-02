package jogen.game.world;

public class World {
  public String name;
  public String path;
  
  public ArrayList<GameObject> objects = new ArrayList<GameObject>();
  public ArrayList<Item> items = new ArrayList<Item>();
  public ArrayList<Character> characters = new ArrayList<Character>();
  
  public World(String name, String path) {
    this.name = name;
    this.path = path;
  }
}
