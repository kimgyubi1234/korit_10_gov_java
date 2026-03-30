package study.ch07.ex;

    public class Ex04 {
        public static void mai(String[] args) {
            int score = 95;
            if (score >= 60) {
                System.out.println("D");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 90) {
                System.out.println("A");
            }
        }
    }

    //if 문은 순차적으로 진행하여 먼저 나오는 식에 적용이 된다.