package com.example.daggerstep2;

import android.util.Log;

public class TwiterClient {



    public TwiterClient(){

    }

    public boolean postTwitter(String fortune){

        // Twitterに通信処理
        Log.w("DEBUG_DATA","postTwitter " + fortune);


        return true;
    }

}
