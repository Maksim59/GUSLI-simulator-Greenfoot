import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GusliThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GusliThree extends Actor
{
    /**
     * Act - do whatever the GusliThree wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage myImage = getImage();
    GreenfootSound mySound = new GreenfootSound("sounds/note3.mp3");
    public void act()
    {
        myImage.scale(415,50);
        if(Greenfoot.mouseClicked(this))
           {
               mySound.play();
           }
        if(Greenfoot.isKeyDown("e"))
        {
            mySound.play();
        }
           
    }
}
