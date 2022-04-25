import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud extends Actor
{
    /*construtor*/
    public Cloud(){
        setImage("images/cloud.png");
    }
    /**
     * Act - do whatever the Cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act(){
        setLocation(getX() -1, getY());
        if(getX() <= 15){
            ((Florest) getWorld()).removeObject(this);
        }
    }

}
