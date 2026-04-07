package study.ch19;

//set은 집합 자료형, 이것이 있나 없나 확인하기 위해
import java.util.HashSet;
import java.util.Set;

public class SetMain {
    public static void main(String[] args) {
        Set<String> strSet = new HashSet<>();
        // 값 추가(중복x)
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");
        strSet.add("a");
        System.out.println(strSet);

        // 값 조회
        Set<User> userSet = new HashSet<>(Set.of(
                new User(1, "aaa"),
                new User(2, "bbb"),
                new User(3, "ccc"),
                new User(4, "ddd")
        ));
        System.out.println(userSet);
        int id = 3;
        for (User user : userSet) {
            if (user.getId() == id) {
                System.out.println("3번 아이디 찾음");
                System.out.println(user);
            }
        }
    }
}
