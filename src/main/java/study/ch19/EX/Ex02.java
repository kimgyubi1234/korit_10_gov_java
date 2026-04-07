package study.ch19.EX;
// ArrayList에서 중복 요소를 제거한 새 리스트를 만드시오. (순서 유지)
// 입력: ["Java", "Python", "Java", "C++", "Python", "Go"]
// 출력: ["Java", "Python", "C++", "Go"]

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> subjects = new ArrayList<>(List.of("Java","Python","Java","C++","Python","Go"));
        List<String> results = new ArrayList<>();
        for (int i = 0; i < subjects.size(); i++) {
            String subject = subjects.get(i);
            if (!results.contains(subject)) {
                results.add(subject);
            }
        }
        System.out.println(results);
    }
}
