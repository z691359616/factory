package com.zd.factory.abstractfactory;

/**
 * zhangda  2019/4/9
 **/
public interface CoursesFactory {
    INote createNote();
    IVideo createVideo();
}
