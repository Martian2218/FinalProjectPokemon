package com.company;

/**
 * Created by yuuki.sawanoi on 7/19/2017.
 */
public class MoveTextCreator
{
    public MoveTextCreator(String MoveName, int X)
    {
        SpriteText Move=new SpriteText(MoveName, 20, SpriteText.Alignment.CENTER, 20,X, -400);
    }
}
