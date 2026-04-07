package study.ch08.entity;

public class Ex04 {
    public static void main(String[] args) {
        class Book {
            String title;
            int price;

            Book(String title, int price) {
                this.title = title;
                this.price = price;
            }

            void printInfo() {
                System.out.println(title + " - " + price + "원");
            }
        }

        class Main {
            public void main(String[] args) {
                Book b = new Book("자바의 정석", 35000);
                b.printInfo();
            }
        }
    }
}