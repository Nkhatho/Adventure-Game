/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

/**
 *
 * @author Leolen
 */
public abstract class Unit {
    private int hp;
    private int attackStrength;
    private int defence;
    
    public Unit(int hp, int attackStrength, int defence){
        this.hp = hp;
        this.attackStrength = attackStrength;
        this.defence = defence;
    }

    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the attackStrength
     */
    public int getAttackStrength() {
        return attackStrength;
    }

    /**
     * @param attackStrength the attackStrength to set
     */
    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }

    /**
     * @return the defence
     */
    public int getDefence() {
        return defence;
    }

    /**
     * @param defence the defence to set
     */
    public void setDefence(int defence) {
        this.defence = defence;
    }
}
