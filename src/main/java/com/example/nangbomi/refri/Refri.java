package com.example.nangbomi.refri;

import com.example.nangbomi.food.Food;
import com.example.nangbomi.user.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.List;

@Getter
@Setter
@Entity
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