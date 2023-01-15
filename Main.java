import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where the main gameplay takes place,
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-15
 */
public class Main extends World
{

    /**
     * Constructor for objects of class Main.
     * 
     */
    
    public Main()
    {    
        super(400, 600, 1);
        prepare();
        
    }
    
    public void prepare() {
        // Set Background to complete darkness.
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());
        
        
        // Spawn in the player.
        Player player = new Player(20,2);
        addObject(player,getWidth()/2,getHeight()-75);
        
        
        // Add the stars
        for (int i = 0; i < 300; i++) {
            Star star = new Star();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(star,x,y);
        }
    }
    
    public void act() {
        
    }
}
