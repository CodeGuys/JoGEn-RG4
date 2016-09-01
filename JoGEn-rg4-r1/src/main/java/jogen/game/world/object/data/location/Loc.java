package jogen.game.world.object.data.location;

public class Loc {
  public Var x = new Var<double>("x");
  public Var y = new Var<double>("y");
  public Var z = new Var<double>("z");
  
  public Loc() {
    
  }
  
  public static double getDist(Loc a, Loc b) {
    return Math.sqrt(Math.sqr(b.x.value - a.x.value) + Math.sqr(b.y.value - a.y.value) + Math.sqr(b.z.value - a.z.value));
  }
  public double getDist(Loc b) {
    return getDist(this, b);
  }
}
