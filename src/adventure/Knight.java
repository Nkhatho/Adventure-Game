package adventure;

/**
 *
 * @author Leolen
 */
public class Knight extends Player{
    
    public Knight(String name) {
        super("Sir ".concat(name), 150, 100, 150);         
        super.setPlayerClass("Knight");
    }
    
    @Override
    public void attack(Monster target){
        System.out.printf("%s swings his sword at the %s\n", getName(), target.toString());
        System.out.printf("%s loses %d HP\n", target.toString(), getAttackStrength());
        target.setHP(target.getHP() - getAttackStrength());
    }
    
}
