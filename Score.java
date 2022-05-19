import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version  (a version number or a date)
 */
public class Score extends Actor
{
    public static int ponto;
    public Score(){
        ponto = 0;
    }
    public void act()
    {
        World florest = getWorld();
        setImage("cogumeloMENOR.png");
        florest.showText("" + ponto, 60, 475);

    }
    public static void add(){
        ponto ++;
    }
    public int getPonto(int pontos){
        pontos = ponto;
        return pontos;
    }
    
}
