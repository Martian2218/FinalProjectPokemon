package com.company;

import edu.digipen.Game;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static Random rand = new Random();
    public static Scanner consoleInput = new Scanner(System.in);
    public static String Pokemon1="Pikachu";
    public static String Pokemon2="Mimikyu";
    public static String Pokemon3="Charizard";
    public static String Pokemon4="Gyarados";
    public static String Elite4P1="Regice";
    public static String Elite4P2="Tapu Lele";
    public static String Elite4P3="Cofagrigus";
    public static String Elite4P4="Incineroar";
    public static String MovePokemon11 = "Iron Tail";
    public static String MovePokemon12 = "Thunderbolt";
    public static String MovePokemon13 = "Electro Ball";
    public static String MovePokemon14 = "Quick Attack";
    public static String MovePokemon21 = "Shadow Sneak";
    public static String MovePokemon22 = "Shadow Claw";
    public static String MovePokemon23 = "Shadow Ball";
    public static String MovePokemon24 = "Play Rough";
    public static String MovePokemon31 = "Hyper Beam";
    public static String MovePokemon32 = "Fire Spin";
    public static String MovePokemon33 = "Toxic";
    public static String MovePokemon34 = "Dragon Claw";
    public static String MovePokemon41 = "Dragon Pulse";
    public static String MovePokemon42 = "Hydro Pump";
    public static String MovePokemon43 = "Ice Beam";
    public static String MovePokemon44 = "Hurricane";
    public static String EliteMove11="Ice Beam";
    public static String EliteMove12="Ice Punch";
    public static String EliteMove13="Giga Impact";
    public static String EliteMove14="Blizzard";

    public static String EliteMove21="Psychic";
    public static String EliteMove22="Moon Blast";
    public static String EliteMove23="Psyshock";
    public static String EliteMove24="Hidden Power (Fire)";

    public static String EliteMove31="Night Shade";
    public static String EliteMove32="Shadow Ball";
    public static String EliteMove33="Psychic";
    public static String EliteMove34="Energy Ball";

    public static String EliteMove41="Body Slam";
    public static String EliteMove42="Flamethrower";
    public static String EliteMove43="Overheat";
    public static String EliteMove44="Shadow Claw";

    public static boolean Restricted1=false;
    public static boolean Restricted2=false;
    public static int xR1=0;
    public static int xR2=0;
    public static boolean Poisoned1=false;
    public static boolean Poisoned2=false;
    public static boolean Confused1=false;
    public static boolean Confused2=false;
    public static int StatusChance1=0;
    public static int StatusChance2=0;
    public static boolean burned1=false;
    public static boolean burned2=false;
    public static boolean Disabled1=false;
    public static boolean Disabled2=false;

    public static String Opponent="Nothing";
    public static int Damage2M=0;
    public static int Damage2P=0;
    public static int HP1=500;
    public static int HP2=500;
    public static int ChanceP=100;
    public static int ChanceM=100;
    public static int Speed=0;
    public static String MoveUsed="Nothing";
    public static String MoveUsed2="Nothing";
    public static boolean Hit1=true;
    public static boolean Hit2=true;
    public static String user="Nothing";
    public static boolean battle=true;
    public static boolean alive2=true;
    public static boolean alive1=true;
    public static boolean RunCode=true;
    public static boolean hack=true;
    public static boolean Faster1=false;
    public static int MoveNumber=0;
    public static int UserNumber=0;
    public static int xHit1=1;
    public static int yHit1=1;
    public static int xHit2=1;
    public static int yHit2=1;
    public static int status1=0;
    public static int status2=0;
    public static boolean wasDis1=false;
    public static boolean wasDis2=false;
    public static boolean xstatus=false;
    public static boolean ystatus=false;
    public static int Cin1=-1;
    public static int Cin2=-1;
    public static int type1=0;
    public static int type2=0;
    public static int typex1=0;
    public static int typex2=0;
    public static int typey1=0;
    public static int typey2=0;
    public static int xHit=1;
    public static int yHit=1;
    public static int Attack1=0;
    public static int HPS1=0;
    public static int Attack2=0;
    public static int HPS2=0;
    public static int SpAttack1=0;
    public static int Defense1=0;
    public static int SpDefense1=0;
    public static int SpAttack2=0;
    public static int Defense2=0;
    public static int SpDefense2=0;
    public static int Speed1=0;
    public static int Speed2=0;


    public static void main(String[] args) {
       /* while(Game.getQuit() == false)
        {
            Game.update();
        }*/
        Game.initialize(1000, 750, 60, new Level1());

    }
}
