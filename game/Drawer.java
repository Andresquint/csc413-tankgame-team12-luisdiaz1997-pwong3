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
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Drawer extends JPanel
{
    private int delay;
    Image img = null;
    BufferedImage bg = null;
    Timer timer;
    int velx = 2;
    int posx = 200;
    ArrayList<Sprite> list;
  
    
    public Drawer(ArrayList<Sprite> list)
    {
        super();
       
        this.list = list;
        this.setSize(new Dimension(1280, 744));
        
        this.setBackground(Color.BLACK);
        this.setVisible(true);
        delay = 5;
        timer = new Timer(delay, gameTimer);
        
        timer.start();
        try{
            bg = ImageIO.read(getClass().getResource("/images/Background.png"));            
        }catch (IOException ex){
            System.out.println("background not loaded");
        }
        //System.out.println("Here");
        
        
            
       
    }
    
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.yellow);
        super.paintComponent(g);
        for(int i=0; i<1280; i+=320){
            for(int j=0; j<720; j+=240){
                g.drawImage(bg, i, j,null);
            }
        }
        Map.Events();
        Map.fillArray();
        for (Sprite a: list)
        {
            g.drawImage(a.getImage(), a.getPosition()[0],a.getPosition()[1], this );
            //System.out.println("HEre");
            
            
        }
        g.setFont(new Font("Arial", Font.BOLD,30) );
        g.drawString("Tank 1", 10, 760);
        g.drawString("Score: " + Map.tank.get(0).getScore(), 10, 790);
        g.drawString("Health: " + Map.tank.get(0).getHealth(), 10, 820);
        g.drawString("Shield: " + Map.tank.get(0).getShield(), 10, 850);
        g.drawString("Lives: " + Map.tank.get(0).getLives(), 10, 880);
        
        
        g.drawString("Tank 2", 1090, 760);
        g.drawString("Score: " + Map.tank.get(1).getScore(), 1090, 790);
        g.drawString("Health: " + Map.tank.get(1).getHealth(), 1090, 820);
        g.drawString("Shield: " + Map.tank.get(1).getShield(), 1090, 850);
        g.drawString("Lives: " + Map.tank.get(1).getLives(), 1090, 880);
        
        if((Map.tank.get(0).getLives()==0||Map.tank.get(1).getLives()==0))
        {
            int highScore = 0;
            int tankID = 3;
            if(Map.tank.get(0).getScore()>Map.tank.get(1).getScore())
            {
                highScore = Map.tank.get(0).getScore();
                tankID = Map.tank.get(0).getTankID();
            }
            else
            {
                highScore = Map.tank.get(1).getScore();
                tankID = Map.tank.get(1).getTankID();
            }
            g.setFont(new Font("Arial", Font.BOLD,80) );
            g.drawString("GAME OVER", 400, 200);
            g.drawString("Tank "+ tankID + " wins", 400, 300);
        }
        
        
        //g.drawRect(50, 50, 50, 50);
        //g.drawImage(img, posx, 200,this);
        
    }
    public void redraw()
    {
        this.repaint();
        
    }

    ActionListener gameTimer = new ActionListener(){
        
        @Override
        public void actionPerformed(ActionEvent evt)
        {
            
            redraw();
        }
    };
    
    
    

    
}
