package jogen.core.display;

import java.util.Color;

import javax.swing.*;

public final class Display extends JFrame {
  private boolean fullscreen = false;
  
  public void setFullscreen(boolean b) {
    this.fullscreen = b;
    setUndecorated(fullscreen);
    if (fullscreen) setExtendedState(JFrame.MAXIMIZED_BOTH);
    if (!fullscreen) setExtendedState(JFrame.getExtendedState());
  }
  
  public void toggleFullScreen() {
    setFullscreen(!fullscreen);
  }
  
  public boolean isFullscreen() {
    return fullscreen;
  }
  
  public void clear() {
    JPanel blank = new JPanel().setBackgroundColor(Color.BLACK);
    setContentPane(blank);
  }
  
  public void showGUI(Gui gui) {
    setContentPane(gui);
  }
  
  public void init() {
    setFullscreen(true);
    setTitle(JoGEn.NAME);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }
}
