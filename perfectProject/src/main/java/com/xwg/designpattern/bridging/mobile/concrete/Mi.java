package com.xwg.designpattern.bridging.mobile.concrete;

import com.xwg.designpattern.bridging.mobile.MobileAbstraction;

public class Mi extends MobileAbstraction {

    @Override
    public void run() {
        System.err.println("Mi再玩");
        softAbstraction.work();
    }
}
