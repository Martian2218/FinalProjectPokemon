package com.company;

import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;

/**
 * Created by kengo.shirokane on 7/17/2017.
 */
public class Level1 extends GameLevel {
    @Override
    public void create() {
        GameObject Background= new Background();
        ObjectManager.addGameObject(Background);
        GameObject Hala= new Hala();
        ObjectManager.addGameObject(Hala);
        GameObject HalaQ1= new HalaQ1();
        ObjectManager.addGameObject(HalaQ1);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void update(float v) {

    }

    @Override
    public void uninitialize() {

    }
}
