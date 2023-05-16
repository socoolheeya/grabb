package com.brownee.grabb.domain.cards.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;

@Getter
@Entity
@Table(name = "label")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LabelEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "label_id")
    BigInteger id;
    @Column(name = "title")
    String title;
    @Column(name = "color")
    String color;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    CardEntity cardEntity;

}
