package study.ch02;

public class Main {
    public static void main(String[] args) {
        String name = "김규비";
        char name1 = '김';
        System.out.println(name);
        //주석 : 소스코드 중간중간 메모를 남길 때 사용(프로그램 실행시 영향을 주지 않음)
        String name2 = /*"김" + "규" +*/ "비" + 2;
        System.out.println(name2); //(name2 + "\n")
        System.out.print("김\n");
        System.out.print("규");
        System.out.print("열\t");
        System.out.print("비");
    }
}
