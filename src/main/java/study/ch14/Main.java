package study.ch14;
// 모든 클래스는 object다
class
Animal {

}

class Duck extends Animal {
    // Animal이 Object를 상속받고 있어서 Duck도 Object도 상속을 받을 수 있다.
}

public class Main {
    public static void main(String[] args) {
        //최상위 클래스 (object) >> 자료형
        Object a = 10;
        Object b = 3.14;
        Object c = "김준일";
        Object d = 'a';
        Object e = new Animal();
        // Object는 상속을 해준다. 모든 클래스는 Object가 상속해준다

        // Wrapper Class (래퍼 클래스)
        Integer integer = (Integer)10; // 일반 자료형 -> 클래스 자료형 (Boxing)
        int i = (int)integer; // 클래스 자로형 -> 일반 자료형 (Unboxing)
        // 자바는 Boxing, Unboxing이 자동 -> AutoBoxing

        // int 12 = null; -> null 대입 불가능
        Integer integer2 = null;

        // System.out.println(a + b); >> 오브젝트는 숫자의 기능을 가지고 있지 않다.
        System.out.println((int)a + (double)b); // Unboxing이 됨
    }
}
