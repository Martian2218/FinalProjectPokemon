package com.company;

import edu.digipen.gameobject.GameObject;

/**
 * Created by yuuki.sawanoi on 7/19/2017.
 */
public class MoveCreator extends GameObject
{
    public MoveCreator(String Move, int X,int Y)
    {
        super(Move, 150, 50,Move+".png");
        setPosition(X, Y);
    }
}
