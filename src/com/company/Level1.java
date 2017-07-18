package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

/**
 * Created by kengo.shirokane on 7/17/2017.
 */
public class Level1 extends GameLevel {
    public static Scanner consoleInput = new Scanner(System.in);
    @Override
    public void create() {
        GameObject Background= new Background();
        ObjectManager.addGameObject(Background);
        GameObject Azumarill=new Azumarill();
        ObjectManager.addGameObject(Azumarill);
        GameObject Gyarados2=new Gyarados2();
        ObjectManager.addGameObject(Gyarados2);
        GameObject ChoosePokemon= new ChoosePokemon();
        ObjectManager.addGameObject(ChoosePokemon);
        GameObject Mimikyu2=new Mimikyu2();
        ObjectManager.addGameObject(Mimikyu2);
        GameObject Pikachu2=new Pikachu2();
        ObjectManager.addGameObject(Pikachu2);
        GameObject Charizard2=new Charizard2();
        ObjectManager.addGameObject(Charizard2);
        GameObject Tyrantrum2=new Tyrantrum2();
        ObjectManager.addGameObject(Tyrantrum2);


    }

    @Override
    public void initialize() {
        System.out.println("test2");


        while(!InputManager.isTriggered(KeyEvent.VK_ENTER)) {
            System.out.println("Hurry Up");

        }
        System.out.println("Test");
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void uninitialize() {

    }
}
