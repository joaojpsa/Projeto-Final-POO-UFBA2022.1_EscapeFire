import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AllObjects here.
 * 
 * @author (João Paulo S. Abreu (joaoabreu@ufba.br), Mateus C. Moura
 *         (mateuschaves@ufba.br), Rafael P. Casaes Sampaio
 *         (rafael.casaes@ufba.br),
 *         Uanderson S. Celestino (uandersoncelestino@ufba.br), Lílian T. de
 *         Sousa (lilian.sousa@ufba.br), Jefferson Aimon de B. Silva
 *         (jefferson.raimon@ufba.br))
 * @version (a version number or a date)
 */
public class AllObjects extends Actor {
    int horScale;
    int vertScale;

    /**
     * Act - do whatever the AllObjects wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        // Add your action code here.
    }

    public void scaleImage(int x, int y) {
        horScale = x;
        vertScale = y;
        getImage().scale(getImage().getWidth() / horScale, getImage().getHeight() / vertScale);
    }
}
