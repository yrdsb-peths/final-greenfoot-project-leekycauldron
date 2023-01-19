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

    public int value = 0;
    int speed = 0;
    Label label = new Label(value,40);
    
    // Used to create moving motion (back and forth).
    boolean forward = true; 
    long last = System.currentTimeMillis();
    
    // Costumes 
    String[] costumes = {"rocket1.png","rocket2.png","rocket3.png"};
    int cIdx = 1;
    
    public Player(int value, int speed) {
        this.speed = speed;
        this.value = value;
        GreenfootImage image = getImage();
        setImage(image);
        image.scale(90, 130);
    }
    
    // Used to update the speed.
    // updated by one every 10 seconds.
    public void setSpeed(int s) {
        this.speed = s;
    }
    
    
    public void act()
    {
        // Listen for left and right arrow keys to move the player side to side.
        getWorld().removeObject(label);
        label = new Label("$" + this.value,40);
        label.setFillColor(Color.GREEN);
        getWorld().addObject (label, getWorld().getWidth()/2, getWorld().getHeight()-20);
        if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            setLocation(getX()-this.speed,getY());
        }
        if(Greenfoot.isKeyDown("right") || Greenfoot.isKeyDown("d")) {
            setLocation(getX()+this.speed,getY());
        }
        
        // Set Costume
        int x = cIdx %10;
        if(x < 3) {
            GreenfootImage image = new GreenfootImage(costumes[x]);
            setImage(image);
            image.scale(90, 130);
        }
        
        cIdx++;
        
        // Move forward and back every 1 second to create moving illusion.
        if (forward){
            setLocation(getX(),getY()+(this.speed/3));
        } else {
            setLocation(getX(),getY()-(this.speed/3));
        }
        if(System.currentTimeMillis() - last > 1000) {
            last = System.currentTimeMillis();
            forward = !forward;
        }
        
        
        
    }
}
