package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by yuuki.sawanoi on 7/20/2017.
 */
public class CharHB extends GameObject
{
    public CharHB()
    {
        super("CharHB", 300,150, "HyperBeamZ.png");
        setPosition(125,30);
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
