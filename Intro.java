import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{
    int r = 33;
    int g = 13;
    int b = 64;

    /**
     * Constructor for objects of class Intro.
     * 
     */
    public Intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    
    public void prepare() {
        GreenfootImage background = getBackground();//Create Image
        background.setColor(new Color(r,g,b));//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
    
    
        
    }
    
    public void act() {
        if (r > 0) {
            r--;
        } 
        if (g > 0) {
            g--;
        }
        if (b > 0) {
            b--;
        }
        GreenfootImage background = getBackground();
        background.setColor(new Color(r,g,b));//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
    
        if (r == 0 && g == 0 && b == 0) {
            Greenfoot.setWorld(new VidTest());
        }
    }
}
