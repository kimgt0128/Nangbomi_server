package com.example.nangbomi.refri.entity;

import com.example.nangbomi.food.entity.Food;
import com.example.nangbomi.user.entity.User;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.List;
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "refri")
public class Refri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "refri_name", nullable = false, length = 20)
    private String refriName;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "refri_created_time", nullable = false)
    private Instant refriCreatedTime;

    @OneToMany(mappedBy = "refri", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Food> foods;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}