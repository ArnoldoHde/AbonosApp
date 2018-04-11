package com.example.arnoldo.myapplication;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by arnoldo on 10/04/18.
 */

public class BusProvider {
    public static final Bus BUS =new Bus(ThreadEnforcer.ANY);

    public static Bus getInstnce(){
        return BUS;
    }
}
