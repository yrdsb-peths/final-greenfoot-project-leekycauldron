import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Farmer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Farmer extends Actor
{
    /**
     * Act - do whatever the Farmer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed = 5;
    //GifImage gifImage = new GifImage("test.gif");
    public void act()
    {
        //setImage(gifImage.getCurrentImage());
        // Add your action code here.
        if(Greenfoot.isKeyDown("w")) {
            move(speed);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(-speed);
        }
        if (Greenfoot.isKeyDown("a")) {
            turn(-speed);
        }
        if (Greenfoot.isKeyDown("d")) {
            turn(speed);
        }
    }
}
