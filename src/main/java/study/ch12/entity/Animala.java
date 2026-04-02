package study.ch12.entity;

// 기본 상속 구현
//Animal 클래스를 상속하는 Dog, Cat 클래스를 작성하시오.
//Animal: 필드 String name, 생성자, 메서드 `void eat()` → "(이름)이(가) 밥을 먹는다" 출력
//Dog: Animal 상속, 필드 `String breed`, 생성자(super), 메서드 `void bark()` → "멍멍!" 출력
//Cat: Animal 상속, 필드 `boolean isIndoor`, 생성자(super), 메서드 `void meow()` → "야옹!" 출력

// 밑의 클래스와 이름이 겹쳐서 Animala로 수정한다
class Animala {
    String name;
    Animala(String name) {
        this.name = name; }
    void eat() {
        System.out.println(name + "이(가) 밥을 먹는다");
    }
}

class Dog extends Animala {
    String breed;
    Dog(String name, String breed){
        super(name);
        this.breed = breed;
    }
    void bark() {
        System.out.println("멍멍!");
    }
}

class Cat extends Animala {
    boolean isIndoor;
    Cat(String name, boolean isIndoor) {
        super(name);
        this.isIndoor = isIndoor;
    }
    void meow() {
        System.out.println("야옹!");
    }
}