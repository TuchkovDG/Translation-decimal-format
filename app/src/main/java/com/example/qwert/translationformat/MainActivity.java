package com.example.qwert.translationformat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Frag1 highFragment = Frag1.newInstance();
        Frag2 lowerFragment = Frag2.newInstance();

        highFragment.setSender1(lowerFragment);
        highFragment.setSender2(lowerFragment);
        highFragment.setSender3(lowerFragment);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.f1, highFragment, Frag1.class.getSimpleName())
                .replace(R.id.f2, lowerFragment, Frag2.class.getSimpleName())
                .commit();
    }
}
