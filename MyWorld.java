import greenfoot.*;

public class MyWorld extends World {
    public int score;
    Label scoreLabel;
    int level = 1;
    public MyWorld() {
        super(600, 400, 1, false);
        //create elephant class
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
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
        if(score % 5 == 0){
            level++;
        }
    }
    /*
     * end game
     */
    public void gameOver(){
        Label gameOverLabel = new Label("Game over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    /*
     * add apple at random location
     */
    public void createApple(){
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
}
