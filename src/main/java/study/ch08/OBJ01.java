package study.ch08;

public class OBJ01 {
    public static void main(String[] args) {
        /**
         * 학생정보 100명을 저장하세요.
         * 이름, 나이
         */
//        String 이름1 = "김준일";
//        int 나이1 = 33;
//        String 이름2 = "김준이";
//        int 나이2 = 34;

        //밑의 학생은 자료형
        class 학생 { //class는 우리가 정의 가능. 자료형. 틀
            String 이름;
            int 나이;
            //변수에다 넣는 이유는 주소값을 유지하고 싶어서

            학생() { //생성자
                System.out.println("학생 한명 생성");
            }

            void printInfo () {
                System.out.println("name: " + 이름);
                System.out.println("age: " + 나이);
            }

            void increaseAge() {
                System.out.println("나이 한살 더 먹기");
                나이++;
            }
        }

        학생 학생1 = new 학생(); //학생개체, 생성함(우리가 만듬). 객체(없는걸 만들어냄)
        // new를 붙일때마다 별개의 객체(주소)가 생성됨
        학생1.이름 = "김준일";
        학생1.나이 = 33;
        학생1.printInfo();
        학생1.increaseAge();

        학생 학생2 = new 학생(); //new 학생은 변수이자 객체. 인스턴스
        학생2.이름 = "김준이";
        학생2.나이 = 34;
        학생2.printInfo();
        학생2.increaseAge();

    }
}
