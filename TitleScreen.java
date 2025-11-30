import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant Game", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, getWidth()/2, 150);
        prepare();
    }

    public void act(){
        if(Greenfoot.isKeyDown("space")){
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,545,77);
        elephant.setLocation(438,111) ;
        elephant.setLocation(535,50);
        elephant.setLocation(538,61);
        elephant.setLocation(539,63);
        Label label = new Label("use \u2190 and \u2192 to move", 50);
        addObject(label,253,233);
        label.setLocation(304,225);
        Label label2 = new Label("press <space> to begin", 50);
        addObject(label2,253,310);
        label2.setLocation(317,307);
        label2.setLocation(302,305);
        label.setLocation(311,232);
    }
}
