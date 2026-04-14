package study.ch19.ex;

import java.util.ArrayList;
import java.util.List;

class Student {
    String name; int score;

    Student(String name, int score) {
        this.name = name; this.score = score;
    }
    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";}
}


public class Ex01 {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("김자바", 90));
        list.add(new Student("이파이", 85));
        list.add(new Student("박씨플", 78));
        list.add(new Student("최고랭", 92));
        list.add(new Student("정루비", 88));
        for (Student s : list) System.out.println(s);
    }
}
