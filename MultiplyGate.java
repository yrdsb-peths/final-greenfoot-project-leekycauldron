import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Multiplies the money.
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-18
 */
public class MultiplyGate extends Gate
{
    // value that the money is multiplied by.
    int value = Greenfoot.getRandomNumber(10)+1;
    Label label = new Label("x"+value,40);
    
    public MultiplyGate(){
        super("multiplyGate.png");
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
        label = new Label("x"+this.value,40);
        
        getWorld().addObject (label, getX(), getY());
        
        move(getX(),getY());
        
        if(isTouching(Player.class)) {
            GreenfootSound music = new GreenfootSound("coin.mp3");
            music.setVolume(20);
            music.play();
            world.multiply(this.value);
            
        }
    }
}
