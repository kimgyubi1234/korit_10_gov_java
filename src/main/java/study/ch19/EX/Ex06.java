package study.ch19.EX;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Builder
class Student {
    private String name;
    private int studentYear;
    private int korScore;
    private int engScore;
    private int mathScore;
}

public class Ex06 {
    public static void main(String[] args) {
        int surrnetSutdentCode = 20260000;
        List<Student> studentList = List.of(
                Student.builder().name("김준일").studentYear(1).korScore(80).engScore(90).mathScore(100).build(),
                Student.builder().name("김준이").studentYear(2).korScore(70).engScore(80).mathScore(90).build(),
                Student.builder().name("김준삼").studentYear(1).korScore(90).engScore(80).mathScore(70).build(),
                Student.builder().name("김준사").studentYear(2).korScore(60).engScore(70).mathScore(80).build()
        );

        Map<Integer, List<Student>> studentMap = Map.of(
                1, new ArrayList<>(),
                2, new ArrayList<>()
        );
        for (Student student : studentList) {
            studentMap.get(student.getStudentYear()).add(student);
        }

        Map<String, Double> scoreMap = new HashMap<>(Map.of(
                "korScore", 0.0,
                "engScore", 0.0,
                "mathScore", 0.0
        ));
/*      double a = 0;
        double b = 0;
        double c = 0;
        for (Student student : studentList) {
            a += student.getKorScore();
            b += student.getEngScore();
            b += student.getMathScore();
        }*/
        for(Student student : studentList) {
            scoreMap.replace("koScore", scoreMap.get("korScore") + student.getStudentYear());
            scoreMap.replace("engScore", scoreMap.get("engScore") + student.getStudentYear());
            scoreMap.replace("mathScore", scoreMap.get("mathScore") + student.getStudentYear());
        }
        for (String key : scoreMap.keySet()) {
            scoreMap.replace(key, scoreMap.get(key) / studentList.size());
        }
        System.out.println(scoreMap);

        Map<String, Integer> totalScoreMap = new HashMap<>();
        // 키 값이 학생이고 총점이 밸류
        for (Student student : studentList) {
            totalScoreMap.put(student.getName(), student.getKorScore() + student.getEngScore() + student.getMathScore());
        }
        System.out.println(totalScoreMap);
    }
}
