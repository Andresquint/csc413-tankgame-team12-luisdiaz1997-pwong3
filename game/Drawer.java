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
import java.awt.event.*;
import javax.swing.*;

public class Drawer extends JPanel
{
    private int delay;
    Image img = null;
    Timer timer;
    int velx = 2;
    int posx = 200;
    public Drawer()
    {
        super();
        this.setPreferredSize(new Dimension(800, 600));
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        delay = 5;
        timer = new Timer(delay, gameTimer);
        timer.start();
        String sep = System.getProperty("file.separator");
        System.out.println("Here");
        img = new ImageIcon("src"+sep + "images"+ sep +"Tank1.gif").getImage();
        
            
       
    }
    
    public void paintComponent(Graphics g)
    {
        
        super.paintComponent(g);
        g.setColor(Color.yellow);
        g.drawRect(50, 50, 50, 50);
        g.drawImage(img, posx, 200,this);
        
    }
    public void redraw()
    {
        updatePos();
        this.repaint();
        
    }
    public void updatePos()
    {
        
    }
    ActionListener gameTimer = new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            
            redraw();
        }
    };
    
    
    

    
}
