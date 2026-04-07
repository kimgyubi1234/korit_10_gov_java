package study.ch08.entity;

// 다음 요구사항에 맞게 `Employee` 클래스의 생성자 3개를 `this()`를 활용하여 작성하시오.
//
//- 필드: `String name`, `String dept`, `int salary`
//- 생성자 1: `Employee(String name)` → dept="미배정", salary=0
//- 생성자 2: `Employee(String name, String dept)` → salary=0
//- 생성자 3: `Employee(String name, String dept, int salary)` → 모든 필드 초기화 (메인 생성자)

class Employee {
    String name;
    String dept;
    int salary;

    Employee(String name, String dept, int salary) { // 메인 생성자
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    Employee(String name){
        this(name, "미배정", 0);
    }

    Employee(String name, String dept){
        this(name, "미배정", 0);
    }
}

public class Ex15 {
}
