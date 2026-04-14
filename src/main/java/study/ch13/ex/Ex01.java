package study.ch13.ex;

import static java.lang.IO.println;

class Animal {
    String name;
    Animal (String name) {
        this.name = name;
    }
    void eat() {println(name + "이(가) 밥을 먹는다.");}
}

class Dog extends Animal {
    String bread;
    Dog(String name, String bread) {
        super(name);
        this.bread = bread;
    }
    void bark() {
        println("멍멍");
    }
}

class Cat extends Animal {
    String isIndoor;
    Cat(String name, String isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }
    void meow(){
        println("야옹!");
    }
}

public class Ex01 {
}
