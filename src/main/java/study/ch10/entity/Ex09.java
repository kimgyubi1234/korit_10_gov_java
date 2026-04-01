package study.ch10.entity;

public class Ex09 {
    // 배열에서 값 23을 검색해 인덱스를 출력하고 없으면 "찾을 수 없음"을 출력하시오
    public static void main(String[] args) {
        int [] arr = {15, 42, 8, 23, 37};
        int target = 23;
        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) { idx = i; break; }
        }
        if (idx != -1) System.out.println(target + "은(는) 인덱스 " + idx + "에 위치");
        else System.out.println("찾을 수 없음");
    }
}
