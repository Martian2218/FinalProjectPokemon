package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by kengo.shirokane on 7/21/2017.
 */
public class BuluPsychic extends GameObject
{
    public BuluPsychic()
    {
        super("BuluPsychic", 100, 100, "PsychicZ.png");
        setPosition(-155, -105);
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
