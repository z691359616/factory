package com.zd.factory.simplefactory;

import com.zd.factory.ICourses;
import com.zd.factory.PythonCourses;
import org.slf4j.LoggerFactory;

import java.util.Calendar;
import java.util.logging.Logger;

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

        Calendar calendar = Calendar.getInstance();

        LoggerFactory.getLogger(SimpleFactoryTest.class);
    }
}
