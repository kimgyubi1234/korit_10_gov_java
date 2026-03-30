package study.ch07;

public class Main5 {
public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
        if (i % 2 == 0) {
            continue; // for문에 돌아가서 증감한다.
        }
        System.out.println("i: " + i);
    }

    int i = 0;
    while (i  < 10) {
        int ii = i++;
        if (ii % 2 != 0){
            continue;
        }
        System.out.println("i: " + ii);
      }
    }
}

