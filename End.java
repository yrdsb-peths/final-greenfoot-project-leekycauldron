import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends World
{

    /**
     * Constructor for objects of class End.
     * 
     */
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
    }
}
