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
