package pl.aandrzey.wh40kdb.loader.impl;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.aandrzey.wh40kdb.domain.Weapon;
import pl.aandrzey.wh40kdb.loader.CSVLoader;
import pl.aandrzey.wh40kdb.service.WeaponService;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

@Component
public class WeaponCSVLoader implements CSVLoader {

    private WeaponService weaponService;

    @Autowired
    public WeaponCSVLoader(WeaponService weaponService) {
        this.weaponService = weaponService;
    }

    @Override
    public void loadData() {
        if (weaponService.count() == 0) {

            Charset charset = StandardCharsets.UTF_8;
            File initialFile = new File("data/weapons.csv");

            int rowNumber = 1;
            try (CSVParser csvParser = CSVParser.parse(initialFile, charset, CSVFormat.DEFAULT
                    .withFirstRecordAsHeader()
                    .withIgnoreHeaderCase()
                    .withTrim())
            ) {
                for (CSVRecord record : csvParser) {
                    Weapon weapon = new Weapon();
                    weapon.setName(record.get("name"));
                    weapon.setRange(getInteger(record, "range", rowNumber));
                    weapon.setType(record.get("type"));
                    weapon.setStrength(record.get("strength"));
                    weapon.setArmourPenetration(record.get("armour penetration"));
                    weapon.setDamage(record.get("damage"));
                    weapon.setAbility(record.get("ability"));
                    weapon.setReference(record.get("reference"));
                    validate(weapon);
                    weaponService.save(weapon);
                    rowNumber++;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
