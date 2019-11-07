package pl.aandrzey.wh40kdb.domain;

import com.fasterxml.jackson.databind.JsonSerializable;
import lombok.Getter;
import lombok.Setter;

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

    @Size(max = 30, message = "name of weapon is too long")
    @NotEmpty
    private String name;

    @Column(name = "max_range")

    @Min(value = 0)
    private Integer range;

    @Size(max = 20, message = "type of weapon is too long")
    private String type;

    @Size(max = 10, message = "strength of weapon is too long")
    private String strength;

    @Size(max = 10, message = "armour penetration of weapon is too long")
    private String armourPenetration;

    @Size(max = 10, message = "damage of weapon is too long")
    private String damage;

    @Size(max = 100, message = "ability of weapon is too long")
    private String ability;

    @Size(max = 100, message = "reference of weapon is too long")
    private String reference;

    @ManyToMany(mappedBy = "weapons")
    private List<Unit> units = new ArrayList<>();
}
