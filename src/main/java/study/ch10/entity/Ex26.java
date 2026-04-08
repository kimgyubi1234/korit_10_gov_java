package study.ch10.entity;

public class Ex26 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        int num = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = num++;
            }
        }
        for (int[] r : arr) {
            for (int n : r) {
                System.out.print(n + " ");
            } System.out.println();
        }
    }
}

//for (int[] row : arr) {
//for (int n : row) {
//        System.out.print(n + " ");
//    }System.out.println();
//
//}