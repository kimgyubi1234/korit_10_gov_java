package study.ch16.Ex;

class Box<T> {
    private T item;

    public void set(T item) {this.item = item;}
    public T get() {return item;}
    public boolean isEmpty() {return item == null;}
}

public class Ex19 {
}
