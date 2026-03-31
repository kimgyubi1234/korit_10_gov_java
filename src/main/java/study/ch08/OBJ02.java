package study.ch08; //코드를 읽는 과정이 선행

public class OBJ02 {
    public static void main(String[] args) {
        class Addition { // mian이 진행되는 동안 class라는 틀이 살아있다 = 생성주기/생명주기
        int defaultNumber = 10;

        int add(int a, int b) {
            System.out.println("변수a:" + a);
            System.out.println("변수b:" + b);
            System.out.println("기본값: " + defaultNumber);
            return a + b + defaultNumber; //return의 값이 add1.add(100, 200)에 돌아간다
        }
      }

      Addition add1 = new Addition(); //new는 주소가 달라져도 class의 틀을 사용한다
        int num = 1000;
        int num2 = add1.add(100, 200);// add1.add(100,200)은 int 값이여야 함
        //add1에 add를 호출한다, .의 뜻은 넣는다, 참조한다
        int num3 = add1.add(400, 500);
        System.out.println(num+num2);
    }
} //정의와 선언은 mian에서 살아있다 -> 코드를 읽기 때문에 -> 이후에 코드 실행
