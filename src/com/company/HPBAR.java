package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by kengo.shirokane on 7/21/2017.
 */
public class HPBAR extends GameObject
{
    public HPBAR(int Y, int X, int Y2)
    {
        super("HPBAR", Y*2, 30, "HPBAR.png");
        setPosition(X, Y2);
    }
}
