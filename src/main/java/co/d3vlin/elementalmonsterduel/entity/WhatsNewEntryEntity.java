package co.d3vlin.elementalmonsterduel.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.Instant;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(schema = "public", name = "whats_new_entry")
@Getter
@Setter
public class WhatsNewEntryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "slug", nullable = false, length = 60, unique = true)
    private String slug;

    @Column(name = "published_at", nullable = false)
    private Instant publishedAt;
}
