package com.xwg.LeiFengFactoryDemo.factory;

import com.xwg.LeiFengFactoryDemo.person.LeiFeng;
import com.xwg.LeiFengFactoryDemo.person.Student;

/**
 * Created by Administrator on 2017/4/10.
 */
public class StudentFactory implements ILeiFengFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Student();
    }
}
