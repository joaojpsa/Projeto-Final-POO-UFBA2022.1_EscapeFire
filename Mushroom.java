import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mushroom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mushroom extends Actor
{
    //Contrutor do Mushroom
    public Mushroom(){
        setImage("cogumelo.png");
    }
    //variavel usada no metodo fall(cair)
    private int velDown = 1;
    /**
     * Act - do whatever the Mushroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        //metodo para o cogumelo cair a cada "velDown" determinado
        fall();
        // Add your action code here.
    }
    public void fall(){
        //metodo para fazer o cogumelo cair do ceu
        setLocation(getX(), getY() + velDown);
        //condicional para remover objeto na posição >= 499px
        if(getY() >= 499){
            ((Florest) getWorld()).removeObject(this);
        }
        else if(isTouching(Parrot.class)){
            //metodo para chamar midia de som
            Greenfoot.playSound("sounds/eat.mp3");
            //serve para instanciar a variavel ponto da classe Score
            Score.add();
            // se o papagaio tocar no cogumeloremove o mesmo
            ((Florest) getWorld()).removeObject(this);
        }
        
    }
    
}
