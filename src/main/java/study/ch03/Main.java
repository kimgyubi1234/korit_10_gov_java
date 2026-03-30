package study.ch03;

public class Main {
    public static void main(String[] args) {
        // 증감연산
        int a = 10;
        System.out.println(a + 10);
        a += 1;
        System.out.println(a + 10);

        int b = 10;
        System.out.println(b++ + 10);
        System.out.println(b + 10);

        int c = 10;
        c += 1;
        System.out.println(c + 10);
        System.out.println(c + 10);

        int d = 10;
        System.out.println(++d + 10);
        System.out.println(d + 10);

        int e = 100;
        System.out.println(e);
        System.out.println(e++); //아직 증가가 일어나지 않음. 그래서 여전히 100.
        System.out.println(e++); //값을 대입까지 하고 있다
        System.out.println(e++);
        System.out.println(e++);
        System.out.println(e);

        int f = 1000;
        int g = f++;
        System.out.println(g);
        g = f; // 이때는 1001
        System.out.println(g);

        //비교 연산자
        System.out.println(10 > 5);
        boolean status = 10 > 5;
        System.out.println(status);
        boolean status2 = 10 + 2 > 10;

        int num = 5;
        boolean even = num % 2 ==0; //
    }
}