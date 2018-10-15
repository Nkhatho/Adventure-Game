package adventure;

/**
 *
 * @author Leolen
 */
public class Wizard extends Player{
    
    public Wizard(String name) {
        super(name.concat(" the Mighty"), 50, 100, 50);
        super.setPlayerClass("wizard");
    }
    @Override
    public void attack(Monster target){
        System.out.printf("%s throws a fireball at the %s\n", 
                getName(), target.toString());
        System.out.printf("%s loses %d\n", target.toString(), getAttackStrength());
        target.setHp(target.getHp() - getAttackStrength());
    }
}
