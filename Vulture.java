import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class vulture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vulture extends Actor
{
    /*construtor*/
    public Vulture(){
        setImage("urubu.png");
    }
    /**
     * Act - do whatever the vulture wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        setLocation(getX() -1, getY());
        if(getX() <= 15){
            ((Florest) getWorld()).removeObject(this);
        }
    }
}
