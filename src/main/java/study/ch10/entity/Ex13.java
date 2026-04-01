package study.ch10.entity;

public class Ex13 {
    //for each로 음수 개수를 세어 출력하라
    public static void main(String[] args) {
        int [] arr = {5, -3, 8, -1, 0, -7, 4};
        int count = 0;
        for(int n : arr) {
            if (n < 0) count++;
        }
        System.out.println("음수 개수: " + count);
    }
}
