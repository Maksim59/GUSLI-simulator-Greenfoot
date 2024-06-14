import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GusliOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GusliOne extends Actor
{
    /**
     * Act - do whatever the GusliOne wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage myImage = getImage();
    GreenfootSound mySound = new GreenfootSound("sounds/note1.mp3");
    public void act()
    {
        myImage.scale(375,50);
        setRotation(356);    
        if(Greenfoot.mouseClicked(this))
           {
               mySound.play();
           }
        if(Greenfoot.isKeyDown("q"))
        {
            mySound.play();
        }
           
    }
}
