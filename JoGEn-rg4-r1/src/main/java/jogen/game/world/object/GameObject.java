package jogen.game.world.object;

import jogen.variable.Var;
import jogen.game.world.object.data.render.RenderClass;
import jogen.game.world.object.data.location.Location;
import jogen.game.world.object.data.rotation.Rotation;
import jogen.game.world.object.data.composition.Composition;

public class GameObject {
  public Var location = new Var<Location>("location");
  public Var rotation = new Var<Rotation>("rotation");
  public Var compositoin = new Var<Composition>("composition");
  public Var render = new Var<RenderClass>("render");
}
