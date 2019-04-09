package com.zd.myfactory.simplefactory;

import com.zd.myfactory.Animal;
import com.zd.myfactory.Cat;
import com.zd.myfactory.Dog;

/**
 * zhangda  2019/4/9
 **/
public class AnimalFactory1 {
    public Animal create(String name){

        if(null != name && "DOG".equals(name)){
            return new Dog();
        }else if(null != name && "CAT".equals(name)){
            return new Cat();
        }else
            return null;

    }
}
