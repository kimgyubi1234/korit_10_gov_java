package study.ch13.ex;

class Studnet {
    String name;
    int age;
    double gpa;

    Studnet(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ",gpa=" + gpa + "}";
    }
}

public class Ex07 {

}
