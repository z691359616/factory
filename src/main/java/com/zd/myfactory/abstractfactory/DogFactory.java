package com.zd.myfactory.abstractfactory;

public class DogFactory implements AnimalFactory {


    @Override
    public Run createRunAnimal() {
        return new RunDog();
    }

    @Override
    public Jump createJumpAnimal() {
        return new JumpDog();
    }
}
