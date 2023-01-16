import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    /**
     * Act - do whatever the Star wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        // Add your action code here.
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
        setRotation(270);
        Main world = (Main) getWorld();
        move(world.worldSpeed*-1);
        if(isAtEdge()) {
            setLocation(getX(),0);
        }
    }
    
}