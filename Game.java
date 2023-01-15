import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{

    /**
     * Constructor for objects of class Game.
     * you 
     */
    int assets = 1500;
    int liabilities = 500;  
    int value = assets - liabilities;
    
    public int getValue() {
        this.value = this.assets - this.liabilities;
        return this.value;
    }
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Label statusLabel = new Label("Value: $" + getValue(),33);
        addObject(statusLabel,getWidth()/2,20);
        
        
        
        Farm farm = new Farm();
        addObject(farm,200,200);
        
        Farmer farmer = new Farmer();
        addObject(farmer,getWidth()/2,getHeight()/2);
    }
}
