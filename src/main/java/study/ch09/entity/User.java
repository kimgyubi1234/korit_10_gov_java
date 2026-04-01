package study.ch09.entity;

public class User {
    private String username; // 사용자이름- 아이디
    private String password; // 비밀번호
    private String name; // 회원명

    public User(String username, String passtword, String name) {
        this.username = username;
        this.password = passtword;
        this.name = name;
    }

    public User(String username, String password) {
        this(username, password, "공백");
    }

    public User(String username) {
        this(username, "1234", "공백");
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name.substring(0, name.length() - 1);
        // 김 준 일 님 - 4글자
        // 0  1  2  3
    }
    public String getUsername() {
        return username;
    }

    public void setName(String name) {
        this.name = name + "님";
    }
}
