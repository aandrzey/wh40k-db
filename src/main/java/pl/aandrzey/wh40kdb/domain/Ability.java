package pl.aandrzey.wh40kdb.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Ability {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String reference;
    @ManyToMany(mappedBy = "abilities")
    private List<Unit> units = new ArrayList<>();
}
