package study.ch12;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Cat cat = new Cat();

        Animal [] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Animal() { // 이름이 없는 익명 class. 오버라이딩으로 Animal가 생성됨
            @Override // 추상화된 Animal이 자식 메소드로 완성이 되어서
                     // 생성과 동시에 객체가 됨
            public void eat() {

            }
        };
    }
}
