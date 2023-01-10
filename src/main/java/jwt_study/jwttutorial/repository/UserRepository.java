package jwt_study.jwttutorial.repository;

import jwt_study.jwttutorial.Entity.Authority;
import jwt_study.jwttutorial.Entity.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //fecth join 수행
    @EntityGraph(attributePaths = "authorities")
    Optional<User> findOneWithAuthoritiesByUsername(String username);

    User findUserByUsername(String username);
}
