package study.ch13;

abstract class AbstractAnimal {
    private String name;
    public AbstractAnimal() { }
    public AbstractAnimal(String name) {this.name = name;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

interface Flyable {
    void fly();
}

interface Swimmmale {
    void swim();
}

class Duck extends AbstractAnimal implements Flyable, Swimmmale {
// implements는 구현하다라는 의미. 다중상속/다중구현이 가능. 인터페이스는 원하는 기능을 추가하게 해준다.
    public Duck() {
        super();
    }

    public Duck(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("날기!");
    }

    @Override
    public void swim() {
        System.out.println("수영하기!");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Duck duck = new Duck();
        AbstractAnimal animal = new Duck();
        Flyable flyable = new Duck();
        Swimmmale swimmmale = new Duck();

        duck.fly();
        duck.swim();
        duck.setName("우리집오리");
        System.out.println(duck.getName());

        animal.setName("옆집오리");
        System.out.println(animal.getName());

        flyable.fly();

        swimmmale.swim();
    }
}
