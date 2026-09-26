package co.d3vlin.elementalmonsterduel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "element_translation")
@Getter
@Setter
public class ElementTranslationEntity {

    @EmbeddedId
    private ElementTranslationId id;

    @Column(name = "label", nullable = false, length = 40)
    private String label;
}
