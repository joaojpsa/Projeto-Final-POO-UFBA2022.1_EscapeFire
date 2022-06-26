import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fire2 here.
 * 
 * @author (João Paulo S. Abreu (joaoabreu@ufba.br), Mateus C. Moura
 *         (mateuschaves@ufba.br), Rafael P. Casaes Sampaio
 *         (rafael.casaes@ufba.br),
 *         Uanderson S. Celestino (uandersoncelestino@ufba.br), Lílian T. de
 *         Sousa (lilian.sousa@ufba.br), Jefferson Aimon de B. Silva
 *         (jefferson.raimon@ufba.br))
 * @version (a version number or a date)
 */
public class Fire extends AllObjects {
    /* construtor */
    public Fire() {
        // chama a imagem referente a classe, através de setter
        setImage("fogo.png");
        //chama o metodo para redimensionar
        scaleImage(2, 2);
    }

    /**
     * Act - do whatever the fire2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act() {
        // método usado para movimentar o objeto horizontalmente(X), sendo da direita
        // para esquerda(-1)
        moveEnemies();
    }
    //método que foi herdado, aonde seu comportamento na classe Pai, se difere do seu comportamento na classe filha
    @Override
    public void scaleImage(int x, int y) {
        horScale = x;
        vertScale = y;
        getImage().scale(getImage().getWidth() / horScale, getImage().getHeight() / vertScale);
    }
}
