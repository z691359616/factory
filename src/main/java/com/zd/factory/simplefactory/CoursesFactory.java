package com.zd.factory.simplefactory;

import com.zd.factory.ICourses;
import com.zd.factory.JavaCourses;
import com.zd.factory.PythonCourses;

public class CoursesFactory {
    public ICourses create(String name){
        if("JAVA".equals(name)){
            return new JavaCourses();
        }else if("PYTHON".equals(name)){
            return new PythonCourses();
        }else
            return null;
    }
}
