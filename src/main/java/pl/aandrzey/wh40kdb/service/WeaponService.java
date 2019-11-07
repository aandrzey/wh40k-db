package pl.aandrzey.wh40kdb.service;

import pl.aandrzey.wh40kdb.domain.Weapon;

public interface WeaponService {

    Long count();
    void save(Weapon weapon);

}
