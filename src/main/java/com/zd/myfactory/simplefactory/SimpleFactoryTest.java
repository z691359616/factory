package com.zd.myfactory.simplefactory;

import com.zd.myfactory.Animal;

/**
 * zhangda  2019/4/9
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
//        test_1();
        test_2();
    }
    public static void test_2(){
        AnimalFactory2 factory = new AnimalFactory2();
        Animal animal = factory.create("com.zd.myfactory.Cat");
        animal.say();
    }
    public static void test_1(){
        AnimalFactory1 factory = new AnimalFactory1();
        Animal dog = factory.create("DOG");
        dog.say();
        Animal cat = factory.create("CAT");
        cat.say();
    }
}
