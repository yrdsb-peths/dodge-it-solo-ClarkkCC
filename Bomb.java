import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



public class Bomb extends Actor
{
 
    public void act()
    {
        move(-10);
        
        if(getX() <= 0) 
        {
            resetBomb();
        }
        
        if(isTouching(ClarkKent.class))
        {
            Skull skull = new Skull();
            getWorld().addoObject(skull,300,200)
            getWOrld().removeObject(this); 
        }
    }
    
    public void resetBomb)(){
        int num = Greenfoot.getRandomNumber(2);
        if(num == 0)
        {
             setLocation(600,100);
        }
        else
        {
            set  setLocation(600,300);
        }
       
    }
}