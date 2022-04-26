import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version  (a version number or a date)
 */
public class Score extends Actor
{
    
    /**
     * Act - do  whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int score;
    public Score(){
        score = 0;
    }
    public void act()
    {
        World Florest = getWorld();
        Florest.showText("SCORE: " + String.valueOf(score), 50, 379);
        
        
        // Add your action code here.
    }
    public static void add(){
        score ++;
    }    
    
}
