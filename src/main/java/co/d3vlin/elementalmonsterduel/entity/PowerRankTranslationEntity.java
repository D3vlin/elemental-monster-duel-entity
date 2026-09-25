package co.d3vlin.elementalmonsterduel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "power_rank_translation")
@Getter
@Setter
public class PowerRankTranslationEntity {

    @EmbeddedId
    private PowerRankTranslationId id;

    @Column(name = "label", nullable = false, length = 40)
    private String label;
}
