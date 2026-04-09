package study.ch22;

import jdk.swing.interop.SwingInterOpUtils;

class HomeButton implements ButtonClick {
    @Override
    public void onClick() {
        System.out.println("홈으로 이동");
    }
}

class BackButton implements ButtonClick {
    @Override
    public void onClick() {
        System.out.println("뒤로 이동");
    }
}

class LoginButton implements ButtonClick {
    @Override
    public void onClick() {
    }
}


public class ButtonMain {
    public static void main (String[]args){
        ButtonClick btn1 = new HomeButton();
        ButtonClick btn2 = new BackButton();
        ButtonClick btn3 = new LoginButton();
        ButtonClick btn4 = new ButtonClick() {
            @Override
            public void onClick() {
                System.out.println("로그인 요청");
            }
        };
        ButtonClick btn5 = () -> System.out.println("로그인 요청");
        //ButtonClick btn5가 인터페이스가 됨
        // -> 뒤는 객체 생성, 정의와 동시에 new (객체생성)까지 포함

        btn1.onClick();
        btn2.onClick();
        btn3.onClick();
        btn4.onClick();
    }
}
