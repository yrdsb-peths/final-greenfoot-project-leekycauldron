import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Intro extends World
{

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
    int r = 33;
    int g = 13;
    int b = 64;
    public void prepare() {
        GreenfootImage background = getBackground();//Create Image
        background.setColor(new Color(r,g,b));//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        
        
        // Add the stars
        for (int i = 0; i < 300; i++) {
            Star star = new Star();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(star,x,y);
        }
        
    
        
    }
    
    public void act() {
        if (r < 255) {
            r+=2;
        } 
        if (g < 255) {
            g+=2;
        }
        if (b < 255) {
            b+=1;
        }
        GreenfootImage background = getBackground();
        background.setColor(new Color(r,g,b));//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        
    }
}
