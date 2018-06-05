package club.leva.messageboard.repository;

import club.leva.messageboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserJpaRepository extends JpaRepository<User, Long>
{

    @Query(value = "from User u where u.username =: username")
    List<User> findByName(String username);

}
