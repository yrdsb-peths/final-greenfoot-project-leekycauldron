import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Visual timer for the game.
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-18
 */
public class Progress extends Actor
{
    
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
        // Length is determined by time left.
        image.scale((int)(350 * (double)(world.getTime()/60000.0))+1, 50);
    }
}
