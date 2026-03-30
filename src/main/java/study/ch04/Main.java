package study.ch04;

public class Main {

    public static void main(String[] args) {
        String name1 = "김규비"; //주소가 100
        String name2 = "김규비"; //주소가 100
        String name3 = new String("김규비"); //new가 주소를 새로 만들어 200
        boolean result1 = name1 == name2;
        boolean result2 = name1 == name3;
        boolean result3 = name1.equals(name3);
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3); //System.out.(name3.toString())
        System.out.println(result1);
        System.out.println(result2); // 데이터가 들어간 주소 값이 다름.
        System.out.println(result3);
    }
}
