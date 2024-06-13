import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GusliTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GusliTwo extends Actor
{
    /**
     * Act - do whatever the GusliTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage myImage = getImage();
    public void act()
    {
        myImage.scale(400,50);
        setRotation(358); 
        if(Greenfoot.mouseClicked(this))
           {
               
           }
           
    }
}
