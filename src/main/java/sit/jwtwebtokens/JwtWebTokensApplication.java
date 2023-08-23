package sit.jwtwebtokens;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import sit.jwtwebtokens.properties.JwtProperties;

@SpringBootApplication
@EnableConfigurationProperties({
        JwtProperties.class
})
public class JwtWebTokensApplication {

    public static void main(String[] args) {
        SpringApplication.run(JwtWebTokensApplication.class, args);
    }

}
