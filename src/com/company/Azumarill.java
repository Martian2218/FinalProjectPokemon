package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;

import java.awt.event.KeyEvent;

/**
 * Created by kengo.shirokane on 7/17/2017.
 */
public class Azumarill extends GameObject
{
    public Azumarill()
    {
        super("Azumarill",200,200,"Azumarill2.png");
        setPosition(-300, -150);

    }
    //what the deuce do i do fix plz
    if(InputManager.isPressed(KeyEvent.VK_UP));
    {
        float y = getPositionY();
        y += 3;
        setPositionY(y);
    }

}
