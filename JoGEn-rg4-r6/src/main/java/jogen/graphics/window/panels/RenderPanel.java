package jogen.graphics.window.panels;

import javax.swing.*;
import javax.media.j3d.*;

public class RenderPanel extends JPanel implements Runnable {
  private VirtualUniverse universe;
  private Thread thread;
  private boolean running;
  
  public RenderPanel(VirtualUniverse universe) {
    this.universe = universe;
    thread = new Thread(this);
  }
  
  public void start() {
    if (running) return;
    thread.start();
    running = true;
  }
  public void stop() {
    if (!running) return;
    try {
      thread.join();
    }
    running = false;
  }
  
  public void run() {
    tick();
    render();
  }
  
  public void tick() {
    
  }
  public void render() {
    
  }
}
