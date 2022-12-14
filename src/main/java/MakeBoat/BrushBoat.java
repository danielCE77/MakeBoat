/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakeBoat;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author DANIC
 */
public class BrushBoat extends Vehicle {
    /*private final Graphics g;
    
    public BrushBoat(Graphics g){
        this.g = g;
    }*/
    private int w,h;
    
    public BrushBoat(int x, int y, int speedX, int speedY, Color color, int w, int h){
        super(x, y, speedX, speedY, color);
        this.w = w;
        this.h = h;
    }
    /*public void drawSky(){
        g.setColor(Color.CYAN);
        g.fillRect(0,0, 400, 100);
    }*/
    
    public void drawBoat(Graphics g){
        g.setColor(this.getColor());
        //g.fillPolygon(ConfigBoat.BASE_X, ConfigBoat.BASE_Y, 4);
        g.fillRect(getDot().getX(), getDot().getY(), w, h);
        g.setColor(Color.WHITE);
        g.fillPolygon(ConfigBoat.PUNTOS_VELAS_X, ConfigBoat.PUNTOS_VELAS_Y, 3);
        g.fillPolygon(ConfigBoat.PUNTOS_VELAS2_X, ConfigBoat.PUNTOS_VELAS2_Y, 3);
        g.setColor(ConfigBoat.COLOR_BROWN);
        g.fillPolygon(ConfigBoat.PUNTOS_MASTIL_X, ConfigBoat.PUNTOS_MASTIL_Y, 4);
        g.setColor(Color.blue);
        g.fillRect(0,0, 500 , 150);
        
    }
}
