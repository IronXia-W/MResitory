package com.xwg.designpattern.bridging.mobile.concrete;

import com.xwg.designpattern.bridging.mobile.MobileAbstraction;

public class Huawei extends MobileAbstraction {

    @Override
    public void run() {
        softAbstraction.work();
        System.err.println("huawei在玩");
    }
}
