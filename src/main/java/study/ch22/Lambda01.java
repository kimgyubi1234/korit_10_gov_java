package study.ch22;

interface Calclator {
    int calc(int x, int y);
}

public class Lambda01 {
    public static void main(String[] args) {
        Calclator addition = new Calclator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        };
        Calclator additionLanbda = (int a, int b) -> {
            return a + b;
        };

        Calclator additionLanbda2 = (a, b) -> {
            return a + b;
        };

        Calclator additionLanbda3 = (a, b) -> a + b;

        int result = addition.calc(10, 20);
        int result2 = additionLanbda.calc(30, 40);
        System.out.println(result);
        System.out.println(result2);
    }
}
