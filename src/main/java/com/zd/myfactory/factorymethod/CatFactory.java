package com.zd.myfactory.factorymethod;


import com.zd.myfactory.Animal;
import com.zd.myfactory.Cat;

public class CatFactory implements AnimalFatory {
    @Override
    public Animal create() {
        return new Cat();
    }
}
