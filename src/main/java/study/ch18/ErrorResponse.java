package study.ch18;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ErrorResponse {
    private int code;
    private Object body; // object 여러 자료형을 담을 수 있다

    public static <T> void print(T data) {
        System.out.println(data);
    }

    public static <T,R> R print2(T data, R returnData) {
        System.out.println(data);
        return returnData;
    }
}