package com.zd.factory.abstractfactory;

import java.lang.annotation.Inherited;

/**
 * zhangda  2019/4/9
 **/
public class PythonNote implements INote {
    @Override
    public void edit() {
        System.err.println("python note....");
    }
}
