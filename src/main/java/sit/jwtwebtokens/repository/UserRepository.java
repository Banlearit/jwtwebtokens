package sit.jwtwebtokens.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sit.jwtwebtokens.entitys.UserDetail;

public interface UserRepository extends JpaRepository<UserDetail, Integer> {
    UserDetail findByUsername(String username);
}
