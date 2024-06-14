import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GusliFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GusliFour extends Actor
{
    /**
     * Act - do whatever the GusliFour wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound mySound = new GreenfootSound("sounds/note4.mp3");
    public void act()
    {
        setRotation(2);
        if(Greenfoot.mouseClicked(this))
           {
               mySound.play();
           }
           
        if(Greenfoot.isKeyDown("r"))
        {
            mySound.play();
        }
           
    }
}
