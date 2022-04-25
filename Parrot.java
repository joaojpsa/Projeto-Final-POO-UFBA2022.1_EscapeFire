import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class parrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Parrot extends Actor
{
    /*construtor*/
    public Parrot(){
        setImage("parrot.png");
    }
    private int up = 7;
    private int velDown = 1;
    private int score;
    
    private boolean isburned = false;
    private boolean isvulturetouch = false;
    
    
    /**
     * Act - do whatever the parrot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        fall();
        isBurned();
        isVultureTouch();
        moveParrot();
        /*if(Greenfoot.mousePressed(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            int mouseX = mouse.getX();
            int myX = this.getX();
            if(mouseX > myX){
                move(+15);
            }
            if(mouseX < myX){
                move(-15);
            }
        }*/
    }
   
    
    private void moveParrot(){
        if(Greenfoot.isKeyDown("right")){
            move(+ 1);
        }
         if(Greenfoot.isKeyDown("left")){
            move(-1);
        }
        if(Greenfoot.isKeyDown("up")){
            moveUp();
        }
        
    }
    
    public void fall(){
        setLocation(getX(), getY() + velDown);
    }
    
    public void moveUp(){
        setLocation(getX(), getY() - up);
    }
    
    public void isBurned(){
        isburned = true;
        if(isTouching(Fire.class)){
            Greenfoot.playSound("sounds/death.wav");
            ((Florest) getWorld()).gameOver();
        }
    }
    
    public void isVultureTouch(){
        isvulturetouch = true;
        if(isTouching(Vulture.class)){
            Greenfoot.playSound("sounds/death.wav");
            ((Florest) getWorld()).gameOver();
        }
    }
    
    
   
    
    
}
