package ao.com.angotech.repositories;

import ao.com.angotech.model.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

    List<Challenge> findByCategory(String category);
}
