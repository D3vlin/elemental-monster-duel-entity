package co.d3vlin.elementalmonsterduel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "card_translation")
@Getter
@Setter
public class CardTranslationEntity {

    @EmbeddedId
    private CardTranslationId id;

    @Column(name = "lore", nullable = false, length = 300)
    private String lore;
}
