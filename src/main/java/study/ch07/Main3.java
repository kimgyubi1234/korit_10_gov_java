package study.ch07;

public class Main3 {
    public static void main(String[] args) {
//        int num = 0; // while문의 초기 선언은 반드시 밖에서 실행
//        while (num < 10) {
//            // 이곳에도 num의 증감식을 작성할 수 있음
//            System.out.println(num);
//            num++;
//        }

        int i = 0;
        int count = 5;
        while (i < count) {
            int j = 0;
            while (j < count - 1 - i) {
                System.out.print(" ");
                j++;
            }

            j = 0; // 위 지역의 j는 역할을 다해 더 이상 사용하지 않아 새로 선언하여 사용한다.
            while (j < i + 1) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }
    }
}
