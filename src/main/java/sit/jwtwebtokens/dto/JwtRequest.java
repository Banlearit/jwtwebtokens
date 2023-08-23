package sit.jwtwebtokens.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class JwtRequest implements Serializable {
    private String username;
    private String password;
    @Override
    public String toString() {
        return "JwtRequest{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
