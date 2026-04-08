package study.ch21.Ex;

import java.io.FileReader;
import java.io.IOException;

public class Ex07 {
    static void readFile(String path) throws IOException {
        FileReader fileReader = new FileReader(path);
    }

    public static void main(String[] args) {
        try {
            readFile("data.txt");
        } catch (IOException e) {
            System.out.println("출력되지 않습니다." + e.getMessage());
        }
    }
}

// 여기서 close()를 쓰던데 언제쓰지?
// 객체를 소멸 시킨다던데