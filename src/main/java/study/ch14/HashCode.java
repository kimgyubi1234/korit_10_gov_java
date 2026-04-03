package study.ch14;

import java.util.Objects;

class Dog {
    private String name;
    private int age;

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.age); // 두의 해시 값을 더해서 리턴을 함
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class HashCode {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 10); // 값이 같으면 같은 해시코드로 나옴
        Dog dog2 = new Dog("콩이", 10); // 패키지가 달라도 사용 가능
        System.out.println(dog.hashCode());
        System.out.println(dog2.hashCode()); // 값이 같아도 메모리코드?로 나옴
        Dog[] dogs = {
                new Dog("콩이이", 11),
                new Dog("콩삼", 12),
                new Dog("콩이", 10),
                new Dog("콩이", 11),
        };
        int hashCoed = Objects.hash("콩이", 10);
        Dog foundDog = null;
        for (Dog d : dogs) {
            if (d.hashCode() == hashCoed) {
                foundDog = d;
                break;
            }
        }
        System.out.println(foundDog);
    }
}
