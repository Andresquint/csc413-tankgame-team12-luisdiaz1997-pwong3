/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisf
 */
package game;
import java.awt.*;
import javax.swing.*;
public class Map extends JFrame
{
    
    public Map(String input)
    {
        super(input);   
    }
    
    public void run()
    {
        this.addPanel();
        this.setVisible(true);
    }
   
    public void addPanel ()
    {
        Drawer draw = new Drawer();
        this.add(draw);
       
    }
    
}
