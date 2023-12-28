package view;

import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

/**
 * Class to create a Histogram chart.
 */
public class Histogram extends JPanel {
  int[] values;
  Color color;

  /**
   * Constructor for Histogram.
   * @param values the values for each pixel of either RGB.
   * @param color either Red, green or blue.
   */
  public Histogram(int[] values, Color color) {
    this.values = values;
    this.color = color;
  }

  /**
   * Draws a Histogram.
   * @param g the Graphics to draw on.
   */
  protected void paintComponent(Graphics g) {
    super.paintComponents(g);
    Graphics2D g2 = (Graphics2D) g;

    g2.setColor(Color.WHITE);

    int x = 1;
    int y = (int) this.getHeight();
    int max = -1;
    for (int i : values) {
      max = Math.max(max, i);
    }

    for (int i = 0; i < this.values.length; i++) {
      int height = (int) ((y - 5) * ((double) this.values[i] / max));
      g2.setColor(color);
      g2.draw3DRect(x + i, y - height,
              2,
              height, true);
    }
  }
}