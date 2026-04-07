package study.ch08.entity;
//다음 요구사항을 만족하는 `BankAccount` 클래스를 작성하시오.
//
//- 필드: `String owner`, `int balance`
//- 생성자: 소유자와 초기 잔액을 받아 초기화
//- 메서드: `void deposit(int amount)` — 입금
//- 메서드: `void withdraw(int amount)` — 출금 (잔액 부족 시 "잔액 부족" 출력)
//- 메서드: `void printBalance()` — "소유자: 잔액원" 출력

class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(int amount) {
        balance += amount;
    }

    void withdraw(int amount) {
        if (balance < amount) {
            System.out.println("잔액 부족");
        } else {
            balance -= amount;
        }
    }

    void printBalance() {
        System.out.println(owner + ": " + balance + "원");
    }
}

public class Ex06 {
}
