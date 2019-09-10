package com.example.daggerstep2;

import java.util.Random;

import javax.inject.Inject;

public class FortuneMachine {

    // これでNewしているのと同じ扱い
    @Inject
    TwiterClient twiterClient;

    String[] fortunes = {"大吉","中吉","小吉","凶","大凶"};

    // コンストラクタにも必要
    @Inject
    public FortuneMachine(){
        // twiterClient = new TwiterClient();
    }

    public String checkFortune(){
        int no = getRandomNo();
        twiterClient.postData(fortunes[no]);
        return fortunes[no];
    }

    public int getRandomNo(){
        Random r = new Random();
        int n = r.nextInt(fortunes.length);

        return n;
    }
}

