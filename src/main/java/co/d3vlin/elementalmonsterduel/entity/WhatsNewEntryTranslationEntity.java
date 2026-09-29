package co.d3vlin.elementalmonsterduel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "whats_new_entry_translation")
@Getter
@Setter
public class WhatsNewEntryTranslationEntity {

    @EmbeddedId
    private WhatsNewEntryTranslationId id;

    @Column(name = "title", nullable = false, length = 120)
    private String title;

    @Column(name = "body", nullable = false, length = 500)
    private String body;
}
