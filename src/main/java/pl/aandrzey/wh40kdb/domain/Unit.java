package pl.aandrzey.wh40kdb.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Unit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Faction faction;
    private String name;
    private Integer minModelCount;
    private Integer maxModelCount;
    @ManyToMany
    private List<ModelStats> modelStats = new ArrayList<>();
    @ManyToMany
    private List<Weapon> weapons = new ArrayList<>();
    @ManyToMany
    private List<Ability> abilities = new ArrayList<>();
}
