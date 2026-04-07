package study.ch08.entity;

public class Ex01{
    class Dog {
        String name;
        int age;
    }

    public class Main {
        public void main(String[] args) {
            Dog d = new Dog();
            System.out.println(d.name);
            System.out.println(d.age);
        }
    }
}