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

    public static void HyperBeam() {


        if (Main.user.equals(Main.Pokemon3)) {
            Main.ChanceP = 100;
            Main.type1 = 1;
            if (Main.wasDis1 == true) {
                Main.Disabled1 = false;
                Main.wasDis1 = false;
            } else {
                Main.Disabled1 = true;
                Main.wasDis1 = true;
                Main.Damage2M = 140;

            }
        } else if (Main.Opponent.equals(Main.Pokemon3)) {
            Main.ChanceM = 100;
            Main.type2 = 1;
            if (Main.wasDis2 == true) {
                Main.Disabled2 = false;
            } else {
                Main.Disabled2 = true;
                Main.wasDis2 = true;
                Main.Damage2P = 140;
            }

        }

    }
}
