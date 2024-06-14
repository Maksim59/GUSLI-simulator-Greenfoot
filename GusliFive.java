import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GusliFive here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GusliFive extends Actor
{
    /**
     * Act - do whatever the GusliFive wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage myImage = getImage();
    GreenfootSound mySound = new GreenfootSound("sounds/note5.mp3");
    GreenfootSound whiteSpace = new GreenfootSound("sounds/whiteSpace.mp3");
    public void act()
    {
           setRotation(3);
           if(Greenfoot.mouseClicked(this))
           {
               mySound.play();
           }
           
        if(Greenfoot.isKeyDown("t"))
        {
            mySound.play();
        }

        
           
           
    }
}
