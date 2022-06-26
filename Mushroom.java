import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mushroom here.
 * 
 * @author (João Paulo S. Abreu (joaoabreu@ufba.br), Mateus C. Moura
 *         (mateuschaves@ufba.br), Rafael P. Casaes Sampaio
 *         (rafael.casaes@ufba.br),
 *         Uanderson S. Celestino (uandersoncelestino@ufba.br), Lílian T. de
 *         Sousa (lilian.sousa@ufba.br), Jefferson Aimon de B. Silva
 *         (jefferson.raimon@ufba.br))
 * @version (a version number or a date)
 */
public class Mushroom extends AllObjects {
    // Contrutor do Mushroom
    public Mushroom() {
        setImage("cogumelo.png");
        scaleImage(2, 2);
    }

    /**
     * Act - do whatever the Mushroom wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() {
        // metodo para o cogumelo cair a cada "velDown" determinado
        fall();
        removeMushroom();
        // Add your action code here.
    }
    public void removeMushroom() {

        // condicional para remover objeto na posição >= 499px
        if (getY() >= 499) {
            ((Florest) getWorld()).removeObject(this);
        } else if (isTouching(Parrot.class)) {
            // metodo para chamar midia de som
            Greenfoot.playSound("sounds/eat.mp3");
            
            // serve para instanciar a variavel ponto da classe Score
            Score.add();
            
            // se o papagaio tocar no cogumeloremove o mesmo
            ((Florest) getWorld()).removeObject(this);
        }

    }

}
