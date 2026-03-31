package study.ch08;

public class OBJ04 {
    public static void main(String[] args) {
        class Addition {
            void add(int a) {
            }

            void add(double b) {
            }

            void add(int a, double b) {
            }

            void add(double a, int b) {
            } //위와 순서가 달라도 출력가능

            int add(int a, int b, int c) {
                return a + b + c;
            }

            String add(int a, int b, int c, int d) {
                return "" + a + b + c;
            }
            // 즉 오버로딩은 이름은 같으면서 매개변수가 달라야한다. 앞의 리턴타입은 중요하지 않음
            //
        }

        Addition aaa = new Addition();
        aaa.add(10);
        int r1 = aaa.add(1, 2, 3);
        aaa.add(1, 2, 3);
    }

}
