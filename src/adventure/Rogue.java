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
public class Rogue extends Player{
    public Rogue(String name) {
        super("Sly ".concat(name), 80, 100, 80);
        super.setPlayerClass("Rogue");
    }
    @Override
    public void attack(Monster target){
        System.out.printf("%s throws a fireball at the %s\n", 
                getName(), target.toString());
        System.out.printf("%s loses %d HP\n", target.toString(), getAttackStrength());
        target.setHP(target.getHP() - getAttackStrength());
    }
}
