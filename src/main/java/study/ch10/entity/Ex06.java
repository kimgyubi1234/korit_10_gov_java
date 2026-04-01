package study.ch10.entity;

public class Ex06 {
    //홀수 개수 세기
    public static void main (String[] args) {
        int [] arr = {5, 12, 3, 18, 7, 21, 9, 14};
        int count = 0; // if문에 있던 count가 여기서 증가 됨
        for (int i : arr) {
            if (i % 2 != 0) count++; //it문이 true라서 count++이 성립됨
        }
        System.out.println("홀수 개수: " + count);
    }
}
