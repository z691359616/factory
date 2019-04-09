package com.zd.factory.abstractfactory;

/**
 * zhangda  2019/4/9
 **/
public class PythonCoursesFactory implements CoursesFactory {
    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
