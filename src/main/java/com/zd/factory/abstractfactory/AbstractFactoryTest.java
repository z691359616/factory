package com.zd.factory.abstractfactory;

/**
 * zhangda  2019/4/9
 **/
public class AbstractFactoryTest {
    public static void main(String[] args) {
        CoursesFactory factory = new JavaCoursesFactory();
        factory.createNote().edit();

        factory = new PythonCoursesFactory();
        factory.createVideo().record();
    }
}
