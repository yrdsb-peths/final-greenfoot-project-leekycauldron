import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Logo GIF for the title Screen.
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-18
 */
public class Logo extends Actor
{
    
    GifImage gifImage = new GifImage("rocket.gif");
    
    public void act()
    {
      
        setImage(gifImage.getCurrentImage());
    }
}
