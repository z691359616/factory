package com.zd.factory.abstractfactory;

/**
 * zhangda  2019/4/9
 **/
public class JavaCoursesFactory implements CoursesFactory {
    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
