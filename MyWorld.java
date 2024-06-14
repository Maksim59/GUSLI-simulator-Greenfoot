import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 

        Gusli gusli = new Gusli();
        addObject(gusli, 500,300);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        GusliOne gusliOne = new GusliOne();
        addObject(gusliOne,430,222);
        GusliTwo gusliTwo = new GusliTwo();
        addObject(gusliTwo,444,254);
        GusliThree gusliThree = new GusliThree();
        addObject(gusliThree,450,284);
        GusliFour gusliFour = new GusliFour();
        addObject(gusliFour,477,311);
        GusliFive gusliFive = new GusliFive();
        addObject(gusliFive,478,340);
        GusliSix gusliSix = new GusliSix();
        addObject(gusliSix,480,366);
        Label label = new Label("Q", 30);
        addObject(label,660,195);
        Label label2 = new Label("W", 30);
        addObject(label2,680,232);
        Label label3 = new Label("E", 30);
        addObject(label3,710,270);
        Label label4 = new Label("R", 30);
        addObject(label4,737,311);
        Label label5 = new Label("T", 30);
        addObject(label5,760,343);
        Label label6 = new Label("Y", 30);
        addObject(label6,791,389);
        Label label7 = new Label("U - For Chords", 50);
        addObject(label7,492,494);
        removeObject(label7);
        Label label8 = new Label("Gusli - Simulation", 70);
        addObject(label8,487,77);
    }
}
