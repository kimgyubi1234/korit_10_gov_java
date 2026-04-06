package study.ch16;

import lombok.Builder;

@Builder
class UserEntity2 {
    private String username;
    private String password;
}

public class BuilderMain {
    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity("aaa", "1234", "김준일", "aa@gmil.com");
        UserEntity userEntity2 = new UserEntity("aaa", null, null, "aa@gmil.com");
        UserEntity userEntity3 = new UserEntity();
        userEntity3.setUsername("bbb");
        UserEntity userEntity4 = UserEntity.builder()
                .username("ccc")
                .passwored("1111")
                .name("김준일")
                .email("cc@gmail.com")
                .build();
    }
}
