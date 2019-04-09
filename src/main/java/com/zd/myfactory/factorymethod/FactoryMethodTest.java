package com.zd.myfactory.factorymethod;

import com.zd.myfactory.Animal;

public class FactoryMethodTest {
    public static void main(String[] args) {
        AnimalFatory fatory = new CatFactory();
        Animal cat = fatory.create();
        cat.say();
        fatory = new DogFactory();
        Animal dog = fatory.create();
        dog.say();

    }
}
