import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GunMush here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GunMush extends AllObjects{
    
    int velGun = 2;
    
    public GunMush(){
        setImage("gunmush.png");
        scaleImage(4, 4);
    }
    /**
     * Act - do whatever the GunMush wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    @Override
    public void act(){
        //chama os metodos
        gunMushMove();
        hitEnemy();
        // Add your action code here.
    }
    
    //move o cogumelo para acertar o urubu
    public void gunMushMove(){
        
        setLocation(getX() + velGun, getY());
        
    }  
    
    //metodo para remover o urubu caso ele seja atingido pelo cogumelo. "getOneIntersectingObject" usado para facilitar a remoção 
    //dois objetos(cogumelo e urubu)
    public void hitEnemy(){
        
        Actor enemy = getOneIntersectingObject(Vulture.class); 
        if(enemy != null){
            Greenfoot.playSound("sounds/grito.mp3");
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
        }
        //cogumelo removido quando chegar na posição 651px
        else if (getX() >= 651) {
            getWorld().removeObject(this);
        }
        }

}