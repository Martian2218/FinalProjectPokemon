package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by yuuki.sawanoi on 7/20/2017.
 */
public class CharFS extends GameObject
{
    public CharFS()
    {
        super("CharFS", 200, 175, "FireSpinZ.png");
        setPosition(250, 100);
    }
    float counter=0;
    public void update(float dt)
    {
        System.out.println("B: " + counter);
        counter += dt * 300;

       // setPosition(-175 + counter, -200 + counter);

        if(counter > 500)
        {
            System.out.println("C");
            kill();
            //Level1.Charizard=new Charizard3();
           // ObjectManager.addGameObject(Level1.Charizard);
            Level1.animated = false;
        }
    }
}
