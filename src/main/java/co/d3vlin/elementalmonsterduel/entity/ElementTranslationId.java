package co.d3vlin.elementalmonsterduel.entity;

import co.d3vlin.elementalmonsterduel.enums.Element;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@EqualsAndHashCode
public class ElementTranslationId implements Serializable {

    @Enumerated(EnumType.STRING)
    @Column(name = "element", nullable = false, length = 16)
    private Element element;

    @Column(name = "locale_id", nullable = false)
    private Long localeId;
}
