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
public class Wall {
    private int[][] fixedWall = new int [40][40];
    private int[][] destWall = new int [40][40];

    public int[][] getFixedWall() {
        return fixedWall;
    }

    public void setFixedWall(int[][] fixedWall) {
        this.fixedWall = fixedWall;
    }

    public int[][] getDestWall() {
        return destWall;
    }

    public void setDestWall(int[][] destWall) {
        this.destWall = destWall;
    }
    
    
    
}
