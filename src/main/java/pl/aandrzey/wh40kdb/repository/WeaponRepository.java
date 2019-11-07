package pl.aandrzey.wh40kdb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.aandrzey.wh40kdb.domain.Weapon;

public interface WeaponRepository extends JpaRepository<Weapon, Long> {
}
