package study.ch08.entity;

class Account {
    public String owner;
    private int balance;
    int level;  // default 접근제한자

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        this.level = 1;
    }
}

public class Ex17 {
    public static void main(String[] args) {
        Account a = new Account("김자바", 10000);
        System.out.println(a.owner);    // ① public로 어디서든 접근 가능
        //System.out.println(a.balance);  // ② private로 balance가 같은 클래스 내부에만 접근 되어서
        System.out.println(a.level);    // ③ default라서 같은 패키지 안에서만 접근 가능
    }
}