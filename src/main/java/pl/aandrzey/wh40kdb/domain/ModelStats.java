package pl.aandrzey.wh40kdb.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class ModelStats {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer movement;
    private Integer weaponSkill;
    private Integer ballisticSkill;
    private Integer strength;
    private Integer toughness;
    private Integer wounds;
    private Integer attacks;
    private Integer leadership;
    private Integer save;
    private String reference;
    @ManyToMany(mappedBy = "modelStats")
    private List<Unit> units = new ArrayList<>();
}
