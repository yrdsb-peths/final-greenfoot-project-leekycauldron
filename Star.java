import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * One of hundreds of stars in the game background.
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-18
 */
public class Star extends Actor
{
    
    int interval = 0;
    private SimpleTimer timer = new SimpleTimer();
    private boolean sparkle = false;
    public Star(){
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(1, 1);
        interval = 1000 + Greenfoot.getRandomNumber(10000);
        this.timer.mark();
    }
    public void act()
    {
        // Sparkles every x seconds for exactly half a second.
        
        if(!sparkle && this.timer.millisElapsed() > interval) {
            sparkle = true;
            this.timer.mark();
            GreenfootImage img = new GreenfootImage("sparkle.png");
            img.scale(3, 3);
            setImage(img);
        }
        else if (sparkle && this.timer.millisElapsed() > 500) {
            sparkle = false;
            GreenfootImage img = new GreenfootImage("circle.png");
            img.scale(1, 1);
            setImage(img);
        }
        
        // Move to the bottom then back to the top to create a moving illusion.
        setRotation(270);
        Main world = (Main) getWorld();
        move(world.worldSpeed*-1);
        if(isAtEdge()) {
            setLocation(getX(),0);
        }
    }
    
}