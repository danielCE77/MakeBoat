/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakeBoat;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.Timer;
/**
 *
 * @author DANIC
 */
public class Canvas extends JPanel implements ActionListener {
    ArrayList<BrushBoat> boats = new ArrayList<BrushBoat>();
    
    public Canvas(){
       setPreferredSize(new Dimension(ConfigBoat.WINDOW_W,ConfigBoat.WINDOW_H));
       setBackground(Color.CYAN);
       Timer timer = new Timer(90, this);
       timer.start();
       //125, 292, 200, 60
       boats.add(new BrushBoat(125, 292, 4, 0, Color.BLACK, 200,60));
    }
    
    
   @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //BrushBoat brushboat = new BrushBoat(g);
        //brushboat.drawSky();
        //brushboat.drawBoat();
        //paintbrush.drawTree();
        //paintbrush.drawTree(200,50);
        //paintbrush.drawTree(100,20);
        //paintbrush.drawTree(300,40);
        //paintbrush.drawTree(50,110);
        //paintbrush.drawTree(360,100);
        //paintbrush.drawTree(140,75); 
        
        //paintbrush.drawSun(pSun);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
