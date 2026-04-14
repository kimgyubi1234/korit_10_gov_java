package study.ch13.ex;

class Printer {
    void print() {
        System.out.println("흑백 출력 중...");
    }
}

class ColorPrinter extends Printer {
    @Override
    void print() {
        super.print();
        System.out.println("컬러 변환 완료!");
    }
}

public class Ex05 {
}
