package study.ch08.entity;
//다음 요구사항에 맞게 `Student` 클래스를 완성하시오.
//
//- 모든 필드는 `private`
//- 필드: `name`(String), `score`(int)
//- `getName()`, `setName()` — Getter/Setter
//- `getScore()`, `setScore()` — Getter/Setter (단, score는 0~100 범위만 허용, 범위 밖이면 변경 안 함)

class Student {
    private String name;
    private int score;

    Student(String name, int score) {
        this.name = name;
        setScore(score);  // setter를 통해 유효성 검사
    }

    // Getter
    String getName() {
        return name;
    }

    int getScore() {
        return score;
    }

    // Setter
    void setName(String name) {
        this.name = name;
    }

    void setScore(int score) {
        if (score >= 0 && score <= 100) {  // 유효성 검사
            this.score = score;
        }
        // 범위 밖이면 변경하지 않음
    }
}

public class Ex18 {
}
