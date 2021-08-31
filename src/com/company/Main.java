package com.company;

public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog(15, "Black");
        Dog dog2 = new Dog(4);
        dog1.breed = "Has";
        dog2.breed = "Hay";

        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.hashCode());
        System.out.println(dog1.getClass());
        System.out.println(dog1.toString());


        dog1.breed = "Homeless";

        System.out.println(dog1.age);
        System.out.println(dog2.age);
        dog1.speak();

    }
}

