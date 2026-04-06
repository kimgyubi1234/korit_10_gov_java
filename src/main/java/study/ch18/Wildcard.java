package study.ch18;

import study.ch17.User;

class Person {

}

class Student extends Person {

}

class HighStudrent extends Student {

}

public class Wildcard {
    // ? extends Object, 오버로딩 안됨
    public static void print(SuccessResponse<?> sr) {
        System.out.println(sr);
    }
    // 학생 아래(자식)만 받을 수 있음 = 상한선을 정했다 => 상한 제한 와일드 카드
    public static void print2(SuccessResponse<? extends Student> sr) {
        System.out.println(sr);
    }
    // 학생 위(부모)만 받을 수 있음 = 하한성을 정했다. => 하한 제한 와딩드카드
    public static void print3(SuccessResponse<? super Student> sr) {
        System.out.println(sr);
    }

    public static void main(String[] args) {
        SuccessResponse<User> sr1 = new SuccessResponse<>(200, User.builder().build());
        SuccessResponse<String> sr2 = new SuccessResponse<>(201, "그냥 문자열");

        Wildcard.print(sr1);
        Wildcard.print(sr2);

//      Wildcard.print2(new SuccessResponse<>(200, new Person())); // 상찬 제약 걸림
        Wildcard.print2(new SuccessResponse<>(200, new Student()));
        Wildcard.print3(new SuccessResponse<Student>(201, new Student()));
//      Wildcard.print3(new SuccessResponse<HighStudrent>(201, new HighStudrent())); // 하한 제약 걸림
    }
}