package study.ch08.entity;

public class Ex02 {
    public static void main(String[] args) {
        class Cat {
            String name;

            Cat(String name) {
                this.name = name;
                System.out.println(name + " 탄생!");
            }
        }

        class Main {
            public void main(String[] args) {
                Cat c1 = new Cat("나비");
                Cat c2 = new Cat("야옹이");
            }
        }
    }
}