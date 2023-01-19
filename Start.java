import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends World
{

    /**
     * Constructor for objects of class Start.
     * 
     */
    public Start()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(400, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Logo l = new Logo();
        addObject(l,50,80);

        Title t = new Title();
        addObject(t,225 ,80);

        Label begin = new Label("Play Now - [1]", 33);
        addObject(begin,getWidth()/2,getHeight()/2);

        Label tut = new Label("How to Play - [2]", 33);
        addObject(tut,getWidth()/2,getHeight()/2+50);
        
        // Play background music
        GreenfootSound music = new GreenfootSound("winter.mp3");
        music.setVolume(10);
        music.playLoop();


    }
    
    public void act() {
        if(Greenfoot.isKeyDown("1")) {
            Main main = new Main();
            Greenfoot.setWorld(main);
        }
        else if (Greenfoot.isKeyDown("2")) {
            Tutorial tut = new Tutorial();
            Greenfoot.setWorld(tut);
        }
    }
}
