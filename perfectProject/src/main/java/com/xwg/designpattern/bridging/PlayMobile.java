package com.xwg.designpattern.bridging;

import com.xwg.designpattern.bridging.mobile.concrete.Mi;
import com.xwg.designpattern.bridging.soft.concrete.Qq;
import com.xwg.designpattern.bridging.soft.concrete.Wechat;

public class PlayMobile {

    public static void main(String[] args) {
        Mi mi = new Mi();
        mi.setSoftAbstraction(new Wechat());
        mi.run();
    }
}
