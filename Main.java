import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
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
    public boolean respawn = false;
    public boolean gates = true;
    public int worldSpeed = 3;
    public int playerSpeed = 4;
    public boolean damage = false;
    private SimpleTimer timer = new SimpleTimer();
    private SimpleTimer dTimer = new SimpleTimer();
    Damage d = new Damage();
    int tens = 0;
    public Main()
    {    
        super(400, 600, 1);
        prepare();
        
    }
    
    public void gameOver() {
        End end = new End();
        Greenfoot.setWorld(end);
    }
    
    
    public void respawn() {
        
        
        for(int i =0; i < 3;i++){
            Gate gate = getObjects(Gate.class).get(0);
            gate.removeLabel();
            removeObject(gate);
        }
        
        
        
        spawnGates();
        
    }
    public void add(int n) {
        getObjects(Player.class).get(0).value += n;
        respawn();
    }
    
    public void minus(int n) {
        this.damage = true;
        addObject(this.d,getWidth()/2,getHeight()/2);
        this.dTimer.mark();
        getObjects(Player.class).get(0).value -= n;
        respawn();
    }
    public void multiply(int n) {
        getObjects(Player.class).get(0).value *= n;
        respawn();
    }
    public void divide(int n) {
        this.damage = true;
        addObject(this.d,getWidth()/2,getHeight()/2);
        this.dTimer.mark();
        getObjects(Player.class).get(0).value /= n;
        respawn();
    }
    public int getGate(){
        return Greenfoot.getRandomNumber(4);
    }
    
    public int getTime() {
        return 60000 - this.timer.millisElapsed();
    }
    
    
    public void spawnGates() {
        // TODO: make at least one gate above zero.
        for(int i = 0; i < 3;i++ ){
            
            if (getGate() == 0){
                MinusGate gate = new MinusGate();
                addObject(gate,75 + (125*i),75);
            }
            else if (getGate() == 1){
                PlusGate gate = new PlusGate();
                addObject(gate,75 + (125*i),75);
            }
            else if (getGate() == 2){
                MultiplyGate gate = new MultiplyGate();
                addObject(gate,75 + (125*i),75);
            }
            else{
                DivideGate gate = new DivideGate();
                addObject(gate,75 + (125*i),75);
            }
            
            
        }
    }
    
    public void prepare() {
        // Set Background to complete darkness.
        GreenfootImage background = getBackground();
        background.setColor(Color.BLACK);//Add Background color
        background.fillRect(0,0,getWidth(),getHeight());

        // Spawn in the player.
        Player player = new Player(20,this.playerSpeed);
        addObject(player,getWidth()/2,getHeight()-75);

        // Add the stars
        for (int i = 0; i < 300; i++) {
            Star star = new Star();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(star,x,y);
        }
        // Add the gates
        spawnGates();
        
        
        // Add the progress bar (timer).
        Progress p = new Progress();
        addObject(p,getWidth()/2,40);
   
    }
    
    public void act() {
        if(getObjects(Player.class).get(0).value <= 0 
        || this.timer.millisElapsed() >= 59999){
            gameOver();   
        }
        
        if(damage && this.dTimer.millisElapsed() >= 1000){
            damage = false;
            removeObject(d);
        }
        
        if(this.timer.millisElapsed() / 10000 > this.tens) {
            this.tens = this.timer.millisElapsed() / 10000;
            this.playerSpeed++;
            getObjects(Player.class).get(0).setSpeed(this.playerSpeed);
            this.worldSpeed++;
        }

    }
}
