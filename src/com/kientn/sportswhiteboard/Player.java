package com.kientn.sportswhiteboard;

import android.*;
import android.R;

/**
 * Created with IntelliJ IDEA.
 * User: kien326
 * Date: 25.05.13
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    int counterBlue;
    int counterRed;
    int gameBlue;
    int gameRed;
    String bluePlayer, redPlayer;


    public Player(String bp, String rp)
    {
        counterBlue = 0;
        counterRed = 0;
        gameBlue = 0;
        gameRed = 0;
        bluePlayer = bp;
        redPlayer = rp;
    }
    public int getCounterBlue(){
        return counterBlue;
    }

    public int getCounterRed(){
        return counterRed;
    }

    public int getGameBlue(){
        return gameBlue;
    }

    public int getGameRed(){
        return gameRed;
    }

    public String getBluePlayer(){
        return bluePlayer;
    }






}
