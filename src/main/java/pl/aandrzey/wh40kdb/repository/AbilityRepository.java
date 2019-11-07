package pl.aandrzey.wh40kdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.aandrzey.wh40kdb.domain.Ability;

public interface AbilityRepository extends JpaRepository<Ability, Long> {
}
