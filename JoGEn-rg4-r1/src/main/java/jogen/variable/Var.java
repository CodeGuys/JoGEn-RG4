/*
  not sure if I implemented this correctly. If anyone knows
  how to properly do what I'm trying to do, please tell me.
  you can email me at johnkayne.codeguys@gmail.com.
  
  I'm trying to make a variable class that can be defined for
  any variable type (Var variable = new Var<String>("variable");)
*/

package jogen.variable;

public class Var<Class c> {
  String name;
  Object value;
  
  public Var<Class c>(String name) {
    this.name = name;
    value = null;
  }
  
  public void set(Object value) {
    this.value = value;
  }
  public void wipe() {
    value = null;
  }
  public static void wipe(Var v) {
    v.wipe();
  }
}
