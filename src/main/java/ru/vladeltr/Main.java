package ru.vladeltr;

import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        var cat1 = new Cat();
        cat1.setName("Maryusya");
        cat1.setColour("Orange");
        System.out.println(cat1.getName());
        System.out.println(cat1.getColour());

        cat1.setColour("Black");
        System.out.println(cat1.getName());
        System.out.println(cat1.getColour());

        Cat cat2 = new Cat();
        cat2.setName("Murka");
        cat2.setColour("White");
        System.out.println(cat2.getName());
        System.out.println(cat2.getColour());

        Dog dog = new Dog();
        dog.setName("borzik");
        dog.setColour("black");
        System.out.println(dog.getName());
        System.out.println(dog.getColour());

        cat1.speak();
        cat2.speak();
        dog.speak();

        Meat meat = new Meat();
        cat1.eat(meat);
        dog.eat(meat);

        Sweet sweet = new Sweet();
        cat1.eat(meat);
    }   // the end main
}   // конец класса Main
