import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The title screen at the start of the game.
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-18
 */
public class Start extends World
{


    public Start()
    {    
        
        super(400, 600, 1);
        prepare();
    }
    
    
    private void prepare()
    {
        // Add in all the title elements.
        
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
    
    
    // Listen for keypresses to either start the game or show the tutorial.
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
