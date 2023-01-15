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
        
        Player player = new Player(20,2);
        addObject(player,getWidth()/2,getHeight()-75);
    }
}
