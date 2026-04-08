package study.ch21.Ex;

public class Ex13 {
    public static void main(String[] args) {
        class InvalidAgeException extends RuntimeException {
            private int age;
            InvalidAgeException(String message ,int age) {
                super(message);
                this.age = age;
            }
            int getAge() {return age;}
        }
    }
}
