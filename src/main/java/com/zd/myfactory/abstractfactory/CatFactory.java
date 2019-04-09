package com.zd.myfactory.abstractfactory;

public class CatFactory implements AnimalFactory {
    @Override
    public Run createRunAnimal() {
        return new RunCat();
    }

    @Override
    public Jump createJumpAnimal() {
        return new JumpCat();
    }
}
