package com.zd.factory.factorymethod;

import com.zd.factory.ICourses;
import com.zd.factory.JavaCourses;

/**
 * zhangda  2019/4/9
 **/
public class JavaCoursesFactory implements ICoursesFactory {
    @Override
    public ICourses create() {
        return new JavaCourses();
    }
}
