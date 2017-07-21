package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by kengo.shirokane on 7/21/2017.
 */
public class HPD extends GameObject
{
    public HPD()
    {
        super("HPD", 175, 130, "HPD.png");
        setPosition(250, 100);
    }

    float counter = 0;

    public void update(float dt)
    {
        System.out.println("B: " + counter);
        counter += dt * 150;

        setPosition(250 - counter, 100 - counter);

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
