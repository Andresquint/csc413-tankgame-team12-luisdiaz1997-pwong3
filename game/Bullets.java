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
public class Bullets {
    private int[] velocity = new int [2];
    private int[] position = new int [2];
    private int damage;

    public int[] getVelocity() {
        return velocity;
    }

    public void setVelocity(int[] velocity) {
        this.velocity = velocity;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
}
