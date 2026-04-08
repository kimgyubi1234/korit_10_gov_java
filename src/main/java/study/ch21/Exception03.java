package study.ch21;

import java.sql.SQLOutput;
import java.util.List;

public class Exception03 {
    public static void main(String[] args) {
        List<String> usernames = List.of("aaa", "bbb", "ccc");

        String txt = null;
        try {
            if (txt == null) {
                throw new NullPointerException();
            } else {
                boolean isEmpty = usernames.stream().filter(u -> u.equals(usernames)).count() == 0;

                if (isEmpty) {
                    throw new UsernameNotFoundException();
                }
            }
        } catch (NullPointerException e) {
            System.out.println("username이 Null입니다.");
        } catch (UsernameNotFoundException e) {
            System.out.println("사용자 아이디를 찾지 못했습니다.");
        }
        System.out.println("프로그램 정상 종료");
    }
}