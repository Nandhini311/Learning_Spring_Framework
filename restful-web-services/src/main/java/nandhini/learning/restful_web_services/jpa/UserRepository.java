package nandhini.learning.restful_web_services.jpa;

import nandhini.learning.restful_web_services.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    void removeUserById(int id);
}
