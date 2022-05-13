import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    /**
     * Act - do whatever the GameOver wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final float SIZE_FONT = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    public GameOver(String message){
        makeImage(message);
    }
    private void makeImage(String message){
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.fillRect(5, 5, WIDTH, HEIGHT);
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, WIDTH, HEIGHT);
        
        Font font = image.getFont();
        font = font.deriveFont(SIZE_FONT);
        
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(message, 60, 100);
        setImage(image);
    }
    
    public void act()
    {
        // Add your action code here.
    }
    
}
