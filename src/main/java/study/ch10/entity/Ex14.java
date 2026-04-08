package study.ch10.entity;

public class Ex14 {
    public static void main(String[] args) {
        String [] arr = new String[] {"apple", "banana", "avocado", "cherry", "apricot"};
        for(String i : arr) {
            if (i.startsWith("a")) System.out.println(i);
        };
    }
}
