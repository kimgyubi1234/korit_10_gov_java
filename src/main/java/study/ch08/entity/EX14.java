package study.ch08.entity;

class Member {
    String name;
    int age;

/*    Member(String name) {
        // 직접 대입
        this.name = name; //this()는 반드시 생성자의 첫 번째 줄에 와야 한다.
        // 생산자 호출, 위임
        this(name, 0);   //this.name = name; 뒤에 this()를 호출했으므로 오류.
    }*/

    Member(String name) {
        this(name, 0);
    }

    Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class EX14 {
}
