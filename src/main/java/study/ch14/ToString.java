package study.ch14;

import java.util.Arrays;

class Student extends Object {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() { // 이 객체가 어떤 값을 가지고 있나 문자열로 확인해서 return 해줌
        return "이름: " + name + "점수: " + score;
    } // 모든 객체는 toString을 가지고 있다 > Object를 상속받고 있어서
}

public class ToString {
    public static void main(String[] args) {
        Student student = new Student("김준일", 90);
        System.out.println(student.toString());
        System.out.println(student);
        System.out.println(student);
        String a = student.toString();
        System.out.println(a);
        int [] nums = {1, 2, 3, 4};
        System.out.println(nums);
        System.out.println(Arrays.toString(nums));
    }
}
