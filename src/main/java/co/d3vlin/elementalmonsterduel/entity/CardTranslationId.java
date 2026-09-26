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
public class CardTranslationId implements Serializable {

    @Column(name = "card_id", nullable = false)
    private Long cardId;

    @Column(name = "locale_id", nullable = false)
    private Long localeId;
}
