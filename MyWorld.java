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
    }
}
