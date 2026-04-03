package study.ch16;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString(onlyExplicitlyIncluded = true) // @ToString.Include가 된 것들만 올리겠다
class Student {
    @ToString.Include
    private String name;
    @ToString.Include
    private static String schoolName;

    public static void setSchoolName(String schoolName) {
        Student.schoolName = schoolName;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static Student getNewStudent (String name) {
        Student student = new Student();
        student.setName(name);
        return student;
    }
}

public class Static01 {
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("김준일");

        Student.setSchoolName("부경대학교"); // 누워진 글씨가 public이면서 static
        System.out.println(Student.getSchoolName());

        Student student = new Student();
        student.setName("김준일");
        System.out.println(student);

        Student student2 = Student.getNewStudent("김준이");
    }
}
