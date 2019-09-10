package com.example.daggerstep2;

import android.util.Log;

import javax.inject.Inject;

public class TwiterClient {

    // コンストラクタにも必要
    @Inject
    public TwiterClient(){
    }

    public boolean postData(String fortune){

        // Twitterに通信処理
        Log.w("DEBUG_DATA","postData " + fortune);

        return true;
    }
}

