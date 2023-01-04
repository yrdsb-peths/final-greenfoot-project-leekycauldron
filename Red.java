import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Red here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Red extends Actor
{
    /**
     * Act - do whatever the Red wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Lights up when mouse is hovered over
        if (Greenfoot.mouseMoved(this))
            setImage("red_pill_select.png");
        if (Greenfoot.mouseMoved(null) && !Greenfoot.mouseMoved(this))
            setImage("red_pill.png");
        
        // If clicked, the user has chosen to escape the matrix and the game begins.
        if (Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Intro());
        }
    }
}
