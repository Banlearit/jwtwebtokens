package sit.jwtwebtokens.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor

public class JwtResponse implements Serializable {

    private String jwttoken;
}
