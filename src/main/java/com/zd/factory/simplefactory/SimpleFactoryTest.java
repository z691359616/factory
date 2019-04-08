package com.zd.factory.simplefactory;

import com.zd.factory.ICourses;
import com.zd.factory.PythonCourses;

public class SimpleFactoryTest {
    public static void main(String[] args) {

//        ICourses iCourses = new JavaCourses();
//        iCourses.record();

//        CoursesFactory factory = new CoursesFactory();
//        ICourses iCourses = factory.create("PYTHON");
//        iCourses.record();

//        CoursesFactory factory = new CoursesFactory();
//        ICourses iCourses =  factory.create("com.zd.factory.JavaCourses");
//        iCourses.record();

        CoursesFactory factory = new CoursesFactory();
        ICourses iCourses =  factory.create(PythonCourses.class);
        iCourses.record();


    }
}
