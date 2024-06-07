import java.awt.*;
import java.awt.event.*;

public class AWTHallo extends Frame {
  public AWTHallo() {
    setTitle("AWT Hallo Welt"); // Fenstertitel setzen
    setSize(400, 100); // Fenstergröße einstellen
    addWindowListener(new TestWindowListener()); // EventListener für das Fenster hinzufügen
                                                 // (notwendig, damit das Fenster geschlossen werden kann)
    setVisible(true); // Fenster (inkl. Inhalt) sichtbar machen
  }

  class TestWindowListener extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
      e.getWindow().dispose(); // Fenster "killen"
      System.exit(0); // VM "killen"
    }
  }

  public static void main(String args[]) {
    new AWTHallo();
  }
}