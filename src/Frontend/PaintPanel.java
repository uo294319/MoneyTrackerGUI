/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frontend;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author angel
 */
public class PaintPanel extends JPanel {
    
    
    protected enum Shape {
        Line,
        Circle,
        Rectangle,
        Spiral;
    }
    
    private Color color;
    private Shape status;
    private int initX, initY, endX, endY;
    
    
    public PaintPanel() {
        super();
        this.status = Shape.Line;
        this.color = new Color(179,163,152);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
        switch(this.status)
        {
            case Line -> g.drawLine(initX, initY, endX, endY);
            case Circle -> this.drawCircle(g);
            case Rectangle -> this.drawRectangle(g);
            case Spiral -> drawSpiral(g);
        }
        
    }
    
    protected Color getColor() {
        return this.color;
    }
    
    protected void setColor(Color c) {
        this.color = c;
    }
        
    
    protected void setStaus(Shape s) {
        this.status = s;
    }
    
    protected void setInitPosition(int x, int y) {
        this.initX = x;
        this.initY = y;
    }
    
    protected void setEndPosition(int x, int y) {
        this.endX = x;
        this.endY = y;
    }
    
    private void drawCircle(Graphics g) {
        int varX = endX - initX;
        int varY = endY - initY;
        int r = (int) Math.round(Math.sqrt(varX * varX + varY * varY));
        g.fillOval(initX - r, initY - r, 2*r, 2*r);
        //g.drawOval(initX - r, initY - r, 2*r, 2*r);
    }
    
    private void drawRectangle(Graphics g) {
        int width = Math.abs(endX - initX);
        int height = Math.abs(endY - initY);
        int startX = (endX > initX) ? initX : endX;
        int startY = (endY > initY) ? initY : endY;

        g.fillRect(startX, startY, width, height);
    }

    private void drawSpiral(Graphics g) {
        int varX = Math.abs(endX - initX);
        int varY = Math.abs(endY - initY);
        int radius = (int) Math.round(Math.sqrt(varX * varX + varY * varY));
        for (int i = 0; i <= radius; i += 7) {
            g.drawArc(initX-i, initY-i, i*2, i*2, 0, 360);
        }
    }
    
}
