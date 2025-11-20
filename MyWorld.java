import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        //create elephant class
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        //add label
        Label scoreLabel = new Label(0, 20);
        addObject(scoreLabel, 0, 0);
        
        //spawn initial apple
        createApple();
    }
    
    /*
     * add apple at random location
     */
    public void createApple(){
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
