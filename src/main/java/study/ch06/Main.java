package study.ch06;

public class Main {
    public static void main(String[] agrs) {
        char c = 'c';

        switch (c) { //조건이 아니라 선택을 함
            case 'a':
                System.out.println("a를 선택하셨습니다.");
            case 'b':
                System.out.println("b를 선택하셨습니다.");
                break; // a나 b를 실행해도 abcd다 나오는게 아니라 b까지만 출력된다.
            case 'c':
                System.out.println("c를 선택하셨습니다.");
            case 'd':
                System.out.println("d를 선택하셨습니다.");
        }

    }
}
