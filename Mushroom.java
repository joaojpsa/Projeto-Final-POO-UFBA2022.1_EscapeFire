import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Actor
{
    public Mushroom(){
        setImage("cogumelo.png");
    }
    private int velDown = 1;
    /**
     * Act - do whatever the Mushroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
        // Add your action code here.
    }
    public void fall(){
        setLocation(getX(), getY() + velDown);
        
        if(getY() >= 399){
            ((Florest) getWorld()).removeObject(this);
        }
        else if(isTouching(Parrot.class)){
            Greenfoot.playSound("sounds/eat.mp3");
            Score.add();
            ((Florest) getWorld()).removeObject(this);
        }
        
    }
    
}
