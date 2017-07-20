package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;

/**
 * Created by yuuki.sawanoi on 7/20/2017.
 */
public class CharToxic extends GameObject
{
    public CharToxic()
    {
        super("ToxicZ", 32, 32, "ToxicZ.png");
        setPosition(-80, -200);
    }

    float counter = 0;

    public void update(float dt)
    {
        System.out.println("B: " + counter);
        counter += dt * 150;

        setPosition(-80 + counter, -200 + counter);

        if(counter > 300)
        {
            System.out.println("C");
            kill();
      /*      Level1.Charizard=new Charizard3();
            ObjectManager.addGameObject(Level1.Charizard);*/
            Level1.animated = false;
        }
    }
}
