package study.ch17;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
    public boolean getUsername;
    private Long id;
    private String username;
    private String password;
}
