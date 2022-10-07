/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MakeBoat;

import javax.swing.*;
/**
 *
 * @author DANIC
 */
public class MakeBoat extends JPanel {
    
    
    
    public static void main(String args[]){
        
    JFrame window = new JFrame("Boat");
        Canvas canvas = new Canvas();
 
       window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       window.setSize(ConfigBoat.WINDOW_W, ConfigBoat.WINDOW_H);
       window.add(canvas);
       window.pack();
       window.setResizable(false);
       window.setLocationRelativeTo(null);
       window.setVisible(true);
    }    
}



    





