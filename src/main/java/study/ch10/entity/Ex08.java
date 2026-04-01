package study.ch10.entity;

public class Ex08 {
    //배열 역순 뒤집기. 순서를 실제로 뒤집어라
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length -1 -i] = temp;
        }
        for (int n : arr) System.out.println(n + " ");
    }
}
