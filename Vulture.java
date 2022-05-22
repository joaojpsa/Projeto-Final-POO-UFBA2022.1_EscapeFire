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
        //chama a imagem referente a classe, através de setter
        setImage("urubu.png");
    }
    /**
     * Act - do whatever the vulture wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(){
        //método usado para movimentar o objeto horizontalmente(X), sendo da direita para esquerda(-1)
        setLocation(getX() -1, getY());
        //condicional para remover objeto na posição <=15px
        if(getX() <= 15){
            ((Florest) getWorld()).removeObject(this);
        }
    }
}
