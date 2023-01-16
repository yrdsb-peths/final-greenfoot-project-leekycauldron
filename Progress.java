import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Progress here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Progress extends Actor
{
    /**
     * Act - do whatever the Progress wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Progress() {
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(350, 50);
    }
    public void act()
    {
        Main world = (Main) getWorld();
        GreenfootImage image = getImage();
        setImage(image);
        image.scale((int)(350 * (double)(world.getTime()/60000.0)), 50);
    }
}
