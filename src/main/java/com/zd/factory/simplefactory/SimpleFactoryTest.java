package com.zd.factory.simplefactory;

import com.zd.factory.ICourses;

public class SimpleFactoryTest {
    public static void main(String[] args) {

//        ICourses iCourses = new JavaCourses();
//        iCourses.record();

        CoursesFactory factory = new CoursesFactory();
        ICourses iCourses = factory.create("PYTHON");
        iCourses.record();


    }
}
