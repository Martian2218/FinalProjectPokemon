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
        GameObject Hala= new Hala();
        ObjectManager.addGameObject(Hala);
        GameObject HalaQ1= new HalaQ1();
        ObjectManager.addGameObject(HalaQ1);

        while(!InputManager.isTriggered(KeyEvent.VK_ENTER))
        {
            System.out.println("Hurry Up");

        }
        System.out.println("Test");

    }

    @Override
    public void initialize() {
        System.out.println("test2");

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void uninitialize() {

    }
}
