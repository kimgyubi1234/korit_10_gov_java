package study.ch19;

import java.util.*;

public class ListMain {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        //값 추가
        numList.add(100);

        // 해당 인덱스 위치에 값 추가
        numList.add(0, 200);

        //값 조회
        Integer n1 = numList.get(1);
        System.out.println(n1);


        //여러 값 한번에 추가
        ArrayList<Integer> numList2 = new ArrayList<>();
        numList2.add(1000);
        numList2.add(2000);
        numList2.add(3000);
        numList.addAll(numList2);
        System.out.println(numList);
        numList.addAll(1, numList2);
        System.out.println(numList);

        boolean hasFound = numList.contains(2000);
        System.out.println(hasFound);

        for (int i = 0; i < numList.size(); i++) {
            System.out.println(numList.get(i));
        }

        for (Integer num : numList) {
            System.out.println(num);
        }

        // 성능은 array가 빠름. 성능을 활용하고 싶을때
        List<String> strList = new ArrayList<>();
        strList.add("a");
        strList.add("b");
        strList.add("c");
        strList.add("d");
        System.out.println(strList);

        // 메모리가 떨어져 있음. 순서와 주소를 알지만 찾아 가는데 시간이 걸림. 공간 제약이 없음
        // 메모리를 활용하고 싶을때
        List<String> strList2 = new LinkedList<>();
        strList2.add("a");
        strList2.add("b");
        strList2.add("c");
        strList2.add("d");
        System.out.println(strList2);

        // 추가수정이 필요없는 경우. 불변으로 쓰고 싶을 때 사용
        List<String> imStrList = List.of("a", "b", "c", "d");
        // imStrList.add("e");
        // System.out.println(imStrList); >> 컴파일 에러 뜸
        // 그럼에도 사용하고 싶은 경우
        List<String> nonImStrList = new LinkedList<>();
        nonImStrList.addAll(imStrList);
        nonImStrList.add("e");
        System.out.println(nonImStrList);
        List<String> nonImStrList2 = new ArrayList<>(List.of("A", "b", "c"));
        System.out.println(nonImStrList2);
    }
}
