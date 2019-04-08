package com.zd.factory;

public class JavaCourses implements ICourses {
    @Override
    public void record() {
        System.err.println("录制JAVA课程。。。");
    }
}
