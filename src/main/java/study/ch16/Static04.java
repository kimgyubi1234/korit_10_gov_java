package study.ch16;

import lombok.AllArgsConstructor;
import lombok.Getter;

class AA {
    @Getter
    @AllArgsConstructor
    static class BB { //클래스 안의 클래스 >> 내부 클래스(BB가 내부 클래스다)
        private String name;
    }
    @Getter
    @AllArgsConstructor
    class CC {
        private String text;
    }
}

public class Static04 {
    public static void main(String[] args) {
        AA a = new AA();
        AA.BB b = new AA.BB("이름");
        AA.CC c = (new AA()).new CC("문자열");
        AA.CC c2 = a.new CC("문자열");
        b.getName();
        c.getText();
    }
}
