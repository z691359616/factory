package com.zd.factory.simplefactory;

import com.zd.factory.ICourses;
import com.zd.factory.JavaCourses;
import com.zd.factory.PythonCourses;

public class CoursesFactory {
//    public ICourses create(String name){
//        if("JAVA".equals(name)){
//            return new JavaCourses();
//        }else if("PYTHON".equals(name)){
//            return new PythonCourses();
//        }else
//            return null;
//    }

//    public ICourses create(String className){
//        try{
//            if(null != className && !"".equals(className) ){
//                return (ICourses) Class.forName(className).newInstance();
//            }else
//                return null;
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }

    public ICourses create(Class<? extends ICourses> clazz){
        try{
            if(null != clazz ){
                return clazz.newInstance();
            }else
                return null;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
