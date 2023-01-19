import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * End screen that changes display depending if they win or lose..
 * 
 * @author Bryson Lee-Kwen
 * @version 2022-01-18
 */
public class End extends World
{

    // Constructor for loss screen (no value provided)
    public End()
    {    
        super(400, 600, 1);
        // Set Background to complete darkness.
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        
        
        Label title = new Label("Game Over",60);
        title.setFillColor(Color.RED);
        addObject(title,getWidth()/2,100);
        prepare();
    }
    
    // Constructor for win screen (when a value is provided)
    public End(int val)
    {
       super(400, 600, 1);
        // Set Background to complete darkness.
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        
        
        Label title = new Label("You won! \n Escaped with: \n$"+val,60);
        title.setFillColor(Color.GREEN);
        addObject(title,getWidth()/2,100); 
        prepare();
    }
    
    // Show next options.
    public void prepare() {
        Label begin = new Label("Play Again - [1]", 33);
        addObject(begin,getWidth()/2,getHeight()/2);

        Label tut = new Label("Return to Title - [2]", 33);
        addObject(tut,getWidth()/2,getHeight()/2+50);
    }
    
    // Listen for button presses.
    public void act() {
        // replay
        if(Greenfoot.isKeyDown("1")) {
            Main main = new Main();
            Greenfoot.setWorld(main);
        }
        // return to title
        else if (Greenfoot.isKeyDown("2")) {
            Start start = new Start();
            Greenfoot.setWorld(start);
        }
    }
}
