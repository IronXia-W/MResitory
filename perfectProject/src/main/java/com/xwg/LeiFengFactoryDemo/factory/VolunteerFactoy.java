package com.xwg.LeiFengFactoryDemo.factory;

import com.xwg.LeiFengFactoryDemo.person.LeiFeng;
import com.xwg.LeiFengFactoryDemo.person.Volunteer;

/**
 * Created by Administrator on 2017/4/10.
 */
public class VolunteerFactoy implements ILeiFengFactory {

    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
