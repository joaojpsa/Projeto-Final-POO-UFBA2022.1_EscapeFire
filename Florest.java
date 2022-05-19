import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)  * @version (a version number or a date)
 */
public class Florest extends World {
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Florest() {
        // Create a new world with 700x500 cells with a cell size of 1x1 pixels.
        //classe construtora de Florest
        super(700, 500, 1);
        addObject(new Score(), 25, 476);
        addObject(new Parrot(), 151, 196);
        setBackground("images/Fdia.png");
        playloop();
        
        

    }

    public void act() {
        // metodo atualiza as açoes do jogo, instanciando as classes       
        if (Greenfoot.getRandomNumber(500) < 1) {
            addObject(new Cloud(), 536, Greenfoot.getRandomNumber(91));
            addObject(new Fire(), 637, 331);
            addObject(new Vulture(), 570, 15);
            addObject(new Mushroom(), 470, 47);
                       
        }
        if (Greenfoot.getRandomNumber(600) < 1) {
            addObject(new Fire(), 606, 445);
            addObject(new Mushroom(), 250, 47);
            addObject(new Vulture(), 552, Greenfoot.getRandomNumber(91));

        }
        if (Greenfoot.getRandomNumber(700) < 2) {
            addObject(new Fire(), 615, 400);
            addObject(new Vulture(), 552, Greenfoot.getRandomNumber(90));
        }
        if (Greenfoot.getRandomNumber(700) < 1) {
            addObject(new Vulture(), 552, Greenfoot.getRandomNumber(95));
        }

    }
    
    public void playloop(){
        Greenfoot.playSound("sounds/theme.mp3");
    }

    public void gameOver() {
        //metodo pra chamar a classe GameOver
        addObject(new GameOver("Game Over!"), getWidth() / 2, getHeight() / 2);
        Greenfoot.playSound("sounds/end.wav");
        Greenfoot.stop();
        
    }
       
}
