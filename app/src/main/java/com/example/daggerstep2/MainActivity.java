package com.example.daggerstep2;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FortuneMachine fortuneMachine = new FortuneMachine(new TwiterClient());
        
        Log.w( "DEBUG_DATA", "result = " + fortuneMachine.checkFortune());
    }
}
