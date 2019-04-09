package com.zd.myfactory.factorymethod;


import com.zd.myfactory.Animal;
import com.zd.myfactory.Dog;

public class DogFactory implements AnimalFatory {
    @Override
    public Animal create() {
        return new Dog();
    }
}
