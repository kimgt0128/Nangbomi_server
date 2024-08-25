package com.example.nangbomi.food.entity;

import com.example.nangbomi.food_type.entity.FoodType;
import com.example.nangbomi.refri.entity.Refri;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
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

    @Convert(converter = FoodPositionConverter.class)
    @Column(name = "food_position", nullable = false)
    private FoodPosition foodPosition;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "refri_id", nullable = false)
    private Refri refri;

}