package com.example.arnoldo.myapplication.Utils;

import android.support.v7.app.AppCompatActivity;

import com.squareup.otto.Subscribe;

/**
 * Created by sauceda on 26/04/18.
 */

public class BaseActivity extends AppCompatActivity {

    public void onResume() {
        super.onResume();
        BusProvider.getInstnce().register(this);
    }

    @Subscribe
    public void onPause() {
        BusProvider.getInstnce().unregister(this);
        super.onPause();
    }
}
