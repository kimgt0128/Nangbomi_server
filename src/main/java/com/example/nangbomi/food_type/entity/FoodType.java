package com.example.nangbomi.food_type.entity;

import com.example.nangbomi.food.entity.Food;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "food_type")
public class FoodType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id", nullable = false)
    private Long id;

    @Column(name = "type_name", nullable = false, length = 20)
    private String typeName;

    @Column(name = "type_code", nullable = false, length = 20)
    private String typeCode;

    @Column(name = "expiration_period")
    private LocalDate expirationPeriod;

    @Column(name = "information", length = 100)
    private String information;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Food> foods;

}