package com.zd.myfactory.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        AnimalFactory factory = new DogFactory();
        factory.createJumpAnimal().jump();
        factory.createRunAnimal().run();

        factory = new CatFactory();
        factory.createRunAnimal().run();
        factory.createJumpAnimal().jump();

    }
}
