package study.ch08.entity;
// 다음 요구사항을 모두 만족하는 `Car` 클래스를 작성하시오.
//
//**필드 (모두 private):**
//
//- `String brand`, `String color`, `int speed`
//
//**생성자 오버로딩 (this() 활용):**
//
//- `Car(String brand)` → color="검정", speed=0
//- `Car(String brand, String color)` → speed=0
//- `Car(String brand, String color, int speed)` → 메인 생성자
//
//**메서드:**
//
//- `void accelerate(int amount)` — speed 증가
//- `void accelerate()` — speed 10 증가 (메서드 오버로딩)
//- `void brake()` — speed 10 감소 (0 미만이면 0으로)
//- Getter: `getBrand()`, `getColor()`, `getSpeed()`
//- `void printStatus()` — "[brand/color] 현재 속도: speed km/h" 출력

class Car {
    private String brand;
    private String color;
    private int speed;

    Car (String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }
    Car(String brand) {
        this(brand, "검정", 0);
    }
    Car(String brand, String color) {
        this(brand, color, 0);
    }

    void accelerate(int amount) {
        speed += amount;
    }
    void accelerate() {
        accelerate(10); // 이전 메소드 사용
    }
    void brake() {
        speed -= 10;
        if (speed < 0) speed = 0;

    }
    String getBrand() {return brand;}
    String getColor() {return color;}
    int getSpeed() {return speed;}

    void printStatus() {
        System.out.println("[" + brand + "/" + color + "] 현재속도: " + speed + "km/h");
    }
}

public class Ex20 {
}
