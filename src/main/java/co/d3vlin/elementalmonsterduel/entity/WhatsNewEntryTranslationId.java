package co.d3vlin.elementalmonsterduel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class WhatsNewEntryTranslationId implements Serializable {

    @Column(name = "whats_new_entry_id", nullable = false)
    private Long whatsNewEntryId;

    @Column(name = "locale_id", nullable = false)
    private Long localeId;
}
