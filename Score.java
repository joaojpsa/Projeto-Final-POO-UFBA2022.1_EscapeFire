import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (João Paulo S. Abreu (joaoabreu@ufba.br), Mateus C. Moura
 *         (mateuschaves@ufba.br), Rafael P. Casaes Sampaio
 *         (rafael.casaes@ufba.br),
 *         Uanderson S. Celestino (uandersoncelestino@ufba.br), Lílian T. de
 *         Sousa (lilian.sousa@ufba.br), Jefferson Aimon de B. Silva
 *         (jefferson.raimon@ufba.br))
 * @version (a version number or a date)
 */
public class Score extends AllObjects {
    // variavel para somar os pontos
    private static int ponto = 0;

    // método construtor
    public Score() {

    }

    public void act() {
        // instancia o objeto na posição escolhida utilizando florest do tipo World, usa
        // setter para colocar uma imagem
        World florest = getWorld();
        setImage("cogumeloMENOR.png");
        florest.showText("" + ponto, 60, 475);

    }

    // método para contar os pontos
    public static void add() {
        ponto++;
    }

}
