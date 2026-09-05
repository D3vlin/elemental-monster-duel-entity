package co.d3vlin.elementalmonsterduel.entity;

import co.d3vlin.elementalmonsterduel.enums.Element;
import co.d3vlin.elementalmonsterduel.enums.PowerRank;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "card")
@Getter
@Setter
public class CardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "element", nullable = false, length = 16)
    private Element element;

    @Enumerated(EnumType.STRING)
    @Column(name = "power_rank", nullable = false, length = 32)
    private PowerRank powerRank;

    @Column(name = "atk", nullable = false)
    private Integer atk;

    @Column(name = "armor", nullable = false)
    private Integer armor;

    @Column(name = "life", nullable = false)
    private Integer life;

    @Column(name = "seal", nullable = false)
    private Integer seal;

    @Column(name = "lore", nullable = false, length = 300)
    private String lore;
}
