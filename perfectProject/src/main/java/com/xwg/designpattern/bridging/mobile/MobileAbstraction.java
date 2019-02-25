package com.xwg.designpattern.bridging.mobile;

import com.xwg.designpattern.bridging.soft.SoftAbstraction;

public abstract class MobileAbstraction {

    public SoftAbstraction softAbstraction;

    public void setSoftAbstraction(SoftAbstraction softAbstraction) {
        this.softAbstraction = softAbstraction;
    }

    public void run() {
        softAbstraction.work();
    }
}
