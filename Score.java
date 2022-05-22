import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version  (a version number or a date)
 */
public class Score extends Actor
{
    //variavel para somar os pontos
    public static int ponto;
    //método construtor
    public Score(){
        ponto = 0;
    }
    public void act()
    {
        //instancia o objeto na posição escolhida utilizando florest do tipo World, usa setter para colocar uma imagem
        World florest = getWorld();
        setImage("cogumeloMENOR.png");
        florest.showText("" + ponto, 60, 475);

    }
    //método para contar os pontos
    public static void add(){
        ponto ++;
    }
    
}
