import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version  (a version number or a date)
 */
public class Score extends Actor
{
    public static int score;
    public Score(){
        score = 0;
    }
    public void act()
    {
        World Florest = getWorld();
        Florest.showText("SCORE: " + String.valueOf(score), 60, 479);

    }
    public static void add(){
        score ++;
    }    
    
}
