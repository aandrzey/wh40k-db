package pl.aandrzey.wh40kdb.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(name = "max_range")
    private Integer range;
    private String type;
    private String strength;
    private String armourPenetration;
    private String damage;
    private String ability;
    private String reference;
    @ManyToMany(mappedBy = "weapons")
    private List<Unit> units = new ArrayList<>();
}
