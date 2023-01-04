import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Blue extends Actor
{
    /**
     * Act - do whatever the Blue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Lights up when mouse is hovered over
        if (Greenfoot.mouseMoved(this))
            setImage("blue_pill_select.png");
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
            setImage("blue_pill.png");
            
        // If clicked, the user has chosen wrong, the world will fast forward through a "normal" lifestyle and end with a gravestone.
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new BlueWorld());
        }
    }
}
