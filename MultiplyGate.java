import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MultiplyGate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MultiplyGate extends Gate
{
    /**
     * Act - do whatever the MultiplyGate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int value = Greenfoot.getRandomNumber(10)+1;
    Label label = new Label("x"+value,40);
    
    public MultiplyGate(){
        super("multiplyGate.png");
        super.setLabel(label);
    }
    public void removeLabel() {
        getWorld().removeObject(this.label);
    }
    
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
