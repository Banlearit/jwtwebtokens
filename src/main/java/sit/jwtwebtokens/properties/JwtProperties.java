package sit.jwtwebtokens.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
// perfix คือ ชื่อที่เรา custom เอง ไปใช้ใน application.properties
// jwt.secret-key=awpodawk90-dawk0-dawdawd
// jwt.token-interval-in-hour=24
// ที่เราเอาตัวแปลไปไว้ใน application.properties เพราะ อยากให้มัน flexible (ยืดหยุ่น)
// เมื่อ spring run spring binding class จาก properties --> class
// เป้าหมายถึงเราอยากใช้ value
@ConfigurationProperties(prefix = "jwt")
@Data
public class JwtProperties {
    private String secretKey;
    private Integer tokenIntervalInHour;
}
