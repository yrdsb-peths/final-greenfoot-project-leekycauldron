import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tutorial here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tutorial extends World
{

    /**
     * Constructor for objects of class Tutorial.
     * 
     */
    public Tutorial()
    {    
        super(400, 600, 1);
        prepare();
    }
    
    public void prepare(){
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        
        Label title = new Label("How To Play: ", 69); 
        addObject(title,getWidth()/2,50);
        
        Player player = new Player(20,2);
        addObject(player,getWidth()/6,150);
        
        Label move = new Label("Press a/left to go left \nand d/right to go right. Try it!",33);
        addObject(move,getWidth()/2,250);
        
        Label objective = new Label("You have 60 seconds to \nget as much money as you can by\n going through various gates. \nEach gate will either add/subtract/divide/multiply to\n your amount",22);
        addObject(objective,getWidth()/2,400);
        
        Label back = new Label("Type [1] to return.",33);
        back.setFillColor(Color.RED);
        addObject(back,getWidth()/2,530);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("1")) {
            Start start = new Start();
            Greenfoot.setWorld(start);
        }
    }
}
