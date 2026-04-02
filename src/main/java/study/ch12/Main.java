package study.ch12;

// 아래는 일회성으로만 쓸거라서 따로 파일을 따로 만들지 않았다. 익명 클래스
// 다운캐스팅은 불가. 자료형이 없어서.
// 익명 클래스는 추상, 인터페이스 가능
abstract class AA { // 익명 클래스 안에 함수 입력 가능

}

class BB extends AA {

}

class CC extends BB {

}

class MM {
    public static void main(String[] args) {
     //   AA a = new AA() // 추상클래스라 생성 불가능
        BB b = new BB();
        AA b2 = new BB();
        AA c = new AA() { // AA 객체가 아닌 이름 없는 객체. 업캐스팅 상태

        };
        AA cc = new CC();
        AA ccc = new BB () {

        };  // BB를 상속받은 이름없는 객체
        BB cccc = new BB() {

        };
    }
}

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
