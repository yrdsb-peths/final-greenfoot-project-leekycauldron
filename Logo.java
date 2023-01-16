import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Logo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Logo extends Actor
{
    /**
     * Act - do whatever the Logo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GifImage gifImage = new GifImage("rocket.gif");
    
    public void act()
    {
      
        setImage(gifImage.getCurrentImage());
    }
}
