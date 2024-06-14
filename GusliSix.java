import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GusliSix here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GusliSix extends Actor
{
    /**
     * Act - do whatever the GusliSix wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound mySound = new GreenfootSound("sounds/note6.mp3");
    public void act()
    {
        setRotation(5);
        if(Greenfoot.mouseClicked(this))
           {
               mySound.play();
           }
        if(Greenfoot.isKeyDown("y"))
        {
            mySound.play();
        }
           
    }
}
