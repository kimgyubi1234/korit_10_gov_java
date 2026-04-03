package study.ch14;

import java.util.Objects;

class Teacher {
    private String name;
    private int age;

    public Teacher(String 김준일, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
//        if (!(o instanceof Teacher teacher)) return false;
//        return age == teacher.age && Objects.equals(name, teacher.name);

        if (!(o instanceof Teacher)) { // 여기의 Teacher는 ch14에 들어 있는 챕터다
            return false;
        }
        Teacher teacher = (Teacher) o;
        return this.age == teacher.age && this.name.equals(teacher.name);
    }

}

    public class Equals {
    public static void main(String[] args) {
        Teacher teachers1 = new Teacher("김준일", 33);
        Teacher teachers2 = new Teacher("김준일", 33);

        System.out.println(teachers1.equals(teachers2));
        System.out.println(teachers1 == teachers2);
    }
}
