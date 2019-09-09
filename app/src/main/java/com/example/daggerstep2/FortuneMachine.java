package com.example.daggerstep2;

import android.util.Log;

import java.util.Random;

public class FortuneMachine {
    TwiterClient twiterClient;

    String[] fortunes = {"大吉","中吉","小吉","凶","大凶"};

    public FortuneMachine( TwiterClient tc){
        twiterClient = tc;
    }

    public String checkFortune(){
        int no = getRandomNo();
        twiterClient.postTwitter(fortunes[no]);
        return fortunes[no];
    }

    public int getRandomNo(){
        Random r = new Random();
        int n = r.nextInt(fortunes.length);

        return n;
    }
}
