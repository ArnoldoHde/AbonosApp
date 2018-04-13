package com.example.arnoldo.myapplication.Utils;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;

/**
 * Created by arnoldo on 10/04/18.
 */
// se encarga de repartir la informacion
public class BusProvider {
    public static final Bus BUS =new Bus(ThreadEnforcer.ANY);

    public static Bus getInstnce(){
        return BUS;
    }
}
