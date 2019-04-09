package com.zd.myfactory.simplefactory;

import com.zd.myfactory.Animal;

/**
 * zhangda  2019/4/9
 **/
public class AnimalFactory2 {
    public Animal create(String className){
        try{
            if(null != className && !"".equals(className)){
                return (Animal)Class.forName(className).newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
