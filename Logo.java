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
    boolean full = false;
    int w = 1;
    int h = 1;
    GreenfootSound music = new GreenfootSound("title.mp3");
    public Logo(){
        GreenfootImage image = new GreenfootImage("logo.png");
        setImage(image);
        image.scale(w, h);
    }
    public void endMusic() {
        music.stop();
    }
    public void act()
    {
        // Add your action code here.
        if(!full){
            w+=10;
            h+=10;
            GreenfootImage image = new GreenfootImage("logo.png");
            setImage(image);
            image.scale(w, h);
            if(w >= 300){
                full = true;
                
                music.setVolume(20);
                music.playLoop();
            }
        }
    }
}
