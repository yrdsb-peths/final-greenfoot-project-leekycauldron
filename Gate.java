import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Parent Class for each Gate.
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-18
 */
public class Gate extends Actor
{

    public Label l = new Label("",1);    
    public Gate(String image){
        GreenfootImage img = new GreenfootImage(image);
        img.scale(125, 125);
        setImage(img);
    }
    // Methods for deleting the label associated with the gate (shows value).
    public void setLabel(Label l) {
        this.l = l;
    }
    public void removeLabel() {
        getWorld().removeObject(this.l);
    }
    
    /**
     * Takes in current coordinates of gate and moves it down by a certain speed
     * determined by the world.
     */
    public void move(int x,int y) {
        Main world = (Main) getWorld();
        setLocation(x,y+world.worldSpeed);
    }
}
