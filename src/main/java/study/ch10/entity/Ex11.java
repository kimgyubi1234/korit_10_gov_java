    package study.ch10.entity;

    public class Ex11 {
        //for each로 합계
        public static void main(String[] args) {
            double[] arr = {3.5, 2.1, 7.8, 4.6, 1.9};
            double k = 0;
            for (double d : arr) {
                k += d;}
                System.out.println("합계: " + k);

            System.out.println(" ");
            System.out.println("다음은 정답지 입니다.");

            double sum = 0;
            for (double d : arr) sum += d;
            System.out.printf("합계: %.1f%n", sum);
        }
    }