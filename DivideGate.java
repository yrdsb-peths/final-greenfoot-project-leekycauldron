import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DivideGate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class DivideGate extends Gate
{
    /**
     * Act - do whatever the DivideGate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int value = Greenfoot.getRandomNumber(5) + 1;
    Label label = new Label("÷"+value,40);
    
    public DivideGate(){
        super("divideGate.png");
        super.setLabel(label);
    }
    public void removeLabel() {
        getWorld().removeObject(this.label);
    }
    
    public void act()
    {
        Main world = (Main) getWorld();
        
        world.removeObject(label);
        label = new Label("÷"+this.value,40);
        
        getWorld().addObject (label, getX(), getY());
        
        move(getX(),getY());
        
        if(isTouching(Player.class)) {
            GreenfootSound music = new GreenfootSound("damage.mp3");
            music.setVolume(20);
            music.play();
            world.divide(this.value);
        }
    }
}
