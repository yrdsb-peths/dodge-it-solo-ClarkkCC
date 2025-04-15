import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        ClarkKent hero =  new ClarkKent();
        addObject(hero,100,100);
        
        Bomb meteor = new Bomb();
        addObject(meteor, 600, 100); 
    }
}
