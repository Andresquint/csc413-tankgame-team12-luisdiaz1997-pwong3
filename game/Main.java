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
import java.awt.Dimension;
import javax.swing.*;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.Sequencer;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Main
{
    
    public static void main(String[] args) throws MidiUnavailableException, FileNotFoundException, IOException, InvalidMidiDataException, UnsupportedAudioFileException, LineUnavailableException
    {
        Sequencer sequencer = MidiSystem.getSequencer();
        sequencer.open();
        InputStream music = new BufferedInputStream(new FileInputStream(new File("images/Music.mid")));
        sequencer.setSequence(music);
        sequencer.start();
        
        Map map = new Map("Tank Game");
        
        map.setPreferredSize(new Dimension(1280, 950));
        map.setMaximumSize(new Dimension(1280, 950));
        map.setMinimumSize(new Dimension(1280, 950));
        //map.pack();
        
        map.setResizable(false);
        
        map.run();
        
        
        map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
           
        
    }
    
}
