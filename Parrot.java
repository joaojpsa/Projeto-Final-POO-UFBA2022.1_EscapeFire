import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class parrot here.
 * 
 * @author (João Paulo S. Abreu (joaoabreu@ufba.br), Mateus C. Moura
 *         (mateuschaves@ufba.br), Rafael P. Casaes Sampaio
 *         (rafael.casaes@ufba.br),
 *         Uanderson S. Celestino (uandersoncelestino@ufba.br), Lílian T. de
 *         Sousa (lilian.sousa@ufba.br), Jefferson Aimon de B. Silva
 *         (jefferson.raimon@ufba.br))
 * @version (a version number or a date)
 */
public class Parrot extends AllObjects {
    /* construtor */
    public Parrot() {
        setImage("pDireita.png");
    }

    private int up = 7;
    private int velDown = 1;

    /**
     * Act - do whatever the parrot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // chama os metodos da ação do objeto
        fall();
        isTouch();
        moveParrot();

    }

    // método para movimentar o papagaio(direita, esquerda, para cima)
    private void moveParrot() {

        if (Greenfoot.isKeyDown("right")) {
            move(+1);
            setImage(new GreenfootImage("pDireita.png"));
        }

        if (Greenfoot.isKeyDown("left")) {
            move(-1);
            setImage(new GreenfootImage("pEsquerda.png"));
        }

        if (Greenfoot.isKeyDown("up")) {
            moveUp();
        }

    }

    // movimenta para baixo(Y). É chamado no metodo act, tornando automático a
    // descida
    public void fall() {
        setLocation(getX(), getY() + velDown);
    }

    // movimenta para cima(Y)
    public void moveUp() {
        setLocation(getX(), getY() - up);
    }

    // método para quando tocar nos objetos Fire e Vulture
    public void isTouch() {
        // condicionais utilizando metodo gameover através de getters e também chamando
        // o metodo de midia de som do Greenfoot
        if (isTouching(Fire.class) || isTouching(Vulture.class)) {
            Greenfoot.playSound("sounds/death.wav");
            ((Florest) getWorld()).gameOver();
        }

    }

}
