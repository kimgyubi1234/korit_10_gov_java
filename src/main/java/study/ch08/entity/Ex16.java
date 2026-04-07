package study.ch08.entity;

class Item {
    String name;
    int qty;

    Item() {
        this("이름없음", 0); // 생성자 체이닝(Constructor Chaining)
        System.out.println("기본 생성자 호출");
    }

    Item(String name, int qty) {
        this.name = name;
        this.qty = qty;
        System.out.println("매개변수 생성자 호출: " + name);
    }
}

public class Ex16 {
    public static void main(String[] args) {
        Item i = new Item();
    }
}

//**실행 순서:**
//
//1. `new Item()` → 기본 생성자 진입
//2. `this("이름없음", 0)` → 매개변수 생성자로 이동
//3. 매개변수 생성자 실행 → `"매개변수 생성자 호출: 이름없음"` 출력
//4. 매개변수 생성자 종료 → 기본 생성자로 복귀
//5. `"기본 생성자 호출"` 출력
//
//`this()`는 다른 생성자를 **호출 후 돌아와서** 나머지 코드를 실행한다.