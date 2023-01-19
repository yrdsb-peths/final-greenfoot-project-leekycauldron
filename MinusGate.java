import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Subtracts the money.
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-18
 */
public class MinusGate extends Gate
{
    // value that the money is subtracted by.
    int value = Greenfoot.getRandomNumber(10) +1;
    Label label = new Label("-"+value,40);
    public MinusGate() {
        super("minusGate.png");
        super.setLabel(label);
    }
    public void removeLabel() {
        getWorld().removeObject(this.label);
    }
    
    
    // Move down towards the bottom, while also checking if it hit the player.

    public void act()
    {
        
        Main world = (Main) getWorld();
        
        world.removeObject(label);
        label = new Label("-"+this.value,40);
        
        getWorld().addObject (label, getX(), getY());
        
        move(getX(),getY());
        
        if(isTouching(Player.class)) {
            GreenfootSound music = new GreenfootSound("damage.mp3");
            music.setVolume(20);
            music.play();
            world.minus(this.value);
            
        }
        
    
    }
}
