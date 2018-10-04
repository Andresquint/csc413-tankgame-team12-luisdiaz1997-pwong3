/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Image;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;

/**
 *
 * @author patri
 */
public class Collisions extends Sprite {

    
    private int id;
    private int[] position = new int[2];
    String sep = System.getProperty("file.separator");
    Image img = null;
    
   Collisions() {
        
    }
    public int[] getPosition() {
        return position;
    }
    
    public void setPosition(int[] position) {
        this.position = position;
    }
    
    public int getHealth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int[] getVelocity() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Image getImage() {
        img = new ImageIcon("images" + sep + "Explosion_small.gif").getImage();
        return img;
    }
   
    public void playSound()
    {
        File SmExp = new File("Explosion_small.wav");
        
        try{
            Clip smExp = AudioSystem.getClip();
            smExp.open(AudioSystem.getAudioInputStream(SmExp));
            smExp.start();
        }catch(Exception e){}
    }
}
