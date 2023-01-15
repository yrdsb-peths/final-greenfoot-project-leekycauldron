import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The object that the player will control and move throughout the game.
 * Can be customized (speed, cosmetics, powers)
 * 
 * @author Bryson Lee-Kwen
 * @version 2023-01-15
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int value = 0;
    int speed = 0;
    Label label = new Label(value,40);
    public Player(int value, int speed) {
        this.speed = speed;
        this.value = value;
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(100, 100);
    }
    public void act()
    {
        // Listen for left and right arrow keys to move the player side to side.
        getWorld().removeObject(label);
        label = new Label(this.value,40);
        getWorld().addObject (label, getX(), getY()+20);
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX()-this.speed,getY());
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX()+this.speed,getY());
        }
    }
}
