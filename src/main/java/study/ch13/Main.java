package study.ch13;

abstract class Person {
    private String lastName;
    private String fistName;

    public abstract void showName();
    public void showName2() {

    }
}
interface Person2 {
    public String lastName = " "; //누운 글씨체는 인텔리체 >> 스테틱?
    public String fistName = " ";

    public abstract void showName(); // 추상 메소드
    // abstract은 반드시 상속에 사용하는데 private가 되면 공유가 되지 않아 같이 못 쓴다
    public default void showName2() { // 일반 메소드

    }
}

class Student extends Person {
    @Override
    public void showName() {

    }
}

class Student2 implements Person2 {
    @Override
    public void showName() {

    }
}

public class Main {
    public static void main(String[] args) {
        Person p1 = new Student(); // 추상클래스
        Person2 p2 = new Student2(); // 인터페이스
    }
}
