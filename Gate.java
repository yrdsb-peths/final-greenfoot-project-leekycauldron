import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gate extends Actor
{
    /**
     * Act - do whatever the Gate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Label l = new Label("",1);    
    public Gate(String image){
        GreenfootImage img = new GreenfootImage(image);
        img.scale(125, 125);
        setImage(img);
    }
    public void setLabel(Label l) {
        this.l = l;
    }
    public void removeLabel() {
        getWorld().removeObject(this.l);
    }
    
    public void move(int x,int y) {
        setLocation(x,y+2);
    }
}
