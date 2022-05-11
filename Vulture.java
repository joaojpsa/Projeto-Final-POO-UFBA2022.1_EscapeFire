import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A classe Vulture define os objetos antagonistas
 * Do game 
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
       //Setlocation recebe o x e o y pelo get modificando o x pra menos 1
        setLocation(getX() -1, getY());
        if(getX() <= 15){
            //Se o getx for menor ou igual a 15 destruir o objeto vulture
            ((Florest) getWorld()).removeObject(this);
        }
    }
}
