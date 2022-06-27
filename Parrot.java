import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.World;
import java.util.logging.Logger;
/**
 * Write a description of class parrot here.
 * 
 * @author (João Paulo S. Abreu (joaoabreu@ufba.br), Mateus C. Moura
 *         (mateuschaves@ufba.br), Rafael P. Casaes Sampaio
 *         (rafael.casaes@ufba.br),
 *         Uanderson S. Celestino (uandersoncelestino@ufba.br), Lílian T. de
 *         Sousa (lilian.sousa@ufba.br), Jefferson Raimon de B. Silva
 *         (jefferson.raimon@ufba.br))
 * @version (a version number or a date)
 */
public class Parrot extends AllObjects {
    boolean shoot = true;
    private static final Logger log = Logger.getLogger(Parrot.class.getName());
    /* construtor */
    public Parrot() {
        setImage("pDireita.png");
    }

    /**
     * Act - do whatever the parrot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() {
        // chama os metodos da ação do objeto
        fall();
        isTouch();
        movers();
        shootMush();
    }

   
    // método para quando tocar nos objetos Fire e Vulture
    public void isTouch() {
        // condicionais utilizando metodo gameover através de getters e também chamando
        // o metodo de midia de som do Greenfoot
        try{if(isTouching(Fire.class) || isTouching(Vulture.class)) {
            Greenfoot.playSound("sounds/death.wav");
            ((Florest) getWorld()).gameOver();
            
        }
    }catch (SecurityException se) {
        //exceção caso não seja executado a condição
        log.info("ERRO AO EXECUTAR O JOGO");
    }
    
    }
    //metodo para atirar nos inimigos
    public void shootMush(){
        if(Greenfoot.isKeyDown("space") && shoot){
            Greenfoot.playSound("sounds/tiro.mp3");
            getWorld().addObject(new GunMush(), getX() - 3, getY());
            shoot = false;
        }
        else if(!Greenfoot.isKeyDown("space")){
            shoot = true;
        }
    }
    

}
