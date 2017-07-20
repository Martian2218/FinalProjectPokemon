package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;


public class CharizardDragonClaw extends GameObject
{
    public CharizardDragonClaw()
    {
        super("CharizardDragonClaw", 400, 400, "Charizard.png");
        float i=0;
        setPosition(-175, -125);
        //animation
        System.out.println("A");
    }

    float counter = 0;

    public void update(float dt)
    {
        System.out.println("B: " + counter);
        counter += dt * 300;

        setPosition(-175 + counter, -200 + counter);

        if(counter > 300)
        {
            System.out.println("C");
            kill();
            Level1.Charizard=new Charizard3();
            ObjectManager.addGameObject(Level1.Charizard);
            Level1.animated = false;
        }
    }

}

