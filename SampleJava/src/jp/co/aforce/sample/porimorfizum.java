package jp.co.aforce.sample;

public class porimorfizum {

    
    class Animal {
        void makeSound() {
            System.out.println("some sound...");
        }
    }

   
    class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("ワンワン！");
        }
    }

    
    class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("ニャー！");
        }
    }

}
