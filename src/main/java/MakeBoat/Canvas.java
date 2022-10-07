/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakeBoat;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
/**
 *
 * @author DANIC
 */
public class Canvas extends JPanel {
    
    public Canvas(){
       setPreferredSize(new Dimension(ConfigBoat.WINDOW_W,ConfigBoat.WINDOW_H));
       setBackground(Color.CYAN);
    }
    
    
   @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        BrushBoat brushboat = new BrushBoat(g);
        brushboat.drawSky();
        brushboat.drawBoat();
        //paintbrush.drawTree();
        //paintbrush.drawTree(200,50);
        //paintbrush.drawTree(100,20);
        //paintbrush.drawTree(300,40);
        //paintbrush.drawTree(50,110);
        //paintbrush.drawTree(360,100);
        //paintbrush.drawTree(140,75); 
        
        //paintbrush.drawSun(pSun);
    }
    
}
