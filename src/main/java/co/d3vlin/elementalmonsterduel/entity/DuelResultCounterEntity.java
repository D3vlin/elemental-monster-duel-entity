package co.d3vlin.elementalmonsterduel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "duel_result_counter")
@Getter
@Setter
public class DuelResultCounterEntity {

    @Id
    @Column(name = "total", nullable = false)
    private Integer total;

    @Column(name = "wins", nullable = false)
    private Integer wins;

    @Column(name = "losses", nullable = false)
    private Integer losses;

    @Column(name = "draws", nullable = false)
    private Integer draws;

    @Column(name = "abandons", nullable = false)
    private Integer abandons;
}
