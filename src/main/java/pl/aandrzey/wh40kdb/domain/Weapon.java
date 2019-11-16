package pl.aandrzey.wh40kdb.domain;

import com.fasterxml.jackson.databind.JsonSerializable;
import lombok.Getter;
import lombok.Setter;
import pl.aandrzey.wh40kdb.xml.Characteristic;
import pl.aandrzey.wh40kdb.xml.Profile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max = 100, message = "name of weapon is too long")
    @NotEmpty
    private String name;

    @Column(name = "max_range")

    @Size (max = 10, message = "range of weapon is too long")
    private String range;

    @Size(max = 20, message = "type of weapon is too long")
    private String type;

    @Size(max = 10, message = "strength of weapon is too long")
    private String strength;

    @Size(max = 10, message = "armour penetration of weapon is too long")
    private String armourPenetration;

    @Size(max = 10, message = "damage of weapon is too long")
    private String damage;

    @Size(max = 255, message = "ability of weapon is too long")
    private String ability;

    @Size(max = 100, message = "reference of weapon is too long")
    private String reference;

    @ManyToMany(mappedBy = "weapons")
    private List<Unit> units = new ArrayList<>();

    public static Weapon createWeaponFromProfile(Profile profile){
        List<Characteristic> characteristicsList = profile.getCharacteristics().getCharacteristic();
        Weapon weapon = new Weapon();
        weapon.name = profile.getName();
        weapon.range = characteristicsList.get(0).getValue();
        weapon.type = characteristicsList.get(1).getValue();
        weapon.strength = characteristicsList.get(2).getValue();
        weapon.armourPenetration = characteristicsList.get(3).getValue();
        weapon.damage = characteristicsList.get(4).getValue();
        weapon.ability = characteristicsList.get(5).getValue();

        return weapon;
    }
}
