package adventure;

import com.sun.glass.events.KeyEvent;

/**
 *
 * @author Leolen
 */
public class Potion extends Item{
    private boolean consumed;
    public Potion() {
        super("defence", 10000);
        consumed = false;
        super.setConsumable(true);
        super.setName("potion of fire resistance");
    }
    public int consume(){
        if(consumed)
            return 0;
        
        consumed = true;
        System.out.println("*gulp gulp gulp*");
        return super.getModifierAmount();
    }
}
