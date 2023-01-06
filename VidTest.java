import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class VidTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VidTest extends World
{

    /**
     * Constructor for objects of class VidTest.
     * 
     */
    GreenfootSound music = new GreenfootSound("ticktock.mp3");
    private SimpleTimer timer = new SimpleTimer();
    public VidTest()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        
    }
    private int frames = 755;
    int frame = 1;
    public void act() {
        if(frame < frames && this.timer.millisElapsed() > 18) {
            this.timer.mark();
            GreenfootImage bg = new GreenfootImage("tmp/"+frame+".jpg");
            bg.scale(800, 600);
            super.setBackground(bg);
            frame++;
            music.setVolume(20);
            music.playLoop();
            
        }
    }
}
