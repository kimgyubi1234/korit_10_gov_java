package study.ch19;

import lombok.Getter;

import java.util.Arrays;
import java.util.Spliterator;

public class SimpleArrayList {
    @Getter
    private String[] strs;

    public SimpleArrayList() {
        strs = new String[0];
    }

    public void add (String str) {
        String[] newStrs = new String[strs.length + 1];
        for (int i = 0; i < strs.length; i++) {
            newStrs[i] = strs[i];
        }
        newStrs[newStrs.length - 1] = str;
        this.strs = newStrs;
    }

    public void add (int index, String str) {
        String[] newStrs = new String[strs.length + 1];
        for (int i = 0; i < strs.length; i ++) {
            int currentIndex = i < index ? i : i + 1;
            newStrs[currentIndex] = strs[i];
        }
        newStrs[index] = str;
        strs = newStrs;
    }

    public void pop () {
        if (strs.length < 1) {
            return;
        }
        String[] newStrs = new String[strs.length - 1];
        for (int i = 0; i < newStrs.length -1; i++) {
            newStrs[i] = strs[i];
        }
        this.strs = newStrs;
    }

    public void remove(int index) {
        if (strs.length < 1) {
            return;
        }
        String[] newStrs = new String[strs.length -1 ];
        for (int i = 0; i < newStrs.length -1; i++) {
            int currentIndex = i < index ? i : i + 1;
            newStrs[i] = strs[currentIndex];
        }
        strs= newStrs;
    }

    public void remove(String str) {
        int foundIndex = -1;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].equals(str)) {
                foundIndex = i;
                break;
            }
        }
        if (foundIndex == -1) {
            return;
        }
        remove(foundIndex);
    }
}

class SimpleArrayListMain {
    public static void main(String[] args) {
        SimpleArrayList list= new SimpleArrayList();
        list.add("김준일");
        list.add("김준이");
        list.add(1, "김준삼");
        list.add("김준사");
        System.out.println(Arrays.toString(list.getStrs()));
        list.pop();
        System.out.println(Arrays.toString(list.getStrs()));
        list.add("test");
        list.add("test");
        list.add("test");
        System.out.println(list.getStrs());
        list.remove(2);
        System.out.println(list.getStrs());
        list.remove("test");
        System.out.println(Arrays.toString(list.getStrs()));
    }
}