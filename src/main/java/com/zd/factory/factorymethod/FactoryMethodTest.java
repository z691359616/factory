package com.zd.factory.factorymethod;

/**
 * zhangda  2019/4/9
 **/
public class FactoryMethodTest {

    public static void main(String[] args) {
        ICoursesFactory factory = new JavaCoursesFactory();
        factory.create().record();


    }

}
