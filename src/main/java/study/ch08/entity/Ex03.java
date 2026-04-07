package study.ch08.entity;

public class Ex03 {
        static class Person {
            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        public class Main {
            public static void main(String[] args) {
                Person p = new Person("김자바", 25); // 컴파일 오류!
            }
        }
}

//설계도에 적힌 괄호 () 안의 조건과, 실제로 객체를 만들 때(호출할 때) 괄호 () 안에 넣는 재료는 거울처럼 똑같이 짝이 맞아야 함
// Person() {} ➔ new Person();
// Person() {} ➔ new Person();
// Person(String name, int age) {} ➔ new Person("김철수", 25);