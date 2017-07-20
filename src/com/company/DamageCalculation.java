package com.company;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by yuuki.sawanoi on 7/17/2017.
 */
public class DamageCalculation {
    public static Random rand = new Random();
    public static Scanner consoleInput = new Scanner(System.in);
   // public static int HP;
   // public static int Attack;
    public static int Damage = 0;

    public int DamageCalculation(int A, int B, int C, int D, int X, int Y) {
        int Z = rand.nextInt(38) + 217;
        Damage = 2 * A;
        Damage /= 5;
        Damage += 2;
        Damage *= B * C;
        Damage /= D;
        Damage /= 50;
        Damage += 2;
        Damage *= X * Y;
        Damage /= 10;
        Damage *= Z;
        Damage /= 255;
    return Damage;


    }
}

