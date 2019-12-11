package pl.aandrzey.wh40kdb.loader.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.aandrzey.wh40kdb.domain.Weapon;
import pl.aandrzey.wh40kdb.loader.XMLLoader;
import pl.aandrzey.wh40kdb.service.WeaponService;
import pl.aandrzey.wh40kdb.xml.Catalogue;
import pl.aandrzey.wh40kdb.xml.Profile;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@Component
public class TauXMLLoader implements XMLLoader {

    WeaponService weaponService;

    @Autowired
    public TauXMLLoader(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @Override
    public void loadData() {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalogue.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Catalogue catalogue = (Catalogue) jaxbUnmarshaller.unmarshal(new File("data/T'au Empire.cat"));

            System.out.println(catalogue.getAuthorName());

            for (Profile profile :
                    catalogue.getSharedProfiles().getProfile()) {
                switch (profile.getTypeName()) {
                    case "Weapon":
                        Weapon weapon = Weapon.createWeaponFromProfile(profile);
                        weaponService.save(weapon);
                        System.out.println("Loaded " + weapon.getName());
                        break;
                }
            }
        } catch (JAXBException e) {
            System.out.println("error");
            e.printStackTrace();
        }

    }
}
