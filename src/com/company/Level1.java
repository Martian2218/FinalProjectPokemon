package com.company;

import edu.digipen.InputManager;
import edu.digipen.gameobject.GameObject;
import edu.digipen.gameobject.ObjectManager;
import edu.digipen.level.GameLevel;
import java.awt.event.KeyEvent;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by kengo.shirokane on 7/17/2017.
 */
public class Level1 extends GameLevel {
    public static Scanner consoleInput = new Scanner(System.in);
    public Random rand = new Random();

    SpriteText[] label = new SpriteText[6];
    SpriteText ChoosePokemon;
    int LeadPoke = 0;
    boolean MoveChosen = false;
    String MoveUsed="Nothing";
    GameObject Background = new Background();
    GameObject Azumarill2 = new Azumarill2();
    GameObject Gyarados2 = new Gyarados2();
    GameObject Mimikyu2 = new Mimikyu2();
    GameObject Pikachu2 = new Pikachu2();
    GameObject Tyrantrum2 = new Tyrantrum2();
    GameObject Charizard2 = new Charizard2(300, 150);
    public static GameObject Charizard;
    public static boolean animated = false;

    @Override
    public void create() {
//Charizard3.kill();
        ObjectManager.addGameObject(Background);

        ObjectManager.addGameObject(Azumarill2);

        ObjectManager.addGameObject(Gyarados2);


        ObjectManager.addGameObject(Mimikyu2);

        ObjectManager.addGameObject(Pikachu2);

        ObjectManager.addGameObject(Charizard2);

        ObjectManager.addGameObject(Tyrantrum2);
        ChoosePokemon = new SpriteText("Choose your Pokemon", 32, SpriteText.Alignment.CENTER, 20, 0, 300);
        int x1 = -250;
        int y1 = 50;
        for (int x = 1; x < 7; x++) {

            label[x - 1] = new SpriteText("Press [" + x + "]", 32, SpriteText.Alignment.CENTER, 20, x1, y1);
            if (x1 == 250) {
                y1 = -300;
                x1 = -250;
            } else {
                x1 += 250;
            }
        }

    }

    @Override
    public void initialize() {

        System.out.println("test2");


        while (!InputManager.isTriggered(KeyEvent.VK_1) && !InputManager.isTriggered(KeyEvent.VK_2) && !InputManager.isTriggered(KeyEvent.VK_3) && !InputManager.isTriggered(KeyEvent.VK_4) && !InputManager.isTriggered(KeyEvent.VK_5) && !InputManager.isTriggered(KeyEvent.VK_6)) {

            System.out.println("Hurry Up");
        }
        if (InputManager.isTriggered(KeyEvent.VK_1)) {
            LeadPoke = 1;
        }
        if (InputManager.isTriggered(KeyEvent.VK_2)) {
            LeadPoke = 2;
        }
        if (InputManager.isTriggered(KeyEvent.VK_3)) {
            LeadPoke = 3;
        }
        if (InputManager.isTriggered(KeyEvent.VK_4)) {
            LeadPoke = 4;
        }
        if (InputManager.isTriggered(KeyEvent.VK_5)) {
            LeadPoke = 5;
        }
        if (InputManager.isTriggered(KeyEvent.VK_6)) {
            LeadPoke = 6;
        }
        System.out.println(LeadPoke);
        Azumarill2.kill();
        Charizard2.kill();
        Tyrantrum2.kill();
        Pikachu2.kill();
        Gyarados2.kill();
        Mimikyu2.kill();
        for (int i = 0; i < 6; i++) {
            label[i].Kill();
        }


        ChoosePokemon.Kill();
        if (LeadPoke == 1) {
            GameObject Gyarados = new Gyarados();
            ObjectManager.addGameObject(Gyarados);
        }
        if (LeadPoke == 2) {
            GameObject Mimikyu = new Mimikyu();
            ObjectManager.addGameObject(Mimikyu);
        }
        if (LeadPoke == 3) {
            Charizard=new Charizard3();
            ObjectManager.addGameObject(Charizard);
        }
        if (LeadPoke == 4) {
            GameObject Azumarill = new Azumarill();
            ObjectManager.addGameObject(Azumarill);
        }
        if (LeadPoke == 5) {
            GameObject Pikachu = new Pikachu();
            ObjectManager.addGameObject(Pikachu);
        }
        if (LeadPoke == 6) {
            GameObject Tyrantrum = new Tyrantrum();
            ObjectManager.addGameObject(Tyrantrum);
        }
        int Opponent = 6;//rand.nextInt(5)+1;
        if (Opponent == 1) {
            GameObject Cofagrigus = new Cofagrigus();
            ObjectManager.addGameObject(Cofagrigus);
        }
        if (Opponent == 2) {
            GameObject Garchomp = new Garchomp();
            ObjectManager.addGameObject(Garchomp);
        }
        if (Opponent == 3) {
            GameObject Incineroar = new Incineroar();
            ObjectManager.addGameObject(Incineroar);
        }
        if (Opponent == 4) {
            GameObject Regice = new Regice();
            ObjectManager.addGameObject(Regice);
        }
        if (Opponent == 5) {
            GameObject Rotom = new Rotom();
            ObjectManager.addGameObject(Rotom);
        }
        if (Opponent == 6) {
            GameObject TapuLele = new TapuLele();
            ObjectManager.addGameObject(TapuLele);
        }
        if (LeadPoke == 3) {
            GameObject DragonClaw = new MoveCreator("DragonClaw", -400, -300);
            ObjectManager.addGameObject(DragonClaw);
            GameObject Toxic = new MoveCreator("Toxic", -150, -300);
            ObjectManager.addGameObject(Toxic);
            GameObject FireSpin = new MoveCreator("FireSpin", 150, -300);
            ObjectManager.addGameObject(FireSpin);
            GameObject HyperBeam = new MoveCreator("HyperBeam", 400, -300);
            ObjectManager.addGameObject(HyperBeam);
        }
    }


    @Override
    public void update(float dt) {
       // System.out.println("AAAAAAAAAA");

        if(animated == false) {
            if (InputManager.getMousePosition().getX() > 30 && InputManager.getMousePosition().getX() < 169 && InputManager.getMousePosition().getY() < 704 && InputManager.getMousePosition().getY() > 666 && InputManager.isMouseButtonTriggered(0)) {
                System.out.println("DragonClaw");
                MoveChosen = true;
                MoveUsed = "Dragon Claw";

            }
           if (InputManager.getMousePosition().getX() > 279 && InputManager.getMousePosition().getX() < 417 && InputManager.getMousePosition().getY() < 704 && InputManager.getMousePosition().getY() > 666 && InputManager.isMouseButtonTriggered(0)) {
                System.out.println("Toxic");
                MoveChosen = true;
                MoveUsed = "Toxic";

            }
            if (InputManager.getMousePosition().getX() > 580 && InputManager.getMousePosition().getX() < 720 && InputManager.getMousePosition().getY() < 704 && InputManager.getMousePosition().getY() > 666 && InputManager.isMouseButtonTriggered(0)) {
                System.out.println("Fire Spin");
                MoveChosen = true;
                MoveUsed = "Fire Spin";

            }
            if (InputManager.getMousePosition().getX() > 829 && InputManager.getMousePosition().getX() < 969 && InputManager.getMousePosition().getY() < 704 && InputManager.getMousePosition().getY() > 666 && InputManager.isMouseButtonTriggered(0)) {
                System.out.println("Hyper Beam");
                MoveChosen = true;
                MoveUsed = "Hyper Beam";

            }
            if (MoveUsed.equals("Dragon Claw")) {
                Charizard.kill();
                GameObject CharizardDragClaw = new CharizardDragonClaw();
                ObjectManager.addGameObject(CharizardDragClaw);
                // CharizardDragClaw.kill();
                // System.out.println("Hi");
                // Charizard=new Charizard3();
                // ObjectManager.addGameObject(Charizard);
                MoveUsed = "";
                animated = true;
            }
            if(MoveUsed.equals("Toxic"))
            {
                GameObject CharToxic = new CharToxic();
                ObjectManager.addGameObject(CharToxic);


                    Main.type1 = 9;
                    Main.ChanceP = 100;
                    ExtraCode.ChanceSP(Main.Pokemon3);
                    if (Main.ystatus == false) {
                        if (Main.Hit1) {
                            Main.Poisoned2 = true;
                            Main.status2 = 5;
                            Main.Damage2M = 10;
                        }
                    } else {
                        Main.Hit1 = false;
                    }
                }
                MoveUsed = "";
                animated = true;

            }
            if(MoveUsed.equals("Fire Spin"))
            {
                GameObject CharFS = new CharFS();
                ObjectManager.addGameObject(CharFS);
                if (Main.user.equals(Main.Pokemon3)) {
                    Main.ChanceP = 100;
                    Main.type1 = 2;
                    Main. xHit1 = 3;
                    Main.yHit1 = 3;
                    Main.Damage2M = 20;
                } else if (Main.Opponent.equals(Main.Pokemon3)) {
                    Main.ChanceM = 100;
                    Main.type2 = 2;
                    Main.xHit2 = 3;
                    Main.yHit2 = 3;
                    Main.Damage2P = 20;
                }
                MoveUsed = "";
                animated = true;
            }
            if(MoveUsed.equals("Hyper Beam"))
            {
                GameObject CharHB = new CharHB();
                ObjectManager.addGameObject(CharHB);
                MoveUsed = "";
                animated = true;
            }
            if(InputManager.isMouseButtonTriggered(0))
            {
                System.out.println(InputManager.getMousePosition());
            }

        }
        // label.Change("New Text");

       /* if (InputManager.isMouseButtonPressed(0))
        {
            System.out.println(InputManager.getMousePosition());
        }*/


    @Override
    public void uninitialize() {

    }

}