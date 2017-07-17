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
    public static String Error1="Please Choose a Valid Pokemon (This is Case Sensitive!)";
    public static String Error2="Please Choose a Valid Move (This is Case Sensitive!)";
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
    //Normal=1
    //Fire=2
    //Ice=3
    //Water=4
    //Dragon=5
    //Electric=6
    //Grass=7
    //Fairy=8
    //Poison=9
    //Dark=10
    //Flying=11
    public static void WeaknessResistance()
    {
        if(typex1==2 && type2==4 ||typey1==2 && type2==4)
        {
            yHit*=2;
        }
        if(type1==4 && typex2==2 || type1==4 && typey2==2)
        {
            xHit*=2;
        }
        if(typex1==10 && type2==8 ||typey1==10 && type2==8)
        {
            yHit*=2;
        }
        if(type1==8 && typex2==10 || type1==4 && typey2==10)
        {
            xHit*=2;
        }
        if(type1==2 && typex2==3 || type1==2 && typey2==3)
        {
            xHit*=2;
        }
        if(typex1==3 && type2==2 || typey1==3 && type2==2)
        {
            yHit*=2;
        }
        if(type1==6 && typex2==4 || type1==6 && typey2==4)
        {
            xHit*=2;
        }
        if(typex1==4 && type2==6 || typey1==4 && type2==6)
        {
            xHit*=2;
        }
        if(typex1==5 && type2==5 || typey1==5 && type2==5)
        {
            yHit*=2;
        }
        if(type1==5 && typex2==5 || type1==5 && typey2==5 || type1==8 && typey2==5 || type1==8 && typex2==5)
        {
            xHit*=2;
        }
        if(typex1==5 && type2==5 || typey1==5 && type2==5 || typey1==5 && type2==8 || typex1==5 && type2==8)
        {
            yHit*=2;
        }
        if(type1==3 && typex2==11 || type1==3 && typey2==11 || type1==6 && typey2==11 || type1==6 && typex2==11)
        {
            xHit*=2;
        }
        if(typex1==11 && type2==3 || typey1==11 && type2==3 || typey1==11 && type2==6 || typex1==11 && type2==6)
        {
            yHit*=2;
        }
        if(type1==2 && typex2==7 || type1==2 && typey2==7 || type1==3 && typey2==7 || type1==3 && typex2==7 || type1==9 && typey2==7 || type1==9 && typex2==7)
        {
            xHit*=2;
        }
        if(typex1==7 && type2==2 || typey1==7 && type2==2 || typey1==7 && type2==3 || typex1==7 && type2==3 || typey1==7 && type2==9 || typex1==7 && type2==9)
        {
            yHit*=2;
        }
        if(type1==9 && typex2==8 || type1==9 && typey2==8)
        {
            xHit*=2;
        }
        if(typex1==8 && type2==9 || typey1==8 && type2==9)
        {
            yHit*=2;
        }
        if(type1==2 && typex2==2 || type1==2 && typey2==2 || type1==7 && typey2==2 || type1==7 && typex2==2 || type1==3 && typey2==2 || type1==3 && typex2==2)
        {
            xHit/=2;
        }
        if(typex1==2 && type2==2 || typey1==2 && type2==2 || typey1==2 && type2==7 || typex1==2 && type2==7 || typey1==2 && type2==3 || typex1==2 && type2==3)
        {
            yHit/=2;
        }
        if(type1==3 && typex2==3 || type1==3 && typey2==3)
        {
            xHit/=2;
        }
        if(typex1==3 && type2==3 || typey1==3 && type2==3)
        {
            yHit/=2;
        }
        if(type1==2 && typex2==5 || type1==2 && typey2==5 || type1==4 && typey2==5 || type1==4 && typex2==5 || type1==6 && typey2==5 || type1==6 && typex2==5|| type1==7 && typey2==5 || type1==7 && typex2==5)
        {
            xHit/=2;
        }
        if(typex1==5 && type2==2 || typey1==5 && type2==2 || typey1==5 && type2==4 || typex1==5 && type2==4 || typey1==5 && type2==6 || typex1==5 && type2==6|| typey1==5 && type2==7 || typex1==5 && type2==7)
        {
            yHit/=2;
        }
        if(type1==2 && typex2==4 || type1==2 && typey2==4 || type1==4 && typey2==4 || type1==4 && typex2==4 || type1==3 && typey2==4 || type1==3 && typex2==4)
        {
            xHit/=2;
        }
        if(typex1==4 && type2==2 || typey1==4 && type2==2 || typey1==4 && type2==4 || typex1==4 && type2==4 || typey1==4 && type2==3 || typex1==4 && type2==3)
        {
            yHit/=2;
        }
        if(type1==6 && typex2==6 || type1==6 && typey2==6)
        {
            xHit/=2;
        }
        if(typex1==6 && type2==6 || typey1==6 && type2==6)
        {
            yHit/=2;
        }
        if(type1==4 && typex2==7 || type1==4 && typey2==7 || type1==6 && typey2==7 || type1==6 && typex2==7 || type1==7 && typey2==7 || type1==7 && typex2==7)
        {
            xHit/=2;
        }
        if(typex1==7 && type2==4 || typey1==7 && type2==4 || typey1==7 && type2==6 || typex1==7 && type2==6 || typey1==7 && type2==7 || typex1==7 && type2==7)
        {
            yHit/=2;
        }
        if(type1==7 && typex2==9 || type1==7 && typey2==9 || type1==8 && typey2==9 || type1==8 && typex2==9 || type1==9 && typey2==9 || type1==9 && typex2==9)
        {
            xHit/=2;
        }
        if(typex1==9 && type2==7 || typey1==9 && type2==7 || typey1==9 && type2==8 || typex1==9 && type2==8 || typey1==9 && type2==9 || typex1==9 && type2==9)
        {
            yHit/=2;
        }
        if(type1==10 && typex2==10 || type1==10 && typey2==10)
        {
            xHit/=2;
        }
        if(typex1==10 && type2==10 || typey1==10 && type2==10)
        {
            yHit/=2;
        }
    }
    public static void Poison(String Pokemon)
    {

        if(MoveUsed.equals(MovePokemon33))
        {

            if(!Pokemon.equals(Pokemon3)) {
                System.out.println(Pokemon + " was poisoned");
            }


        }
        if(MoveUsed2.equals(MovePokemon33))
        {
            if(!Pokemon.equals(Pokemon3)) {
                System.out.println(Pokemon + " was poisoned");
            }
        }

    }
    public static int xHit(String Pokemon) {
        //   System.out.println("check");
        int xHit=1;
        if (xHit1 != 1 || xHit2!=1)
        {


            if (Pokemon.equals(user)) {
                if (xHit1 != 1) {
                    xHit = rand.nextInt(xHit1) + yHit1;
                }
            } else if (Pokemon.equals((Opponent))) {
                if (xHit2 != 1) {
                    xHit = rand.nextInt(xHit2) + yHit2;
                }
            }
        }
        return xHit;
    }
    public static void hack()
    {
        if (Opponent.equals(Pokemon1))
        {
            HP1=HP1+1000;
        }
        else
        {
            HP2=HP2+100;
        }
    }

    public static void check()
    {
        if (HP1<=0)
        {
            alive1=false;
            battle=false;
        }
        if (HP2<=0)
        {
            alive2=false;
            battle=false;
        }
        if (HP2>0 && HP1>0)
        {
            alive2=true;
            alive1=true;
            battle=true;

        }
        System.out.println(user+ " HP:" + HP1 + ", "+Opponent+" HP:" + HP2);
    }
    public static void Chance(int P)
    {
        if(P==1) {
            int Chance = rand.nextInt(100) + 1;
            if (Hit1) {
                if (Chance > ChanceP) {
                    Hit1 = false;
                } else {
                    Hit1 = true;
                }
            }

            Chance = rand.nextInt(100) + 1;
            if (Hit2) {
                if (Chance > ChanceM) {
                    Hit2 = false;
                } else {
                    Hit2 = true;
                }
            }
        }
        if(P==2)
        {
            int Chance = rand.nextInt(100) + 1;
            if (Hit1) {
                if (Chance > ChanceP) {
                    Hit1 = false;
                } else {
                    Hit1 = true;
                }
            }
        }
        if (P==3)
        {
            int Chance = rand.nextInt(100) + 1;
            if (Hit2) {
                if (Chance > ChanceM) {
                    Hit2 = false;
                } else {
                    Hit2 = true;
                }
            }
        }
    }
    public static void ChanceSP(String Pokemon) {
        int Chance = rand.nextInt(100) + 1;
        if (user.equals(Pokemon)) {
            if (Hit1) {
                if (Chance > ChanceP) {
                    Hit1 = false;
                } else {
                    Hit1 = true;
                }
            }
        }
        Chance = rand.nextInt(100) + 1;
        if (Opponent.equals(Pokemon)) {
            if (Hit2) {
                if (Chance > ChanceM) {
                    Hit2 = false;
                } else {
                    Hit2 = true;
                }
            }

        }
    }
    public static void DragonPulse()
    {

        if(user.equals(Pokemon4)) {
            type1=5;
            ChanceP=95;
            Damage2M=90;
            //'  Restricted1=true;
           /* if(xR1==0) {
                xR1 = 2;
            }*/
        }
        else if(Opponent.equals(Pokemon4)) {
            type2=5;
            ChanceM=95;
            Damage2P=90;
           /* Restricted2=true;
            if(xR2==0) {
                xR2 = 2;
            }*/
        }

    }
    public static void HydroPump()
    {
        if(user.equals(Pokemon4)) {
            type1=4;
            ChanceP=65;
            Damage2M=110;
        }
        else if(Opponent.equals(Pokemon4)) {
            type2=4;
            ChanceM=65;
            Damage2P=110;
        }


    }
    public static void IceBeam()
    {
        if(user.equals(Pokemon4)) {
            type1=3;
            ChanceP=93;
            Damage2M=90;
        }
        else if(Opponent.equals(Pokemon4)) {
            type2=3;
            ChanceM=93;
            Damage2P=90;
        }


    }
    public static void Hurricane()
    {
        if(user.equals(Pokemon4)) {
            type1=11;
            ChanceP=75;
            Damage2M=100;
            //      StatusChance2=30;
        }
        else if(Opponent.equals(Pokemon4)) {
            type2=11;
            ChanceM=75;
            Damage2P=100;
            //     StatusChance1=30;
        }



    }
    public static void HyperBeam()
    {


        if(user.equals(Pokemon3)) {ChanceP=100;
            type1=1;
            if(wasDis1==true) {
                Disabled1 = false;
                wasDis1=false;
            }
            else
            {
                Disabled1=true;
                wasDis1=true;
                Damage2M=140;

            }
        }
        else if(Opponent.equals(Pokemon3)) {ChanceM=100;
            type2=1;
            if(wasDis2==true) {
                Disabled2 = false;
            }
            else
            {
                Disabled2=true;
                wasDis2=true;
                Damage2P=140;
            }

        }

    }
    public static void FireSpin()
    {


        if(user.equals(Pokemon3)) {ChanceP=100;
            type1=2;
            xHit1=3;
            yHit1=3;
            Damage2M=20;
        }
        else if(Opponent.equals(Pokemon3)) {ChanceM=100;
            type2=2;
            xHit2=3;
            yHit2=3;
            Damage2P=20;
        }

    }
    public static void Toxic()
    {
        if(user.equals(Pokemon3)) {
            type1=9;
            ChanceP=100;
            ChanceSP(Pokemon3);
            if(ystatus==false) {
                if (Hit1) {
                    Poisoned2 = true;
                    status2 = 5;
                    Damage2M = 10;
                }
            }
            else
            {
                Hit1=false;
            }
        }
        else if(Opponent.equals(Pokemon3)) {
            type2=9;
            ChanceM=100;
            ChanceSP(Pokemon3);
            if(xstatus==false) {
                if (Hit2) {
                    Poisoned1 = true;
                    status1 = 5;
                    Damage2P = 10;
                }
            }
            else
            {
                Hit2=false;
            }
        }

    }
    public static void DragonClaw()
    {
        if(user.equals(Pokemon3)) {  ChanceP=100;
            type1=5;
            Damage2M=80;
        }
        else if(Opponent.equals(Pokemon3)) {  ChanceM=100;
            type2=5;
            Damage2P=80;
        }



    }

    public static void Facade()
    {
        if(user.equals(Pokemon1)) {  ChanceP=100;
            type1=1;
            Damage2M=80;
            if(xstatus)
            {
                Damage2M*=2;
            }
        }
        else if(Opponent.equals(Pokemon1)) {  ChanceM=100;
            type2=1;
            Damage2P=80;
            if(ystatus)
            {
                Damage2P*=2;
            }
        }



    }

    public static void Thunderbolt()
    {
        if(user.equals(Pokemon1)) {  ChanceP=95;
            type1=6;
            Damage2M=90;
        }
        else if(Opponent.equals(Pokemon1)) {  ChanceM=95;
            type2=6;
            Damage2P=90;
        }




    }
    public static void ElectroBall()
    {
        if(user.equals(Pokemon1)) {
            type1=6;
            Damage2M=120;
            ChanceP=50;
        }
        else if(Opponent.equals(Pokemon1)) {
            type2=6;
            Damage2P=120;
            ChanceM=50;
        }



    }
    public static void QuickAttack()
    {


        if(user.equals(Pokemon1)) {
            type1=1;
            Speed++;
            Damage2M=50;
            ChanceP=100;
        }
        else if(Opponent.equals(Pokemon1)) {
            type2=1;
            Speed--;
            Damage2P=50;
            ChanceM=100;
        }


    }
    public static void ShadowSneak()
    {


        if(user.equals(Pokemon2)) {ChanceP=100;
            type1=10;
            Speed++;
            Damage2M=50;
        }
        else if(Opponent.equals(Pokemon2)) {ChanceM=100;
            type2=10;
            Speed--;
            Damage2P=50;
        }

    }
    public static void ShadowClaw()
    {
        if(user.equals(Pokemon2)) { ChanceP=100;
            type1=10;
            Damage2M=80;
        }
        else if(Opponent.equals(Pokemon2)) { ChanceM=100;
            type2=10;
            Damage2P=80;
        }


    }
    public static void ShadowBall()
    {
        if(user.equals(Pokemon2)) {ChanceP=95;
            type1=10;
            Damage2M=90;
        }
        else if(Opponent.equals(Pokemon2)) {ChanceM=95;
            type2=10;
            Damage2P=90;
        }

        //   ChanceM=95;

    }
    public static void PlayRough()
    {
        if(user.equals(Pokemon2)) {
            type1=8;
            Damage2M=100;
            ChanceP=80;
        }
        else if(Opponent.equals(Pokemon2)) {
            type2=8;
            Damage2P=100;
            ChanceM=80;
        }
        //  ChanceM=80;


    }

    public static void Move2(String Pokemon)
    {
        int move = rand.nextInt(4) + 1;
        if (Pokemon.equals(Pokemon2))
        {
            if(move==1)
            {
                ShadowSneak();
                MoveUsed2=MovePokemon21;
            }
            if(move==2)
            {
                ShadowClaw();
                MoveUsed2=MovePokemon22;
            }
            if(move==3)
            {
                ShadowBall();
                MoveUsed2=MovePokemon23;
            }
            if(move==4)
            {
                PlayRough();
                MoveUsed2=MovePokemon24;
            }
        }
        if (Pokemon.equals(Pokemon1)) {
            if(move==1)
            {
                Facade();
                MoveUsed2=MovePokemon11;
            }
            if(move==2)
            {
                Thunderbolt();
                MoveUsed2=MovePokemon12;
            }
            if(move==3)
            {
                ElectroBall();
                MoveUsed2=MovePokemon13;
            }
            if(move==4)
            {
                QuickAttack();
                MoveUsed2=MovePokemon14;
            }
        }
        if (Pokemon.equals(Pokemon3))
        {
            if(move==1)
            {
                HyperBeam();
                MoveUsed2=MovePokemon31;
            }
            if(move==2)
            {
                FireSpin();
                MoveUsed2=MovePokemon32;
            }
            if(move==3)
            {
                //  Chance();
                Toxic();
                MoveUsed2=MovePokemon33;
            }
            if(move==4)
            {
                DragonClaw();
                MoveUsed2=MovePokemon34;
            }
        }
        if (Pokemon.equals(Pokemon4))
        {
            if(move==1)
            {
                DragonPulse();
                MoveUsed2=MovePokemon41;
            }
            if(move==2)
            {
                HydroPump();
                MoveUsed2=MovePokemon42;
            }
            if(move==3)
            {

                IceBeam();
                MoveUsed2=MovePokemon43;
            }
            if(move==4)
            {
                Hurricane();
                MoveUsed2=MovePokemon44;
            }
        }
    }
    public static void Move1(String Pokemon)
    {
        if (Pokemon.equals(Pokemon1))
        {
            System.out.println("What will be your move? (Choose From: " + MovePokemon11 + ", " + MovePokemon12 + ", " + MovePokemon13 + " or " + MovePokemon14 + ")");
            String Move = consoleInput.nextLine();
            while (!((Move.equals(MovePokemon11)) || (Move.equals(MovePokemon12)) || (Move.equals(MovePokemon13)) || (Move.equals(MovePokemon14))))
            {
                System.out.println(Error2);
                Move = consoleInput.nextLine();

            }
            if (Move.equals(MovePokemon11))
            {
                Facade();
                MoveUsed=MovePokemon11;
            }
            if (Move.equals(MovePokemon12))
            {
                Thunderbolt();
                MoveUsed=MovePokemon12;
            }
            if (Move.equals(MovePokemon13))
            {
                ElectroBall();
                MoveUsed=MovePokemon13;
            }
            if (Move.equals(MovePokemon14))
            {
                QuickAttack();
                MoveUsed=MovePokemon14;
            }



        }
        if (Pokemon.equals(Pokemon2)) {
            System.out.println("What will be your move? (Choose From: " + MovePokemon21 + ", " + MovePokemon22 + ", " + MovePokemon23 + " or " + MovePokemon24 + ")");
            String Move = consoleInput.nextLine();

            while (!((Move.equals(MovePokemon21)) || (Move.equals(MovePokemon22)) || (Move.equals(MovePokemon23)) || (Move.equals(MovePokemon24)))) {
                System.out.println(Error2);
                Move = consoleInput.nextLine();
            }

            if (Move.equals(MovePokemon21)) {
                ShadowSneak();
                MoveUsed = MovePokemon21;
            }
            if (Move.equals(MovePokemon22)) {
                ShadowClaw();
                MoveUsed = MovePokemon22;
            }
            if (Move.equals(MovePokemon23)) {
                ShadowBall();
                MoveUsed = MovePokemon23;
            }
            if (Move.equals(MovePokemon24)) {
                PlayRough();
                MoveUsed = MovePokemon24;
            }
        }
        if (Pokemon.equals(Pokemon3))
        {
            System.out.println("What will be your move? (Choose From: " + MovePokemon31 + ", " + MovePokemon32 + ", " + MovePokemon33 + " or " + MovePokemon34 + ")");
            String Move = consoleInput.nextLine();

            while (!((Move.equals(MovePokemon31)) || (Move.equals(MovePokemon32)) || (Move.equals(MovePokemon33)) || (Move.equals(MovePokemon34))))
            {
                System.out.println(Error2);
                Move = consoleInput.nextLine();
            }

            if (Move.equals(MovePokemon31))
            {
                HyperBeam();
                MoveUsed=MovePokemon31;
            }
            if (Move.equals(MovePokemon32))
            {
                FireSpin();
                MoveUsed=MovePokemon32;
            }
            if (Move.equals(MovePokemon33))
            {

                Toxic();
                MoveUsed=MovePokemon33;
            }
            if (Move.equals(MovePokemon34))
            {
                DragonClaw();
                MoveUsed=MovePokemon34;
            }


        }
        if (Pokemon.equals(Pokemon4))
        {
            System.out.println("What will be your move? (Choose From: " + MovePokemon41 + ", " + MovePokemon42 + ", " + MovePokemon43 + " or " + MovePokemon44 + ")");
            String Move = consoleInput.nextLine();

            while (!((Move.equals(MovePokemon41)) || (Move.equals(MovePokemon42)) || (Move.equals(MovePokemon43)) || (Move.equals(MovePokemon44))))
            {
                System.out.println(Error2);
                Move = consoleInput.nextLine();
            }

            if (Move.equals(MovePokemon41))
            {
                DragonPulse();
                MoveUsed=MovePokemon41;
            }
            if (Move.equals(MovePokemon42))
            {
                HydroPump();
                MoveUsed=MovePokemon42;
            }
            if (Move.equals(MovePokemon43))
            {

                IceBeam();
                MoveUsed=MovePokemon43;
            }
            if (Move.equals(MovePokemon44))
            {
                Hurricane();
                MoveUsed=MovePokemon44;
            }


        }
    }
    public static void Battle(String Pokemon) {
        System.out.println(" ");
        System.out.println("Turn " + MoveNumber + ":");


        Move1(user);
        Move2(Opponent);
        xHit = xHit(user);
        yHit = xHit(Opponent);
        //    WeaknessResistance();
       /* if(!Opponent.equals(Pokemon4) && !MoveUsed2.equals(MovePokemon33)) {
            Chance();
        }
        if(MoveUsed!=MovePokemon33)
        {
            Chance();
        }*/
        if (!MoveUsed2.equals(MovePokemon33) && !MoveUsed.equals(MovePokemon33))
        {
            Chance(1);
        }
        if (MoveUsed2.equals(MovePokemon33) && !MoveUsed.equals(MovePokemon33))
        {
            Chance(2);
        }
        if (!MoveUsed2.equals(MovePokemon33) && MoveUsed.equals(MovePokemon33))
        {
            Chance(3);
        }
        Damage2P=Damage2P*yHit;
        Damage2M=Damage2M*xHit;

        if (Hit2 == true) {
            if (Hit1 == true) {
                if (Speed > 0) {
                    Faster1=false;
                    System.out.println(user + " used " + MoveUsed);
                    System.out.println("It Succeeded!");
                    Poison(Opponent);
                    System.out.println(Opponent + " lost " + Damage2M + "HP!");
                    HP2 = HP2 - Damage2M;

                    check();

                    System.out.println(Opponent + " used " + MoveUsed2);
                    System.out.println("It Succeeded!");
                    Poison(user);
                    System.out.println(user + " lost " + Damage2P + "HP!");
                    HP1 = HP1 - Damage2P;
                    check();
                }
                else if (Speed < 0) {
                    Faster1=true;
                    System.out.println(Opponent+ " used " + MoveUsed2);
                    System.out.println("It Succeeded!");
                    Poison(user);
                    System.out.println(user + " lost " + Damage2P + "HP!");
                    HP1 = HP1 - Damage2P * yHit;

                    check();

                    System.out.println(user + " used " + MoveUsed);
                    System.out.println("It Succeeded!");
                    Poison(Opponent);
                    System.out.println(Opponent+ " lost " + Damage2M + "HP!");
                    HP2 = HP2 - Damage2M;

                    check();
                } else{
                    int speed = rand.nextInt(2) + 1;
                    if (speed == 1) {
                        Faster1=false;
                        System.out.println(user + " used " + MoveUsed);
                        System.out.println("It Succeeded!");
                        Poison(Opponent);
                        System.out.println(Opponent + " lost " + Damage2M + "HP!");
                        HP2 = HP2 - Damage2M;

                        check();
                        System.out.println(Opponent + " used " + MoveUsed2);
                        System.out.println("It Succeeded!");
                        Poison(user);
                        System.out.println(user + " lost " + Damage2P + "HP!");
                        HP1 = HP1 - Damage2P;
                        check();
                    }
                    if (speed == 2) {
                        Faster1=true;
                        System.out.println(Opponent+ " used " + MoveUsed2);
                        System.out.println("It Succeeded!");
                        Poison(user);
                        System.out.println(user + " lost " + Damage2P + "HP!");
                        HP1 = HP1 - Damage2P;
                        check();
                        System.out.println(user + " used " + MoveUsed);
                        System.out.println("It Succeeded!");
                        Poison(Opponent);
                        System.out.println(Opponent+ " lost " + Damage2M + "HP!");
                        HP2 = HP2 - Damage2M;

                        check();
                    }
                }
            }
            if (Hit1 == false) {
                if (Speed > 0) {
                    Faster1=false;
                    System.out.println(user + " used " + MoveUsed);
                    System.out.println("It Failed!");

                    System.out.println(Opponent+ " used " + MoveUsed2);
                    System.out.println("It Succeeded!");
                    Poison(user);
                    System.out.println("user lost " + Damage2P + "HP!");
                    HP1 = HP1 - Damage2P;
                    check();
                }
                else if (Speed < 0) {
                    Faster1=true;
                    System.out.println(Opponent+ " used " + MoveUsed2);
                    System.out.println("It Succeeded!");
                    Poison(user);
                    System.out.println(user + " lost " + Damage2P + "HP!");
                    HP1 = HP1 - Damage2P;
                    check();
                    System.out.println(user + " used " + MoveUsed);
                    System.out.println("It Failed!");

                }
                else {
                    int speed = rand.nextInt(2) + 1;
                    if (speed == 1) {
                        Faster1=false;
                        System.out.println(user + " used " + MoveUsed);
                        System.out.println("It Failed!");

                        System.out.println(Opponent+ " used " + MoveUsed2);
                        System.out.println("It Succeeded!");
                        Poison(user);
                        System.out.println(user + " lost " + Damage2P + "HP!");
                        HP1 = HP1 - Damage2P;
                        check();
                    }
                    if (speed == 2) {
                        Faster1=true;
                        System.out.println(Opponent+ " used " + MoveUsed2);
                        System.out.println("It Succeeded!");
                        Poison(user);
                        System.out.println(user + " lost " + Damage2P + "HP!");
                        HP1 = HP1 - Damage2P;
                        check();
                        System.out.println(user + " used " + MoveUsed);
                        System.out.println("It Failed!");

                    }
                }
            }
            if (Hit2 == false) {
                if (Hit1 == true) {

                    if (Speed > 0) {
                        Faster1=false;
                        System.out.println(user + " used " + MoveUsed);
                        System.out.println("It Succeeded!");
                        Poison(Opponent);
                        System.out.println(Opponent+ " lost " + Damage2M + "HP!");
                        HP2 = HP2 - Damage2M;
                        check();
                        System.out.println(Opponent + " used " + MoveUsed2);
                        System.out.println("It Failed!");

                    }
                    else if (Speed < 0) {
                        Faster1=true;
                        System.out.println(Opponent+ " used " + MoveUsed2);
                        System.out.println("It Failed!");

                        System.out.println(user + " used " + MoveUsed);
                        System.out.println("It Succeeded!");
                        Poison(Opponent);
                        System.out.println(Opponent + " lost " + Damage2M + "HP!");
                        HP2 = HP2 - Damage2M;
                        check();
                    } else {
                        int speed = rand.nextInt(2) + 1;
                        if (speed == 1) {
                            Faster1=false;
                            System.out.println(user + " used " + MoveUsed);
                            System.out.println("It Succeeded!");
                            Poison(Opponent);
                            System.out.println(Opponent+ " lost " + Damage2M + "HP!");
                            HP2 = HP2 - Damage2M;
                            check();
                            System.out.println(Opponent + " used " + MoveUsed2);
                            System.out.println("It Failed!");

                        }
                        if (speed == 2) {
                            Faster1=true;
                            System.out.println(Opponent+ " used " + MoveUsed2);
                            System.out.println("Failed!");

                            System.out.println(user + " used " + MoveUsed);
                            System.out.println("It Succeeded!");
                            Poison(Opponent);
                            System.out.println(Opponent + " lost " + Damage2M + "HP!");
                            HP2 = HP2 - Damage2M;
                            check();
                        }
                    }
                }
                if (Hit1 == false) {
                    if (Speed > 0) {
                        Faster1=false;
                        System.out.println(user + " used " + MoveUsed);
                        System.out.println("It Failed!");

                        System.out.println(Opponent+ " used " + MoveUsed2);
                        System.out.println("It Failed!");

                    }
                    else if (Speed < 0) {
                        Faster1=true;
                        System.out.println(Opponent+ " used " + MoveUsed2);
                        System.out.println("It Failed!");

                        System.out.println(user + " used " + MoveUsed);
                        System.out.println("It Failed!");

                    } else {
                        int speed = rand.nextInt(2) + 1;
                        if (speed == 1) {
                            Faster1=false;
                            System.out.println(user + " used " + MoveUsed);
                            System.out.println("It Failed!");

                            System.out.println(Opponent+ " used " + MoveUsed2);
                            System.out.println("It Failed!");

                        }
                        if (speed == 2) {
                            Faster1=true;
                            System.out.println(Opponent+ " used " + MoveUsed2);
                            consoleInput.next();
                            System.out.println("It Failed!");

                            System.out.println(user + " used " + MoveUsed);

                            System.out.println("It Failed!");

                        }
                    }
                }
            }
        }
    }

    public static void BeforeBattle()
    {
       /* System.out.println("Do you want to play in hack mode (you will always win)...answer Yes or No");
        String Hack = consoleInput.next();
        if (!Hack.equals("Yes") && !Hack.equals("No")) {
            System.out.println("Invalid Answer... Try Again");
            Hack = consoleInput.next();
        }
        if(Hack.equals("Yes"))
        {
            System.out.println("Yay! You Won!");
            System.out.println("Psyche!!! Life's not that easy...dont be lazy and play the game (You'll Win Anyway)");
            hack=true;
        }
        else
        {
            hack=false;
        }*/
        System.out.println("Choose Your Pokemon (Choose from " + Pokemon3 + ", " +Pokemon2 +" or " + Pokemon1 + " or " + Pokemon4 + ")");
        String Pokemon = consoleInput.next();
        while (!(Pokemon.equals(Pokemon2) || Pokemon.equals(Pokemon1) || Pokemon.equals(Pokemon3) || Pokemon.equals(Pokemon4)))
        {
            System.out.println(Error1);
            Pokemon = consoleInput.next();
        }
        System.out.println("You chose: " + Pokemon);

        user=Pokemon;
        if(Pokemon.equals(Pokemon1)) {
            UserNumber =1;
            typex1=6;
            typey1=6;
        }
        else if(Pokemon.equals(Pokemon2)) {
            UserNumber =2;
            typex1=8;
            typey1=10;
        }
        if(Pokemon.equals(Pokemon3)) {
            typex1=2;
            typey1=11;
            UserNumber =3;
        }
        if(Pokemon.equals(Pokemon4)) {
            typex1=4;
            typey1=11;
            UserNumber =4;
        }


        int opponent=rand.nextInt(4)+1;
        while(opponent==UserNumber)
        {
            opponent=rand.nextInt(4)+1;
        }
        if(opponent==1)
        {
            typex2=6;
            typey2=6;
            Opponent=Pokemon1;
            System.out.println("Your Opponent is " + Pokemon1);
        }
        else if(opponent==2)
        {
            typex2=8;
            typey2=10;
            Opponent=Pokemon2;
            System.out.println("Your Opponent is " + Pokemon2);
        }
        else if(opponent==3)
        {
            typex2=2;
            typey2=11;
            Opponent=Pokemon3;
            System.out.println("Your Opponent is " + Pokemon3);
        }
        else if(opponent==4)
        {
            typex2=4;
            typey2=11;
            Opponent=Pokemon4;
            System.out.println("Your Opponent is " + Pokemon4);
        }


    }

    public static void main(String[] args) {
        Game.initialize(800, 600, 60, new Level1());
        while (RunCode == true) {
            //check();
            BeforeBattle();

            //     if (user.equals(Pokemon1)) {
            //   System.out.println("You Opponent is: "+ Pokemon2);
            //      Opponent = Pokemon2;
            //      } else if (user.equals(Pokemon2)) {
            //     System.out.println("You Opponent is: " + Pokemon1);
            //     Opponent = Pokemon1;
            //      }

            while (battle == true) {
                if (hack==true)
                {
                    //hack();

                }
                MoveNumber++;
                Battle(user);
                Speed=0;
                if(Poisoned1==true && status1>1)
                {
                    HP1=HP1-15;
                    status1--;
                    System.out.println(user + " was hurt by the Poison");
                }
                if(Poisoned2==true && status2>1)
                {
                    HP2=HP2-15;
                    status2--;
                    System.out.println(Opponent + " was hurt by the Poison");
                }
                if(MoveUsed.equals(MovePokemon33))
                {

                }
                if (Disabled1==false)
                {
                    Hit1=true;
                    //   System.out.println("test");

                }

                if (Disabled2==false)
                {
                    Hit2=true;
                    //    System.out.println("test");

                }

                if (Disabled1==true && Hit1==true)
                {
                    Hit1=false;
                    Disabled1=false;
                    wasDis1=true;
                }

                if (Disabled2 && Hit2==true)
                {
                    Hit2=false;
                    Disabled2=false;
                    wasDis2=true;
                }
                if(burned1 || Poisoned1 || Confused1)
                {
                    xstatus=true;
                    //    System.out.println("Status1");
                }
                else
                {
                    xstatus=false;
                    //   System.out.println("Status2");
                }
                if(burned2 || Poisoned2 || Confused2)
                {
                    ystatus=true;
                }
                else
                {
                    ystatus=false;
                }
                xHit1=1;
                yHit1=1;
                xHit2=1;
                yHit2=1;
                check();
            }
            if(Faster1==true)
            {
                if (alive1 == false) {
                    if (user.equals(user)) {
                        //     System.out.println("Death");
                        System.out.println("Your " + user + " Died!");
                    }


                }
                else if (alive2 == false) {

                    System.out.println(Opponent + " Died, YOU WON!!!");

                }
            }
            else
            {
                if (alive2 == false) {

                    System.out.println(Opponent+ " Died, YOU WON!!!");

                }
                else if (alive1 == false) {

                    System.out.println("Your " + user + " Died!");

                }
            }


            System.out.println("Do you want a Rematch? (Yes or No)");

            String Rematch = consoleInput.next();
            while (!Rematch.equals("Yes") && !Rematch.equals("No")) {
                System.out.println("Invalid Answer... Try Again");
                Rematch = consoleInput.next();
            }
            if (Rematch.equals("Yes")) {

                Pokemon1="Pikachu";
                Pokemon2="Mimikyu";
                Pokemon3="Charizard";
                Pokemon4="Gyarados";
                MovePokemon11 = "Iron Tail";
                MovePokemon12 = "Thunderbolt";
                MovePokemon13 = "Electro Ball";
                MovePokemon14 = "Quick Attack";
                MovePokemon21 = "Shadow Sneak";
                MovePokemon22 = "Shadow Claw";
                MovePokemon23 = "Shadow Ball";
                MovePokemon24 = "Play Rough";
                MovePokemon31 = "Hyper Beam";
                MovePokemon32 = "Fire Spin";
                MovePokemon33 = "Toxic";
                MovePokemon34 = "Dragon Claw";
                MovePokemon41 = "Dragon Pulse";
                MovePokemon42 = "Hydro Pump";
                MovePokemon43 = "Ice Beam";
                MovePokemon44 = "Hurricane";
                Restricted1=false;
                Restricted2=false;
                xR1=0;
                xR2=0;
                Poisoned1=false;
                Poisoned2=false;
                Confused1=false;
                Confused2=false;
                StatusChance1=0;
                StatusChance2=0;
                burned1=false;
                burned2=false;
                Disabled1=false;
                Disabled2=false;
                Error1="Please Choose a Valid Pokemon (This is Case Sensitive!)";
                Error2="Please Choose a Valid Move (This is Case Sensitive!)";
                Opponent="Nothing";
                Damage2M=0;
                Damage2P=0;
                HP1=500;
                HP2=500;
                ChanceP=100;
                ChanceM=100;
                Speed=0;
                MoveUsed="Nothing";
                MoveUsed2="Nothing";
                Hit1=true;
                Hit2=true;
                user="Nothing";
                battle=true;
                alive2=true;
                alive1=true;
                RunCode=true;
                hack=true;
                Faster1=false;
                MoveNumber=0;
                UserNumber=0;
                xHit1=1;
                yHit1=1;
                xHit2=1;
                yHit2=1;
                status1=0;
                status2=0;
                wasDis1=false;
                wasDis2=false;
                xstatus=false;
                ystatus=false;
                Cin1=-1;
                Cin2=-1;
            }
            else
            {
                RunCode=false;
            }


        }
    }
}
