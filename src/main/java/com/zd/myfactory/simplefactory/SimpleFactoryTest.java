package com.zd.myfactory.simplefactory;

import com.zd.myfactory.Animal;
import com.zd.myfactory.Cat;
import com.zd.myfactory.Dog;

/**
 * zhangda  2019/4/9
 **/
public class SimpleFactoryTest {
    public static void main(String[] args) {
//        test_1();
//        test_2();
        test_3();
    }
    public static void test_3(){
        AnimalFactory3 factory = new AnimalFactory3();
        Animal dog = factory.create(Dog.class);
        dog.say();
        Animal cat = factory.create(Cat.class);
        cat.say();
    }
    public static void test_2(){
        AnimalFactory2 factory = new AnimalFactory2();
        Animal cat = factory.create("com.zd.myfactory.Cat");
        cat.say();
    }
    public static void test_1(){
        AnimalFactory1 factory = new AnimalFactory1();
        Animal dog = factory.create("DOG");
        dog.say();
        Animal cat = factory.create("CAT");
        cat.say();
    }
}
