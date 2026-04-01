package study.ch10.entity;

public class Ex14 {
    // for each로 String 배열에서 "a"로 시작하는 단어만 출력하라
    public static void main(String[] args) {
        String [] arr = {"apple", "banana", "avocado", "cherry", "apricot"};
        for (String n : arr) {
            if (n.charAt(0) == 'a') {
                System.out.println(n);
            }
        }

        System.out.println(" ");
        System.out.println("아래는 정답지입니다.");

        for (String s : arr) {
            if (s.startsWith("a")) System.out.println(s);
        }
    }
}
