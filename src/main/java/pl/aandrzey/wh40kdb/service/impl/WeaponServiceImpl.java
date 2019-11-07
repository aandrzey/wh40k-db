package pl.aandrzey.wh40kdb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.aandrzey.wh40kdb.domain.Weapon;
import pl.aandrzey.wh40kdb.repository.WeaponRepository;
import pl.aandrzey.wh40kdb.service.WeaponService;

@Service
public class WeaponServiceImpl implements WeaponService {

    private WeaponRepository weaponRepository;

    @Autowired
    public WeaponServiceImpl(WeaponRepository weaponRepository) {
        this.weaponRepository = weaponRepository;
    }

    @Override
    public Long count() {
        return weaponRepository.count();
    }

    @Override
    public void save(Weapon weapon) {
        weaponRepository.save(weapon);
    }
}
