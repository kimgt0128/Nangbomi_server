package com.example.nangbomi.food;

import com.example.nangbomi.food_type.FoodType;
import com.example.nangbomi.refri.Refri;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "food")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    private FoodType type;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "register_date", nullable = false)
    private Instant registerDate;

    @Column(name = "expiration_date", nullable = false)
    private Instant expirationDate;

    @ColumnDefault("1")
    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Lob
    @Column(name = "comment")
    private String comment;

    @ColumnDefault("'Refrigerator'")
    @Lob
    @Column(name = "food_position", nullable = false)
    private String foodPosition;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "refri_id", nullable = false)
    private Refri refri;

}