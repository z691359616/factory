package com.zd.myfactory.simplefactory;

import com.zd.myfactory.Animal;

/**
 * zhangda  2019/4/9
 **/
public class AnimalFactory3 {
//    public Animal create(Class clazz){
//        try{
//            if(null != clazz){
//                return (Animal)clazz.newInstance();
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        return null;
//    }
    public Animal create(Class<? extends Animal> clazz){
        try{
            if(null != clazz){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
