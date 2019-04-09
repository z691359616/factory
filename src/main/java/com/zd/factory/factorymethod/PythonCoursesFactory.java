package com.zd.factory.factorymethod;

import com.zd.factory.ICourses;
import com.zd.factory.PythonCourses;

/**
 * zhangda  2019/4/9
 **/
public class PythonCoursesFactory implements ICoursesFactory {
    @Override
    public ICourses create() {
        return new PythonCourses();
    }
}
