/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventure;

import java.util.ArrayList;

/**
 *
 * @author Leolen
 */
public class Player extends Unit implements PlayerBehaviour{
    private String name;
    private String playerClass;
    private int location;
    private ArrayList<Item> inventory;

    public Player(String name, int hp, int attackStrength, int defence) {
        super(hp, attackStrength, defence);
        this.name = name;
        playerClass = "dirty peasant";
        location = 0;
        inventory = new ArrayList<>(2);
    }
    
    public Player(String name){
        super(1, 1, 1);
        this.name = name;
        System.out.printf("You are %s, a %s\n", name, playerClass);
    }

    @Override
    public void move() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void attack(Monster target) {
        System.out.printf("%s attacks the %s\n", name, target.toString());
    }

    @Override
    public void pickUp(Item item) {        
        if(item instanceof Weapon){
            setAttackStrength(item.getModifierAmount() + getAttackStrength());
            System.out.printf("Player attack strength increased by: %d", 
                    item.getModifierAmount());
        }
        inventory.add(item);
        
    }
    
    public Item checkInventory(int index){
        return null;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the playerClass
     */
    public String getPlayerClass() {
        return playerClass;
    }

    /**
     * @param playerClass the playerClass to set
     */
    public void setPlayerClass(String playerClass) {
        this.playerClass = playerClass;
    }

    /**
     * @return the location
     */
    public int getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(int location) {
        this.location = location;
    }
    
}
