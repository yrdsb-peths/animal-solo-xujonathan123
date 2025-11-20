import greenfoot.*;

public class MyWorld extends World {
    public int score;
    Label scoreLabel;
    public MyWorld() {
        super(600, 400, 1);
        //create elephant class
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 200);
        
        //add label
        scoreLabel = new Label(0, 20);
        addObject(scoreLabel, 50, 50);
        
        //spawn initial apple
        createApple();
    }
    /*
     * increment score
     */
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
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
